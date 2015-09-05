// Declaring Local Classes
package javaCodeTesting;

public class LocalClassExample {

	static String regularexpression = "[^0-9]";

	public static void validatePhoneNumber(String phoneNumber1,
			String phoneNumber2) {

		final int numberLength = 10;

		class PhoneNumber {

			String formattedPhoneNumber = null;

			public PhoneNumber(String phoneNumber) {
				// TODO Auto-generated constructor stub
				String currentNumber = phoneNumber.replaceAll(
						regularexpression, "");

				if (currentNumber.length() == numberLength) {

					formattedPhoneNumber = currentNumber;
				} else {
					formattedPhoneNumber = null;
				}
			} // end of PhoneNumber constructor

			public String getNumber() {
				return formattedPhoneNumber;
			}

			public void printOriginalNumber() {

				System.out.println("Original numbers are " + phoneNumber1
						+ " and " + phoneNumber2);

			}
		} // end of PhoneNumber class
		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		myNumber1.printOriginalNumber();

		if (myNumber1.getNumber() == null) {
			System.out.println("First number is invalid");
		} else {
			System.out.println("First number is " + myNumber1.getNumber());
		}

		if (myNumber2.getNumber() == null) {
			System.out.println("Second number is invalid");
		} else {
			System.out.println("Second number is " + myNumber2.getNumber());
		}

	}

	public static void main(String[] args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}
