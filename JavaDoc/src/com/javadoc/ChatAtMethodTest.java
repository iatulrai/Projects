package com.javadoc;

public class ChatAtMethodTest {

	public static void main(String[] args) {

		String str = "My name is Atul Rai, I am from INDIA";

		char mychar = str.charAt(9);

		System.out.println(mychar); // display the value of index- 9

		// String substring(int beginIndex, int endIndex)
		// Returns a new string that is a substring of this string. The
		// substring begins at the specified beginIndex and extends to the
		// character at index endIndex - 1.

		String substr = str.substring(5, 11);

		System.out.println(substr);

		// String substring(int beginIndex)
		// Returns a new string that is a substring of this string. The integer
		// argument specifies the index of the first character. Here, the
		// returned substring extends to the end of the original string.

		String substr2 = str.substring(11);

		System.out.println(substr2);

		// String trim()
		// Returns a copy of this string with leading and trailing white space
		// removed.

		String str1 = str.trim();

		System.out.println(str1);

		// String toLowerCase()

		String str2 = str.toLowerCase();

		System.out.println(str2);

		// String toUpperCase()

		String str3 = str.toUpperCase();

		System.out.println(str3);

		// CharSequence subSequence(int beginIndex, int endIndex)
		// Returns a new character sequence constructed from beginIndex index up
		// until endIndex - 1.

		CharSequence chrsq = str.subSequence(4, 12);

		System.out.println(chrsq);

	}

}
