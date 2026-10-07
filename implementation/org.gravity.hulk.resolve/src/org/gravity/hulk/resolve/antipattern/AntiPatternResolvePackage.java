package org.gravity.hulk.resolve.antipattern;

import java.util.Arrays;

import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.resolve.antipattern.impl.HBlobResolver;

public class AntiPatternResolvePackage extends HulkPackage {

	public static final AntiPatternResolvePackage INSTANCE = new AntiPatternResolvePackage();

	private AntiPatternResolvePackage() {
		super("Anti-Pattern Resolution", Arrays.asList(HBlobResolver.class));
	}
}
