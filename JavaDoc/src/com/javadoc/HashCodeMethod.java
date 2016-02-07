package com.javadoc;

public class HashCodeMethod {
	public static void main(String[] args) {

		HashCodeMethod myhash = new HashCodeMethod();

		System.out.println("Hash Code  is : " + myhash.hashCode());

		HashCodeMethod myhash1 = new HashCodeMethod();

		System.out.println(myhash1.hashCode());
	}

}
