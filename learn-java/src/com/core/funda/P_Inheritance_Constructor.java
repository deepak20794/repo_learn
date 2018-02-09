package com.core.funda;

/*if the superclass is defined with both default and parameterized constructor in that case also default constructor 
of the super class is only invoked by the default constructor of sub class*/
public class P_Inheritance_Constructor extends SuperTest{
	
	// P_Inheritance_Constructor is a sub class
	
	P_Inheritance_Constructor(){
		super(123);
		System.out.println("I am default constructor of sub class");
	}

	public static void main(String[] args) {
		P_Inheritance_Constructor sub  = new P_Inheritance_Constructor();

	}

}


class SuperTest{
	
	SuperTest(){
		System.out.println("I am default constructor of super class");
	}
	SuperTest(int x){
		this();
		System.out.println("I am parameterized constructor of super class");
	}
}

/*The default constructor of the super class is invoked by the default constructor of the subclass implicitly 

if the superclass is defined with both default and parameterized constructor in that case also default constructor 
of the super class is only invoked by the default constructor of sub class

plus, if you want to invoke the parameterized constructor of super class by the default construcuot of sub class 
we need to make use of super()

If super class is defined with the default constructor and sub class is defined with the parameterized constructor
create an object for the subclass by invoking the parameterized constructor in that case also the defaut constructor 
of the super class is invoked by the parameterized constructor of sub class

Both super class and sub class are defined with parameterized constructor , then we must invoke parameterized constructor
of super class by the parameterized constructor of sub class explicitly*/