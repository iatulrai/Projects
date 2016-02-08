package com.javadoc;

public class FileName {

	private String fullPath;
	private char pathSeperator, extensionSeparator;

	public FileName(String str, char sep, char ext) {

		fullPath = str;
		pathSeperator = sep;

		extensionSeparator = ext;
	}

	public String extension() {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		return fullPath.substring(dot + 1);

	}

	// get file name without extension

	public String filename() {

		int dot = fullPath.lastIndexOf(extensionSeparator);
		int sep = fullPath.lastIndexOf(pathSeperator);
		return fullPath.substring(sep + 1, dot);
	}

	public String path() {
		int sep = fullPath.lastIndexOf(pathSeperator);
		return fullPath.substring(0, sep);
	}

}
