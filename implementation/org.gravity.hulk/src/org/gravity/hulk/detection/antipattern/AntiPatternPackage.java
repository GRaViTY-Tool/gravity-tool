package org.gravity.hulk.detection.antipattern;

import java.util.Arrays;

import org.gravity.hulk.detection.HulkDetectionPackage;
import org.gravity.hulk.detection.antipattern.impl.HBlobDetector;
import org.gravity.hulk.detection.antipattern.impl.HGodClassDetector;
import org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetector;

public class AntiPatternPackage extends HulkDetectionPackage {

	public static final AntiPatternPackage INSTANCE = new AntiPatternPackage();

	private AntiPatternPackage() {
		super("Anti-Patterns",
				Arrays.asList(
						HBlobDetector.class,
						HGodClassDetector.class,
						HSpaghettiCodeDetector.class,
						HSwissArmyKnifeDetector.class));
	}
}
