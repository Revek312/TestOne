package st.tech;

import java.util.Scanner;

public class IOClass {

	public void printString(String str) {
		System.out.println(str);
	}
	
	public String getString() {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Input line:");

	    String line = myObj.nextLine();
	    myObj.close();
	    return line;
	}
}
