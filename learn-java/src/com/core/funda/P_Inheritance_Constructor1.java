package com.core.funda;

public class P_Inheritance_Constructor1 extends SuperTest1{
	
	//P_Inheritance_Constructor1 sub class
	
	P_Inheritance_Constructor1(int x){
		
		super(x);
		System.out.println("I am parameterized of sub class");
		
	}

	public static void main(String[] args) {
		
		P_Inheritance_Constructor1 sub = new P_Inheritance_Constructor1(123);
	}

}

class SuperTest1{
	
	SuperTest1(int a){
		System.out.println("I am parameterized of super class");
	}
	
}

/*Both super class and sub class are defined with parameterized constructor , then we must invoke parameterized constructor
of super class by the parameterized constructor of sub class explicitly*/