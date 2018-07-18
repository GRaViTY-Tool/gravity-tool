package org.gravity.eclipse.os;

public enum OperationSystem {
		WINDOWS,
		LINUX,
		MACOS,
		UNKNOWN;
		
		public static final OperationSystem  os = getCurrentOS();
		
		public static  OperationSystem getCurrentOS() {
			if(System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
				return OperationSystem.WINDOWS;
			}
			else if(System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0) {
				return OperationSystem.LINUX;
			}
			return OperationSystem.UNKNOWN;
		}
	}

