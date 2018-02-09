package com.core.funda;

public class F_InstanceMethodsEx {

	int y=100; // Instance fields can be accessed  throughout the class
	
	void method1()
	{
		int x=100;
		System.out.println(x);
		// Jvm wills search for existence y within the method -> No -> then searches whether y is declared in class as a instance-> Yes
		// DECLARATION means int x;
		System.out.println(y);
		
	}
	
	void method2()
	{
		System.out.println(y);
		//Error as x is neither instance nor Local to method2
		//System.out.println(x);
	}
	public static void main(String[] args) {
		F_InstanceMethodsEx ime = new F_InstanceMethodsEx();
		ime.method1();
		ime.method2();
				
	}

}
