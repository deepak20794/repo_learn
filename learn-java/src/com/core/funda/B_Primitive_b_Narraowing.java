package com.core.funda;

public class B_Primitive_b_Narraowing {

	public static void main(String[] args) {
		
		double d=3.14;
	/*	float f=d; // Error */
		
		// Type cast
		
		float f=(float)d;
		float f1=(float)3.14;
		System.out.println("f value is "+f +"\n"+"f1 value is "+ f1);
		System.out.printf("Float value is %f", f);
	}

}

// Converting the value from Higher type to Lower value, it should be done explicitly and there is a possibility for loss of precision
