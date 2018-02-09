package com.core.funda;

public class L_StaticMethods {
	
	static int square(int x){
		return x*x ;
	}

	public static void main(String[] args) {
		
		System.out.println("Result is"+square(5));
	}
	
}

class Testing{
	
	public static void main(String args[]){
	//int x=	T_StaticMethods.square(10);
		System.out.println(L_StaticMethods.square(10));
	 
		
	}
	
}
// The methods which are defined within the class with static modifier
// The Static methods can perform operation only on Static variables
// whereas non static methods can perform operations on both static and non static variables
// The static methods can be referred by the class name or object reference when you are trying to access it from outside of class