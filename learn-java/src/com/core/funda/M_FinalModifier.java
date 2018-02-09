package com.core.funda;

public class M_FinalModifier {

	public static void main(String[] args) {

		int i;
		for (i = Maths.MIN; i <= Maths.MAX; i++) {

			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for (i = Maths.MIN; i <= Maths.MAX; i++); // execute and exit and nothing do
		

		/*
		 * When you terminate for loop with ;, it equivalent to
		 * 
		 * for (int n = 1; n <= number; n+=2 ) { //do nothing } //here n is out
		 * of variable scope System.out.print(n + " ");}
		 * 
		 * In fact, for loop should be
		 * 
		 * for (int n = 1; n <= number; n+=2 ) { System.out.print(n + " "); }
		 */

		System.out.println(i);
		//Maths.MAX=500;
	}

}

class Maths {

	static final int MIN = 10;
	final static int MAX = 25;

}

/*
 * In C and C++ in order to make any variable value as a constant we need to
 * make use of word "const"
 * 
 * The values of the Constant variable cannot be modified
 * 
 * Similarly, In order to make any variable value as constant in Java we need to
 * make use of final modifier
 * 
 * with the help of final modifier we can declare variables, methods and classes
 * 
 * Final Variables - Final Local variable - Final Instance field - Final Static
 * variable Note: The above 3 types of variable will work similar with local,
 * instance fields and static variables But only difference is the values of
 * these can't be modified Methods Classes
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
