package com.core.funda;

//Overloading
public class R_OverloadingVSOverriding {
	
	public static void main(String args[]){
		
		SuperZ sa = new SuperZ();
		sa.m1(10);
	}

}

class SuperZ{
	void m1(){
	}
	
	void m1(int x){
		
	}
}


/*OVERLOADING

1. Overloading is the process of defining more than one method with the same name for different purpose
2. In Overloading method name must be same list of arguments should not be same, return type may or may not be same
3. Overloading can be done either in the same class or its inherited classes


OVERRIDING

1. It is a process of defining the sub class instance method signature exactly same with the instance method
	signature of ite superclass
2. In overriding 
	--- method name must be same
	---	List of arguments should be same and return type must be same
	---	Overriding is possible only in the inherited classes
	
Note: A super clas reference variable can hold the object of any of its sub class implicitly called upcasting
		or generalization
		
	Sub class reference variable cannot hold the object of any of its super class implicitly but its possible
	explicitly called downcasting or specalization
	
Examples:
	
	SuperA supref 	= new SuperA();
	SubB	subref	= new SubB();
			supref = subref; // Upcasting - implicitly
			subref = superf; // error - found is SuperA required is  SubB
			subref = (SubB)superf;// downcasting - explicitly
			
	Object o = new Object();
	String s = new String("Deepak");
	Integer i = new Integer(10);
	Float f = new Float(3.14f);
	
	o=s; o=i; o=f;
	
	s=o //error found is object required is string
	s=(String)o;    	   s=o;  //invalid
	i=(Integer)o; 			i=o; //invalid
	f=(Float)o;				f=o; //invalid
	
	
Number n;

Integer i = new Integer(100);
Byte b = new Byte(10);

    n=i // valid
    n=b // valid
 String s = new String("Deepak");
    n=s; //invalid
    
    (or)
    
Number n;
	n = new Float(3.14f);
	n = new Integer(10);
	
All the wrapper classes belong to java.lang package

javap java.lang.Integer
javap java.lang.Float

class java.lang.Float extends with java.lang.Number(Abstract Class)

For Wrapper classes Number is the super class

*/