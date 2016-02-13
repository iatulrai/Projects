package com.nio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {

			inputStream = new FileReader("InputStream.txt");

			outputStream = new FileWriter("CharacterStreamOut.txt");

			int c;

			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
			
			System.out.println("Data Copied");

		} finally {

			if (inputStream != null) {
				inputStream.close();
			}

			if (outputStream != null) {

				outputStream.close();
			}

		}

	}

}
