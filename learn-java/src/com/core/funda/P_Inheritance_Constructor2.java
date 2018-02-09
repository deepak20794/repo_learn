package com.core.funda;

public class P_Inheritance_Constructor2 {
	
	
	P_Inheritance_Constructor2(String x){
		System.out.println("I am Parameterized of sub class");
	}
	
	public static void main(String[] args) {
		
		P_Inheritance_Constructor2 sub = new P_Inheritance_Constructor2("Deepak");

	}

}

class SuperTest2{
	
	SuperTest2(){
		System.out.println("I am default od super");
	}
}

/*If super class is defined with the default constructor and sub class is defined with the parameterized constructor
create an object for the subclass by invoking the parameterized constructor in that case also the defaut constructor 
of the super class is invoked by the parameterized constructor of sub class*/