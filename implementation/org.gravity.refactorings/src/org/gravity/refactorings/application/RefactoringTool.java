package org.gravity.refactorings.application;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.arte.testdsl.arteLanguage.Create_Superclass_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Extract_Superclass_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Java_Class;
import org.gravity.arte.testdsl.arteLanguage.Java_Field;
import org.gravity.arte.testdsl.arteLanguage.Java_Method;
import org.gravity.arte.testdsl.arteLanguage.Pull_Up_Field_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Pull_Up_Method_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Signature;
import org.gravity.refactorings.Changes;
import org.gravity.refactorings.Support;
import org.gravity.refactorings.impl.Create_SuperclassImpl;
import org.gravity.refactorings.impl.Extract_SuperclassImpl;
import org.gravity.refactorings.impl.Move_MethodImpl;
import org.gravity.refactorings.impl.Pull_Up_FieldImpl;
import org.gravity.refactorings.impl.Pull_Up_MethodImpl;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

public class RefactoringTool {

	private TypeGraph tool_pg;
	
	Pull_Up_MethodImpl pumRefactoring;
	Pull_Up_FieldImpl pufRefactoring;
	Move_MethodImpl momRefactoring;
	Create_SuperclassImpl cscRefactoring;
	Extract_SuperclassImpl escRefactoring;
	

	private List<org.gravity.arte.testdsl.arteLanguage.Refactoring> bookkeeping;
	private Set<String> changes;

	
	private void initRefactorings(){
		this.pumRefactoring = new Pull_Up_MethodImpl();
		this.pumRefactoring.setPg(this.tool_pg);
		
		this.pufRefactoring = new Pull_Up_FieldImpl();
		this.pufRefactoring.setPg(this.tool_pg);
		
		this.momRefactoring = new Move_MethodImpl();
		this.momRefactoring.setPg(this.tool_pg);
		
		this.cscRefactoring = new Create_SuperclassImpl();
		this.cscRefactoring.setPg(this.tool_pg);
		
		this.escRefactoring = new Extract_SuperclassImpl();
		this.escRefactoring.setPg(this.tool_pg);	
	}
	
	public RefactoringTool(TypeGraph pg, boolean copy) {
		if (copy) {
			this.tool_pg = EcoreUtil.copy(pg);
		} else {
			this.tool_pg = pg;
		}
		initRefactorings();
		this.bookkeeping = new LinkedList<>();
		this.changes = new HashSet<>();
	}

	public Changes executePlannedRefactorings(TypeGraph pg) {
		Changes change_container = new Changes();
		change_container.setChanged_classfiles(new HashSet<String>());
		Consumer<EObject> changes = SynchronizationHelper -> {
			RefactoringTool tool = new RefactoringTool(pg, false);
			tool.applyBookkeeping(this.bookkeeping);
			change_container.addChanged_classfiles(tool.getChanges());
		};
		change_container.setChanges(changes);
		return change_container;
	}

