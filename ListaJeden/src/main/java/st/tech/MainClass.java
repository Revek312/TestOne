package st.tech;

/**
 * Upper comment
 * Lower comment
 * @author Jakub
 *
 */
public final class MainClass {

	/**
	 * Program entry point
	 * @param args program arguments
	 */
	public static void main(String[] args) {
		
		String inputString = IOClass.getString();
		inputString = StringUtilis.reverseString(inputString);
		IOClass.printString(inputString);
		
		// Bad comment.
	}
}
