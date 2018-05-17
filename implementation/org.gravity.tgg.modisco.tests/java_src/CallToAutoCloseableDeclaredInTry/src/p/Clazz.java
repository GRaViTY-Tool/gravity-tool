package p;

import java.util.Scanner;

public class Clazz {
	
	public void m() {
		try (Scanner scanner = new Scanner("")) {
			scanner.nextInt();
		}
	}
}
