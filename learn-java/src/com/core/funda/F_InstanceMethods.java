package com.core.funda;

public class F_InstanceMethods {
	
	int x,y; // instance fields
	
	 void setData(){
		 
		 x=100; y=200; // Instance fields can be accessed in Instance methods
		 // if you create mutable and immutable method for every instance field then it is called JAVA BEAN STANDARD
	 }
	 
	 void getData(){
		 System.out.println("x val is "+x);
		 System.out.println("y val is "+y);
	 }

	public static void main(String[] args) {
		F_InstanceMethods im = new F_InstanceMethods();
		 im.setData(); // Try without this Res: Default values will be initialized
		 im.getData();
	}

}
// Methods which are defined without static modifier also called as Object methods
// IM can perform operations on both static and non static variables
// For this methods memory is allocated within object
// must be referred by an object reference
// Classified into 3 types
	// 1. Mutable methods or SETTER methods
		// Methods which are used to change the state of the fields
	// 2. Immutable methods or GETTER methods
		// which doesn't change the state of fields rather used to read the values of the fields
	// 3. Initializer methods
		// nothing but the constructor used for object instantiation and object initialization 
