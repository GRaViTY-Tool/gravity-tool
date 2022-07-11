package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;

public class SignatureTests {

	@Test
	public void testSimpleMethod() {
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		
		TPackage p = createPackage(pm, "p");
		TClass c = createClass(pm, p, "C");
		TMethod n = createMethod(pm, "m");
		TMethodSignature s = createMethodSignature(c, n, Collections.emptyList());
		TMethodDefinition d = createMethodDefiniton(c, s);
		
		TMethodDefinition result = pm.getMethodDefinition(d.getDefinedBy().getFullyQualifiedName()+"."+d.getSignatureString());
		
		assertEquals(d, result);
	}
	
	@Test
	public void testMethodWithParameters() {
		TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();
		
		TPackage p = createPackage(pm, "p");
		TClass c = createClass(pm, p, "C");
		TMethod n = createMethod(pm, "m");
		TMethodSignature s = createMethodSignature(c, n, Arrays.asList(createClass(pm, p, "X"), createClass(pm, p, "Y")));
		TMethodDefinition d = createMethodDefiniton(c, s);
		
		TMethodDefinition result = pm.getMethodDefinition(d.getDefinedBy().getFullyQualifiedName()+"."+d.getSignatureString());
		
		assertEquals(d, result);
	}

	/**
	 * @param pm
	 * @return
	 */
	private TPackage createPackage(TypeGraph pm, String name) {
		TPackage p = BasicFactory.eINSTANCE.createTPackage();
		p.setTName(name);
		pm.getPackages().add(p);
		return p;
	}

	/**
	 * @param owner
	 * @param signature
	 * @return
	 */
	private TMethodDefinition createMethodDefiniton(TClass owner, TMethodSignature signature) {
		TMethodDefinition d = BasicFactory.eINSTANCE.createTMethodDefinition();
		signature.getDefinitions().add(d);
		d.setSignature(signature);
		d.setDefinedBy(owner);
		owner.getSignature().add(signature);
		return d;
	}

	/**
	 * @param returnType
	 * @param method
	 * @return
	 */
	private TMethodSignature createMethodSignature(TAbstractType returnType, TMethod method, List<TAbstractType> parameters) {
		TMethodSignature s = BasicFactory.eINSTANCE.createTMethodSignature();
		method.getSignatures().add(s);
		s.setReturnType(returnType);
		s.setMethod(method);
		TParameter prev = null;
		for(TAbstractType paramType : parameters) {
			TParameter next = BasicFactory.eINSTANCE.createTParameter();
			next.setType(paramType);
			s.getParameters().add(next);
			if(prev == null) {
				s.setFirstParameter(next);
			}
			else {
				next.setPrevious(prev);
			}
			prev = next;
		}
		return s;
	}

	/**
	 * @param pm
	 * @return
	 */
	private TMethod createMethod(TypeGraph pm, String name) {
		TMethod n = BasicFactory.eINSTANCE.createTMethod();
		n.setTName(name);
		pm.getMethods().add(n);
		return n;
	}

	/**
	 * @param pm
	 * @param p
	 * @return
	 */
	private TClass createClass(TypeGraph pm, TPackage p, String name) {
		TClass c = BasicFactory.eINSTANCE.createTClass();
		c.setTName(name);
		p.getClasses().add(c);
		p.getOwnedTypes().add(c);
		pm.getOwnedTypes().add(c);
		return c;
	}
}
