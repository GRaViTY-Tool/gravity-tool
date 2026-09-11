package org.gravity.hulk.detection.codesmells;

import java.util.Arrays;

import org.gravity.hulk.detection.HulkDetectionPackage;
import org.gravity.hulk.detection.codesmells.impl.HControllerClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetector;
import org.gravity.hulk.detection.codesmells.impl.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetector;
import org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.impl.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetector;

public class CodeSmellPackage extends HulkDetectionPackage {

	public static final CodeSmellPackage INSTANCE = new CodeSmellPackage();

	private CodeSmellPackage() {
		super("Code Smells",
				Arrays.asList(
						HControllerClassDetector.class,
						HDataClassAccessorDetector.class,
						HDataClassDetector.class,
						HEmptyClassDetector.class,
						HGetterSetterDetector.class,
						HIntenseFieldUsageDetector.class,
						HLargeClassDetector.class,
						HLowCohesionDetector.class,
						HManyParametersDetector.class,
						HMuchOverloadingDetector.class));
	}
}
