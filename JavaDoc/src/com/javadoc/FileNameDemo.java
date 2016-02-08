package com.javadoc;

public class FileNameDemo {

	public static void main(String[] args) {

		final String FPATH = "/home/user/index.html";

		FileName myHomePage = new FileName(FPATH, '/', '.');

		System.out.println("Extension = " + myHomePage.extension());

		System.out.println("File name = " + myHomePage.filename());

		System.out.println("Path = " + myHomePage.path());
	}
}
