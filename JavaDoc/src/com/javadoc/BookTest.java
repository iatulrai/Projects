package com.javadoc;

public class BookTest {
	public static void main(String[] args) {

		Book firstBook = new Book("0201914670");

		Book secondBook = new Book("0201914670");

		if (firstBook.equals(secondBook)) {

			System.out.println("objects are equal");

		} else {

			System.out.println("objects are not equal");
		}
	}

}
