package MoDiscoTGG.org.moflon.tie.delta.rules;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;

import MoDiscoTGG.org.moflon.tie.delta.DeltaGenerator;
import MoDiscoTGG.org.moflon.tie.delta.DeltaResult;
import MoDiscoTGG.org.moflon.tie.delta.IndexedModel;

public class CompilationUnit2ArtifactDeltaGenerator implements DeltaGenerator {

	@Override
	public DeltaResult applyForward(IndexedModel<org.eclipse.gmt.modisco.java.Model> model, Random r) {
		CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		String name = Long.toString(r.nextLong(), 32);
		String originalFilePath = Long.toString(r.nextLong(), 32);
		compilationUnit.setName(name);
		compilationUnit.setOriginalFilePath(originalFilePath);
		model.getModel().getCompilationUnits().add(compilationUnit);
		return new DeltaResult(2, compilationUnit);
	}

	@Override
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r) {
		Artifact artifact = UMLFactory.eINSTANCE.createArtifact();
		String name = Long.toString(r.nextLong(), 32);
		String fileName = Long.toString(r.nextLong(), 32);
		artifact.setName(name);
		artifact.setFileName(fileName);
		((Model)model.getModel().getPackagedElement("source references")).getPackagedElements().add(artifact);
		return new DeltaResult(2, artifact);
	}

	@Override
	public Set<Class<?>> getForwardInterests() {
		return new HashSet<>();
	}

	@Override
	public Set<Class<?>> getBackwardInterests() {
		return new HashSet<>();
	}

}
