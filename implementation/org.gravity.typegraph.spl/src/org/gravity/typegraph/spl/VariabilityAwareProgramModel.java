package org.gravity.typegraph.spl;

import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.variability.multi.MultiVarEGraph;
import org.eclipse.emf.henshin.variability.multi.MultiVarProcessor;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.prop4j.Node;
import org.prop4j.NodeWriter;

import de.ovgu.featureide.fm.core.analysis.cnf.CNFCreator;
import de.ovgu.featureide.fm.core.analysis.cnf.Nodes;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;

public class VariabilityAwareProgramModel implements MultiVarProcessor<SplPackage, IFeatureModel> {

	private static final Logger LOGGER = Logger.getLogger(VariabilityAwareProgramModel.class);

	private Map<TAnnotatable, String> pcs;

	@Override
	public MultiVarEGraph createEGraphAndCollectPCs(final HenshinResourceSet set, final String model, final String fm) {
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(SplPackage.eNS_URI, SplPackage.eINSTANCE);
		final Resource resource = set.getResource(model);
		return createEGraphAndCollectPCs(resource, fm);
	}

	@Override
	public MultiVarEGraph createEGraphAndCollectPCs(final List<EObject> roots, final IFeatureModel fm) {
		this.pcs = new HashMap<>();
		for (final EObject root : roots) {
			if (root instanceof TypeGraph) {
				this.pcs.putAll(getPCs((TypeGraph) root));
			}
		}
		final String fmCNF = getCNF(fm);
		return new MultiVarEGraph(roots, new HashMap<>(this.pcs), fmCNF);
	}

	@Override
	public MultiVarEGraph createEGraphAndCollectPCs(final Resource resource, final String fm) {
		FMCoreLibrary.getInstance().install();
		final IFeatureModel featureModel = FeatureModelManager.load(Path.of(fm));
		return createEGraphAndCollectPCs(resource.getContents(), featureModel);
	}

	public MultiVarEGraph buildMultiVarGraph(final TypeGraph pm, final Path fmPath) {
		this.pcs = getPCs(pm);
		return new MultiVarEGraph(Collections.singletonList(pm), new HashMap<>(this.pcs), getFeatureModelCNF(fmPath));
	}

	private String getFeatureModelCNF(final Path path) {
		FMCoreLibrary.getInstance().install();
		final IFeatureModel featureModel = FeatureModelManager.load(path);
		return getCNF(featureModel);
	}

	/**
	 * @param featureModel
	 * @return
	 */
	private String getCNF(final IFeatureModel featureModel) {
		final Node nodes = Nodes.convert(CNFCreator.createNodes(featureModel));
		return nodes.toString(NodeWriter.shortSymbols);
	}

	private static HashMap<TAnnotatable, String> getPCs(final TypeGraph pm) {
		final HashMap<TAnnotatable, String> pcs = new HashMap<>();
		final TreeIterator<EObject> iterator = pm.eResource().getAllContents();
		while (iterator.hasNext()) {
			final EObject next = iterator.next();
			if (next instanceof TPresenceCondition) {
				final TPresenceCondition pc = (TPresenceCondition) next;
				pcs.merge((TAnnotatable) pc.eContainer(), pc.getPc(), (o, n) -> '(' + o + ") & (" + n + ')');
			}
		}
		return pcs;
	}

	@Override
	public void writePCsToModel(final MultiVarEGraph graphP) {
		final Map<TAnnotatable, String> oldPCs = this.pcs;
		this.pcs = new HashMap<>();
		for (final Entry<EObject, String> entry : graphP.getPCsAsStrings().entrySet()) {
			updatePC(entry.getKey(), entry.getValue(), oldPCs);
		}
		for(final TAnnotatable object : oldPCs.keySet()) {
			object.getTAnnotation().removeIf(TPresenceCondition.class::isInstance);
		}
	}

	private void updatePC(final EObject object, final String pc, final Map<TAnnotatable, String> old) {
		if (object instanceof TAnnotatable) {
			final TAnnotatable element = (TAnnotatable) object;
			final String oldPC = old.remove(element);
			if (oldPC == null) {
				if(addPC(element, pc)) {
					this.pcs.put(element, pc);
				}
			} else {
				final TPresenceCondition annotation = (TPresenceCondition) element
						.getTAnnotation(SplPackage.eINSTANCE.getTPresenceCondition());
				if (annotation == null) {
					if(addPC(element, pc)) {
						this.pcs.put(element, pc);
					}
				} else if (!oldPC.equals(pc)) {
					annotation.setPc(pc);
					this.pcs.put(element, pc);
				}
			}
		} else {
			LOGGER.error("PC on element of type " + object.eClass().getName() + "is not supported!");
		}
	}

	private boolean addPC(final TAnnotatable element, final String pc) {
		if ((pc == null) || pc.isBlank() || pc.trim().equalsIgnoreCase(Boolean.toString(true))) {
			return false;
		}
		final TPresenceCondition annotation = SplFactory.eINSTANCE.createTPresenceCondition();
		annotation.setPc(pc);
		element.getTAnnotation().add(annotation);
		return true;
	}

	@Override
	public SplPackage getEPackage() {
		return SplPackage.eINSTANCE;
	}

}
