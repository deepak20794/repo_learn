package com.core.funda;

public class A_LocalVaraibleEX {

	public static void main(String[] args) {

		byte b = 50; // max range
		short s = 11111; // max range
		int i = 1111111111; // max range
		long l = 1111111111111111111l; // max range
		char c = 'K';
		float f = 2.2f;
		String S = "Deepak";
		double d = 4.4;
		boolean boo=false;

		System.out.println(b + " " + s + " " + i + " " + l + " " + c + " " + f + " " + S + " " + d +" "+boo);

	}

}


// Local variable must be initialized else JVM will raise an exception
// which are declared with a method
// If there is no access modifier by default they are default members of the class