package st.tech;

/**
 * Class full of useful functions that work on strings
 * @author Jakub
 *
 */
public final class StringUtilis {
	private StringUtilis() {}
	/**
	 * This function reverse a string
	 * @param string 
	 * @return reversed string
	 */
	public static String reverseString(final String string) {
		return new StringBuilder(string).reverse().toString();
	}
}
