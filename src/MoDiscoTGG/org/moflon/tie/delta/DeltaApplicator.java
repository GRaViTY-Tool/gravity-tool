package MoDiscoTGG.org.moflon.tie.delta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import MoDiscoTGG.org.moflon.tie.delta.rules.CompilationUnit2ArtifactDeltaGenerator;
import MoDiscoTGG.org.moflon.tie.delta.rules.FieldDec2Property4ClassDeltaGenerator;
import MoDiscoTGG.org.moflon.tie.delta.rules.JavaPackageToUMLPackageDeltaGenerator;

public class DeltaApplicator implements DeltaGenerator {
	// @formatter:off
	private static final DeltaGenerator[] DELTA_GENERATORS = { 
			new CompilationUnit2ArtifactDeltaGenerator(),
			new FieldDec2Property4ClassDeltaGenerator(),
			new JavaPackageToUMLPackageDeltaGenerator(),
			
	};
	// @formatter:on

	private int deltaSizes;

	public DeltaApplicator(int deltaSizes) {
		this.deltaSizes = deltaSizes;
	}

	@Override
	public DeltaResult applyForward(IndexedModel<org.eclipse.gmt.modisco.java.Model> model, Random r) {
		int remainingSize = deltaSizes;
		List<EObject> result = new ArrayList<>();
		while (remainingSize > 0) {
			DeltaGenerator deltaGenerator = DELTA_GENERATORS[r.nextInt(DELTA_GENERATORS.length)];
			DeltaResult deltaResult = deltaGenerator.applyForward(model, r);
			if (deltaResult!=DeltaResult.EMPTY) {
				System.out.println(deltaGenerator.getClass().getSimpleName());
			}
			remainingSize -= deltaResult.getSize();
			result.addAll(Arrays.asList(deltaResult.getEntries()));
			model.addAll(deltaResult.getEntries());
		}
		return new DeltaResult(deltaSizes - remainingSize, result.toArray(new EObject[result.size()]));
	}

	@Override
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r) {
		int remainingSize = deltaSizes;
		List<EObject> result = new ArrayList<>();
		while (remainingSize > 0) {
			DeltaGenerator deltaGenerator = DELTA_GENERATORS[r.nextInt(DELTA_GENERATORS.length)];
			DeltaResult deltaResult = deltaGenerator.applyBackward(model, r);
			if (deltaResult!=DeltaResult.EMPTY) {
				System.out.println(deltaGenerator.getClass().getSimpleName());
			}
			remainingSize -= deltaResult.getSize();
			result.addAll(Arrays.asList(deltaResult.getEntries()));
			model.addAll(deltaResult.getEntries());
		}
		return new DeltaResult(deltaSizes - remainingSize, result.toArray(new EObject[result.size()]));
	}

	public void revert(DeltaResult deltaResult) {
		EObject[] entries = deltaResult.getEntries();
		for (int i = entries.length-1; i >= 0; i--) {
			EcoreUtil.delete(entries[i]);
		}
	}

	@Override
	public Set<Class<?>> getForwardInterests() {
		return Arrays.stream(DELTA_GENERATORS).map(DeltaGenerator::getForwardInterests).flatMap(Set::stream)
				.collect(Collectors.toSet());
	}

	@Override
	public Set<Class<?>> getBackwardInterests() {
		return Arrays.stream(DELTA_GENERATORS).map(DeltaGenerator::getBackwardInterests).flatMap(Set::stream)
				.collect(Collectors.toSet());
	}
}
