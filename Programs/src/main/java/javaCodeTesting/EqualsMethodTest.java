package javaCodeTesting;

public class EqualsMethodTest {
	public static void main(String[] args) {

		String s1 = new String("My name is Atul Rai.");

		String s2 = s1;

		String s3 = new String("My name is Atul Rai");

		boolean result;

		result = s1.equals(s2);

		System.out.println("Is string matched? Result: " + result);

		result = s1.equals(s3);

		System.out.println("Is string matched? Result: " + result);

	}
}
