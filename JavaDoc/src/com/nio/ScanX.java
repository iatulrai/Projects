package com.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanX {

	public static void main(String[] args) throws IOException {

		Scanner s = null;

		try {

			s = new Scanner(new BufferedReader(
					new FileReader("InputStream.txt")));

			while (s.hasNext()) {

				//s.useDelimiter(",\\s*");
				System.out.println(s.next());
			}
		} finally {

			if (s != null) {
				s.close();
			}
		}

	}
}
