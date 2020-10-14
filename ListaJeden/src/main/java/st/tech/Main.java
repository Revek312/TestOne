package st.tech;

public class Main {

	public static void Main(String[] args) {
		
		String in = IOClass.getString();
		in = DoStuff.reverseString(in);
		IOClass.printString(in);
	}
}
