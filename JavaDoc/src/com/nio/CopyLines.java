package com.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException {

		BufferedReader input = null;
		PrintWriter output = null;
		

		try {

			input = new BufferedReader(new FileReader("InputStream.txt"));

			output = new PrintWriter(new FileWriter("CopyLinesOut.txt"));

			String s;

			while ((s = input.readLine()) != null) {

				output.print(s);
			}
			
			System.out.println("Data copied");

		} finally {

			if (input != null) {
				input.close();
			}
			if (output != null) {
				output.close();
			}
		}

	}

}
