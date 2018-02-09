package com.core.funda;

public class B_Primitive_a_Widening {

	public static void main(String[] args) {
		
		byte b=55;
		int i=b; // Converting Lower value to Higher 
		
		System.out.println(i);
		
		int a=65;
		System.out.printf("%c", a); // Implicit Type casting
		

	}

}

// Converting the value from Lower type to Higher type which is done by the complier implicitly without any loss