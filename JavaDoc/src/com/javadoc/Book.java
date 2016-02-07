package com.javadoc;

public class Book {
	
	public Book(String string) {
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Object obj) {
		Object ISBN;
		if (obj instanceof Book)
			return ISBN.equals((Book) ((Object) obj).getISBN());
		else
			return false;
	}
}
