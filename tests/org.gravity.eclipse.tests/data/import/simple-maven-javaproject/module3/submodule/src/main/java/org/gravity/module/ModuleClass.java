package org.gravity.module;

import org.gravity.ParentClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ModuleClass {

	private static final Logger LOGGER = LogManager.getLogger(ModuleClass.class);
	
	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
	}
}