	public boolean applyPullUpMethod(Pull_Up_Method_Refactoring refactoring) {
		Java_Class java_parent = refactoring.getParent();
		TClass parent = getTClass(java_parent);
		if (parent == null) {
			return false;
		}
		// Search Method Name
		Java_Method java_method = refactoring.getMethod();

		TMethodSignature sig = getTMethodSignature(java_method);
		if (sig == null) {
			return false;
		}

		boolean pum_isApplicable = this.pumRefactoring.isApplicable(sig, parent);
		if (pum_isApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.pumRefactoring.perform(sig, parent)) {
				String classname = tClass.getTName() + ".java"; //$NON-NLS-1$
				TPackage p = tClass.getPackage();
				while (p != null) {
					classname = p.getTName() + "." + classname; //$NON-NLS-1$
					p = p.getParent();
				}
				if (!this.changes.contains(classname)) {
					this.changes.add(classname);
				}
			}
		}
		return pum_isApplicable;
	}

	public boolean applyPullupField(Pull_Up_Field_Refactoring refactoring) {
		Java_Class java_parent = refactoring.getParent();
		TClass parent = getTClass(java_parent);
		if (parent == null) {
			return false;
		}

		Java_Field java_field = refactoring.getField();

		TFieldSignature sig = getTFieldSignature(java_field);

		boolean pum_isApplicable = this.pufRefactoring.isApplicable(sig, parent);
		if (pum_isApplicable) {
			this.bookkeeping.add(refactoring);

			// Perform refactoring and record changed classes
			for (TClass tClass : this.pufRefactoring.perform(sig, parent)) {
				String classname = tClass.getTName() + ".java"; //$NON-NLS-1$
				TPackage p = tClass.getPackage();
				while (p != null) {
					classname = p.getTName() + "." + classname; //$NON-NLS-1$
					p = p.getParent();
				}
				if (!this.changes.contains(classname)) {
					this.changes.add(classname);
				}
			}
		}
		return pum_isApplicable;
	}

	public boolean applyCreateSuperclass(Create_Superclass_Refactoring refactoring) {
		List<TClass> tClasses = new LinkedList<TClass>();
		for (Java_Class c : refactoring.getChild().getClasses()) {
			TClass tClass = getTClass(c);
			if (tClass == null) {
				return false;
			}
			tClasses.add(tClass);
		}

		TClass new_parent = BasicFactory.eINSTANCE.createTClass();
		new_parent.setTName(refactoring.getTarget().getClass_name());

		TPackage leaf = null;
		for (String s : refactoring.getTarget().getPackage().split(Pattern.quote("."))) { //$NON-NLS-1$
			TPackage p = BasicFactory.eINSTANCE.createTPackage();
			p.setTName(s);
			if (leaf != null) {
				p.setParent(leaf);
			}
			leaf = p;
		}
		if (leaf != null) {
			new_parent.setPackage(leaf);
			leaf.getClasses().add(new_parent);
		}

		boolean csc_isApplicable = this.cscRefactoring.isApplicable(tClasses, new_parent);
		if (csc_isApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.cscRefactoring.perform(tClasses, new_parent)) {
				String classname = tClass.getTName() + ".java"; //$NON-NLS-1$
				TPackage p = tClass.getPackage();
				while (p != null) {
					classname = p.getTName() + "." + classname; //$NON-NLS-1$
					p = p.getParent();
				}
				if (!this.changes.contains(classname)) {
					this.changes.add(classname);
				}
			}
		}

		return csc_isApplicable;
	}

	public boolean applyExtractSuperclassRefactoring(Extract_Superclass_Refactoring refactoring) {
		List<TClass> tClasses = new LinkedList<TClass>();
		for (Java_Class c : refactoring.getChild().getClasses()) {
			TClass tClass = getTClass(c);
			if (tClass == null) {
				return false;
			}
			tClasses.add(tClass);
		}

		TClass new_parent = BasicFactory.eINSTANCE.createTClass();
		new_parent.setTName(refactoring.getTarget().getClass_name());

		TPackage leaf = null;
		for (String s : refactoring.getTarget().getPackage().split(Pattern.quote("."))) { //$NON-NLS-1$
			TPackage p = BasicFactory.eINSTANCE.createTPackage();
			p.setTName(s);
			if (leaf != null) {
				p.setParent(leaf);
			}
			leaf = p;
		}
		if (leaf != null) {
			new_parent.setPackage(leaf);
			leaf.getOwnedTypes().add(new_parent);
			leaf.getClasses().add(new_parent);
		}

		List<TSignature> tSignatures = new LinkedList<TSignature>();
		for (Signature sig : refactoring.getSignatures().getSignatures()) {
			TSignature tSig = getTSignature(sig);
			if (tSig == null) {
				return false;
			}
			tSignatures.add(tSig);
		}

		// check if Refactoring is applicable and perform it
		boolean esc_isApplicable = this.escRefactoring.isApplicable(tClasses, new_parent, tSignatures);
		if (esc_isApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.escRefactoring.perform(tClasses, new_parent, tSignatures)) {
				String classname = tClass.getTName() + ".java"; //$NON-NLS-1$
				TPackage p = tClass.getPackage();
				while (p != null) {
					classname = p.getTName() + "." + classname; //$NON-NLS-1$
					p = p.getParent();
				}
				if (!this.changes.contains(classname)) {
					this.changes.add(classname);
				}
			}
		}

		return esc_isApplicable;
	}

	private TClass getTClass(Java_Class java_class) {

		TPackage tPackage = null;

		String fully_qualified_package_name = java_class.getPackage();
		if (fully_qualified_package_name != null) {
			String[] namespaces = fully_qualified_package_name.split(Pattern.quote(".")); //$NON-NLS-1$
			for (TPackage p : this.tool_pg.getPackages()) {
				if (p.getTName().compareTo(namespaces[0]) == 0) {
					tPackage = p;
					break;
				}
			}
			for (int i = 1; i < namespaces.length; i++) {
				String name = namespaces[i];
				boolean found = false;
				for (TPackage child_package : tPackage.getSubpackage()) {
					if (child_package.getTName().compareTo(name) == 0) {
						tPackage = child_package;
						found = true;
						break;
					}
				}
				if (!found) {
					return null;
				}
			}
		}

		for (TClass contained_class : this.tool_pg.getClasses()) {
			if (contained_class.getTName().compareTo(java_class.getClass_name()) == 0) {
				TPackage contained_package = contained_class.getPackage();
				if ((contained_package == null && tPackage == null) || contained_package.equals(tPackage)) {
					return contained_class;
				}
			}
		}

		return null;
	}

	private TSignature getTSignature(Signature sig) {
		if (sig instanceof Java_Method) {
			Java_Method method = (Java_Method) sig;
			return getTMethodSignature(method);
		} else if (sig instanceof Java_Field) {
			Java_Field field = (Java_Field) sig;
			return getTFieldSignature(field);
		}
		return null;
	}

	private TFieldSignature getTFieldSignature(Java_Field java_field) {
		TField name = null;
		for (TField m : this.tool_pg.getFields()) {
			if (m.getTName().compareTo(java_field.getField_name()) == 0) {
				name = m;
				break;
			}
		}
		if (name == null) {
			return null;
		}

		TClass type = getTClass(java_field.getType());
		TFieldSignature sig = null;
		for (TFieldSignature s : name.getSignatures()) {
			if (type.equals(s.getType())) {
				sig = s;
				break;
			}
		}
		if (sig == null) {
			return null;
		}
		return sig;
	}

	private TMethodSignature getTMethodSignature(Java_Method java_method) {
		TMethodSignature sig = null;

		TMethod name = null;
		for (TMethod m : this.tool_pg.getMethods()) {
			if (m.getTName().compareTo(java_method.getMethod_name()) == 0) {
				name = m;
				break;
			}
		}
		if (name == null) {
			return null;
		}

		// Search Method Signature
		EList<Java_Class> dsl_params = java_method.getParams();
		for (TMethodSignature s : name.getSignatures()) {
			TParameterList pg_params = s.getParamList();
			if (Support.compareParamList(dsl_params, pg_params)) {
				sig = s;
				break;
			}
		}
		if (sig == null) {
			return null;
		}
		return sig;
	}

	public List<org.gravity.arte.testdsl.arteLanguage.Refactoring> getBookkeeping() {
		return this.bookkeeping;
	}

	public boolean applyRefactoring(org.gravity.arte.testdsl.arteLanguage.Refactoring r) {
		if (r instanceof Pull_Up_Method_Refactoring) {
			return applyPullUpMethod((Pull_Up_Method_Refactoring) r);
		} else if (r instanceof Pull_Up_Field_Refactoring) {
			return applyPullupField((Pull_Up_Field_Refactoring) r);
		} else if (r instanceof Create_Superclass_Refactoring) {
			return applyCreateSuperclass((Create_Superclass_Refactoring) r);
		} else if (r instanceof Extract_Superclass_Refactoring) {
			return applyExtractSuperclassRefactoring((Extract_Superclass_Refactoring) r);
		} else {
			throw new RuntimeException("Unknown Refactoring Kind");
		}
	}

	public boolean applyBookkeeping(List<org.gravity.arte.testdsl.arteLanguage.Refactoring> bookkeeping) {
		boolean success = true;
		for (org.gravity.arte.testdsl.arteLanguage.Refactoring r : bookkeeping) {
			success &= applyRefactoring(r);
			if (!success) {
				return false;
			}
		}
		return true;
	}

	public Set<String> getChanges() {
		return this.changes;
	}
}
