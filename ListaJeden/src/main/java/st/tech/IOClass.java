package st.tech;

import java.util.Scanner;
/**
 * Comments, comments
 * This class handle input and output for this app
 * @author Jakub
 *
 */
public final class IOClass {

	private IOClass() {}
	
	public static void printString(final String str) {
		System.out.println(str);
	}
	
	public static String getString() {
		final Scanner scanner = new Scanner(System.in);
	    System.out.println("Input line:");

	    final String line = scanner.nextLine();
	    scanner.close();
	    return line;
	}
}
