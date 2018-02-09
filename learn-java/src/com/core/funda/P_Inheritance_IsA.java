package com.core.funda;
// program for 1st 3 points


public class P_Inheritance_IsA {

	public static void main(String[] args) {

		SubB1 sb1 = new SubB1();
	//	System.out.println("x val is" + sb1.x); // X is private
		System.out.println("y val is" + sb1.y);
		System.out.println(SubB1.z+" "+SuperA1.z+" "+sb1.z);
		// using class name or object reference
	}

}

class SuperA1{
	private int x =100;
			int y =200; //non static or instance
	static  int z =300;
}

class SubB1 extends SuperA1{
	
	int a = 111;
}


/*It is a process of creating a subclass by extending the properties of its super class 
in this case we need to make use of keyword EXTENDS

syntax: 
	[modifiers] <class> <SuperClassName>{
		
		fields/methods
	}
	
	[modifiers] <class> <SubClassName> extends <class> <SuperClassName>{
		
		fields/methods
	}
	
RULES FOR INHERITANCE:
	
	1. private members are not inherited
	2. inherited members can be used as a regular members of the class
	3. static members are inherited
	4. we can declare subclass instance fields exactly same with instance fields of its super class
	5. we can also define subclass instance method signature exactly same with the instance method signature of its super class
	
NOTE1:
	Creating an object for the sub class does not mean creating the object for its super class
	If you create an object for the subclass it will allocate the memory for all the members of the super class
	and all the members of the sub class memory is allocated within the object of subclass
	
*/