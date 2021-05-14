package org.gravity.pm.umlsec;

import java.util.List;

import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;

public class SignatureHelper {
	
	public static String getSignature(Feature member) {
		if (member instanceof Operation) {
			return  carisma.profile.umlsec.SignatureHelper.getSignature((Operation) member);

		} else if (member instanceof Property) {
			return carisma.profile.umlsec.SignatureHelper.getSignature((Property) member);

		}
		return null;
	}
	
	public static List<String> check(Feature feature, List<String> signatures) {
		if(signatures.contains(getSignature(feature))) {
			return signatures;
		}
		return null;
	}
}
