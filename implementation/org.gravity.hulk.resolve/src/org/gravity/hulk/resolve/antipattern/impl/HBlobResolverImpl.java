/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
// [user defined imports] -->
// <-- [user defined imports]
import org.gravity.hulk.annotations.resolve.Hulk_DontTouch;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculator;
import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.refactoringgraph.refactorings.HExtractClass;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.refactorings.impl.ExtractClass;
import org.gravity.refactorings.impl.MoveMember;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HBlob
 * Resolver</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getExecutedMoves
 * <em>Executed Moves</em>}</li>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getOriginal_apg
 * <em>Original apg</em>}</li>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getCopy_apg
 * <em>Copy apg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBlobResolverImpl extends HDetectorImpl implements HBlobResolver {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(HBlobResolverImpl.class);

	/**
	 * The cached value of the '{@link #getExecutedMoves() <em>Executed Moves</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getExecutedMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<HMoveMethod> executedMoves;

	/**
	 * The cached value of the '{@link #getOriginal_apg() <em>Original apg</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getOriginal_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph original_apg;

	/**
	 * The cached value of the '{@link #getCopy_apg() <em>Copy apg</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCopy_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph copyApg;

	protected HBlobResolverImpl() {
		this.executedMoves = new BasicEList<>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HBlobResolverImpl(final DFSGraph graph, final HMethodToDataClassAccessCalculator m2dc,
			final HInBlobAccessCalculator iba, final HAfferentCouplingCalculator haff,
			final HEfferentCouplingCalculator heff) {
		this();
		final var edgeBm2dc = DfsFactory.eINSTANCE.createEdge();
		final var edgeIBA = DfsFactory.eINSTANCE.createEdge();
		final var haffEdge = DfsFactory.eINSTANCE.createEdge();
		final var heffEdge = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edgeBm2dc.setGraph(graph);
		this.getOutgoing().add(edgeBm2dc);
		m2dc.getIncoming().add(edgeBm2dc);
		edgeIBA.setGraph(graph);
		iba.getIncoming().add(edgeIBA);
		this.getOutgoing().add(edgeIBA);
		haff.getIncoming().add(haffEdge);
		this.getOutgoing().add(haffEdge);
		haffEdge.setGraph(graph);
		heff.getIncoming().add(heffEdge);
		this.getOutgoing().add(heffEdge);
		heffEdge.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HMoveMethod> getExecutedMoves() {
		return this.executedMoves;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getOriginal_apg() {
		return this.original_apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOriginal_apg(final HAntiPatternGraph newOriginal_apg) {
		this.original_apg = newOriginal_apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getCopy_apg() {
		return this.copyApg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCopy_apg(final HAntiPatternGraph newCopy_apg) {
		this.copyApg = newCopy_apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		final var newApg = this.init(apg);
		if (newApg == null) {
			throw new IllegalStateException("Couldn't initialize APG.");
		}
		// ForEach
		for (final HBlobAntiPattern blob : this.pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(newApg)) {
			final var tClass = (TClass) blob.getTAnnotated();
			final var annotation = this.getResolveBlobAnnotation(newApg, blob, tClass);

			//
			if (this.allowedToTouch(tClass)) {
				this.resolve(apg, tClass, annotation);
			} else {
				EcoreUtil.delete(annotation);
			}

		}
		return true;
	}

	/**
	 * Resolves the blob in the class
	 *
	 * @param apg
	 * @param tClass
	 * @param annotation
	 */
	private void resolve(final HAntiPatternGraph apg, final TClass tClass, final HBlobResolveAnnotation annotation) {
		for (final TMember tDefinition : tClass.getDefines()) {
			if (this.allowedToTouch(tDefinition)) {
				//
				final var iba = HBlobResolverImpl.searchInBlobAccess(tDefinition);
				if (iba != null) {

					final var ibaRelative = iba.getRelativeAmount();
					if (!ibaRelative.getValue().equals(HRelativeValueConstants.VERY_LOW)
							&& !ibaRelative.getValue().equals(HRelativeValueConstants.LOW)) {
						continue;

					}
					// ForEach
					for (final TAnnotation tmpM2dc : tDefinition.getTAnnotation()) {
						if (tmpM2dc instanceof final HMethodToDataClassAccess m2dc) {
							//
							final var m2dcRelative = m2dc.getRelativeAmount();
							if ((m2dcRelative != null)
									&& m2dcRelative.getValue().equals(HRelativeValueConstants.VERY_HIGH)) {

								final var tTargetClass = m2dc.getHDataClass();
								final EList<TMember> tContainer = new BasicEList<>();
								tContainer.add(tDefinition);

								//
								final var hMoves = this.createMove(tContainer, tClass, tTargetClass, annotation);
								if (hMoves != null) {
									continue;
								}

							}

							final var extract = this.createExtractClassAnnotation(tDefinition, annotation, apg,
									iba);

							//
							if (!this.isRefactoringPossible(extract)) {
								EcoreUtil.delete(extract);
							}

						}
					}
				}

			}

		}
		if (annotation.getHMoves().isEmpty()) {
			// We found no solution
			EcoreUtil.delete(annotation);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRefactoringPossible(final HRefactoring refactoring) {
		// [user code injected with eMoflon]
		if (refactoring instanceof final HMoveMethod r) {
			final var tTargetClass = r.getTargetClass();
			final var tSourceClass = r.getSourceClass();

			for (final TSignature s : r.getTSignature()) {
				if (s.getSignatureString().startsWith("get") || s.getSignatureString().startsWith("set")
						|| !this.move.isApplicable(s, tTargetClass, tSourceClass)) {
					return false;
				}
			}
			return true;
		}
		if (refactoring instanceof final HExtractClass extractClass) {
			final var config = new ExtractClassConfiguration(extractClass.getTMembers(),
					"ExtractedClass" + System.currentTimeMillis());
			final var r = new ExtractClass();
			return r.isApplicable(config);
		}
		LOGGER.error("HBlobResolverImpl: Unkown refactoring type: " + refactoring);
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMoveMembers createMove(final EList<TMember> members, final TClass source, final TClass target,
			final HBlobResolveAnnotation parent) {
		// [user code injected with eMoflon]
		final Set<HMoveMember> allMoves = new HashSet<>();
		for (final TMember definition : members) {
			if (!definition.getSignatureString().startsWith("get")
					&& !definition.getSignatureString().startsWith("set")) {
				if (!this.move.isApplicable(definition.getSignature(), target, source)) {
					return null;
				}
				HMoveMember hMove;
				if (definition instanceof TMethodDefinition) {
					hMove = RefactoringsFactory.eINSTANCE.createHMoveMethod();
				} else if (definition instanceof TFieldDefinition) {
					hMove = RefactoringsFactory.eINSTANCE.createHMoveField();
				} else {
					LOGGER.error("HBlobResolver: Unknown Member Tye: " + definition);
					return null;
				}
				hMove.setApg(this.copyApg);
				this.copyApg.getHAnnotations().add(hMove);

				hMove.setTAnnotated(definition);
				definition.getTAnnotation().add(hMove);

				hMove.setSourceClass(source);
				hMove.setTargetClass(target);
				hMove.getTSignature().add(definition.getSignature());
				hMove.setChanged(false);

				for (final TAnnotation tAnnotation : definition.getTAnnotation()) {
					if (tAnnotation instanceof HInBlobAccess) {
						hMove.setIba((HInBlobAccess) tAnnotation);
					} else if (tAnnotation instanceof HMethodToDataClassAccess) {
						hMove.setM2dc((HMethodToDataClassAccess) tAnnotation);
					}
				}
				allMoves.add(hMove);
			}
		}
		final var refactoringFactory = RefactoringsFactory.eINSTANCE;
		if (!allMoves.isEmpty()) {
			final var hMoves = refactoringFactory.createHMoveMembers();
			hMoves.getHMoveMembers().addAll(allMoves);
			hMoves.setSourceClass(source);
			hMoves.setTargetClass(target);
			source.getTAnnotation().add(hMoves);
			parent.getHRefactorings().add(hMoves);
			return hMoves;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean allowedToTouch(final TAnnotatable element) {
		// [user code injected with eMoflon]
		final Set<TAnnotation> annotations = new HashSet<>(element.getTAnnotation());
		if (element instanceof final TMember member) {
			annotations.addAll(member.getDefinedBy().getTAnnotation());
		}
		for (final TAnnotation annotation : annotations) {
			final var type = annotation.getType();
			if ((type != null) && type.getTName().equalsIgnoreCase(Hulk_DontTouch.class.getName())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph init(final HAntiPatternGraph pg) {
		// [user code injected with eMoflon]
		this.original_apg = pg;
		this.copyApg = EcoreUtil.copy(pg);

		this.move = new MoveMember();

		return this.copyApg;
	}

	public final Iterable<HBlobAntiPattern> pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(
			final HAntiPatternGraph newApg) {
		final var result = new LinkedList<HBlobAntiPattern>();
		for (final HAnnotation tmpBlob : newApg.getHAnnotations()) {
			if (tmpBlob instanceof final HBlobAntiPattern blob) {
				final var tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					result.add(blob);
				}

			}
		}
		return result;
	}

	public final HBlobResolveAnnotation getResolveBlobAnnotation(final HAntiPatternGraph newApg,
			final HBlobAntiPattern blob, final TClass tClass) {
		final var annotation = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		blob.getPartOf().add(annotation);
		this.getHAnnotation().add(annotation);
		newApg.getHAnnotations().add(annotation);
		annotation.setHBlobAntiPattern(blob);
		annotation.setTAnnotated(tClass);
		return annotation;
	}

	public static final HInBlobAccess searchInBlobAccess(final TMember tDefinition) {
		for (final TAnnotation tmpIba : tDefinition.getTAnnotation()) {
			if (tmpIba instanceof HInBlobAccess) {
				return (HInBlobAccess) tmpIba;
			}
		}
		return null;
	}

	private final HExtractClass createExtractClassAnnotation(final TMember tDefinition,
			final HBlobResolveAnnotation annotation, final HAntiPatternGraph apg, final HInBlobAccess iba) {
		final var extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
		extract.getTMembers().add(tDefinition);
		extract.setTAnnotated(tDefinition);
		extract.getPartOf().add(annotation);
		apg.getHAnnotations().add(extract);
		extract.getPartOf().add(iba);
		annotation.getHRefactorings().add(extract);
		iba.getPartOf().add(extract);
		return extract;
	}

	// <-- [user code injected with eMoflon]

	private MoveMember move;

	@Override
	public String getGuiName() {
		return "Resolve Blob [Anti-Pattern]";
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHBlobResolveAnnotation();
	}

	// [user code injected with eMoflon] -->
} // HBlobResolverImpl