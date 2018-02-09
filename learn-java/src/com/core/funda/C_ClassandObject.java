package com.core.funda;


class Sample{
	
}

class Sample2{
	int x,y;
}
public class C_ClassandObject {

	public static void main(String[] args) {
		Sample s,s1;
		s= new Sample();
		s1= new Sample();
		System.out.println("Address of Object sample s is: "+s);
		System.out.println("Address of Object sample s1 is: "+s1);
		
		
		Sample2 s2 = new Sample2();
		  // x=100; y=100;
		  // In above line JVM will search for existence of x in main method-- No --> it will search within the class --> No-> Error
		  // Existence means Searching for declaration of x and y
		System.out.println(s2.x=100); 
		System.out.println(s2.y=200);
		
		
	}

}


// Class is a logical representation doesn't occupy any space
// In order to store data and access members of the class we need to create an object
// To create Object for a class we require 1. Reference variable 2. new and constructor
// Reference variable syntax : <ClassName> ~ <refvname>; 
	// For RV memory is allocated within stack and for every rv 4 bytes memory is allocated

// Object Syntax: <ref_varaible_name> = new <ClassName>([List of args])
 	// new : keyword - to allocate the memory dynamically during program execution
    // constructor : Initializer method used for Object instantiation and Object initialization
		// when constructor is invoked object of the class is instantiated 
		// when object is instantiated memory is allocated only for fields and not methods
		// For non static fields memory is allocated in Heap organization 
		// we can create 'n' number of objects for a class
		// To access the members of one class in another class  Object reference is used
		// Non Static variable are accessed in static context by Object reference in same or different class

//Note: Objects are Created only at run time