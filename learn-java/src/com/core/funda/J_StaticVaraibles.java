package com.core.funda;

public class J_StaticVaraibles{
	
	int x=100; // Non static, Object variable, Instance field
	static int y=200; // Class variable , Static variable

	@SuppressWarnings("static-access")
	public static void main(String[] args) { // Static method
	
		System.out.println(y);
		J_StaticVaraibles sv = new J_StaticVaraibles();
		System.out.println(sv.x);
		
		Test t = new Test();
		t.acessStatic();
		System.out.println(t.z); // accessing static content by Creating Object
		//or
		System.out.println(Test.z); // access through class name
		

	}

}

class Test{
	
	static int z=500;
	void acessStatic(){
		//System.out.println(y); error because in order to access static variable of other class we need to refer with class name or Object reference
		// In simple the variable which is declared within the class can be accessed within that class only
		System.out.println(J_StaticVaraibles.y);
		
		System.out.println(z); 
		//Static variables can be accessed by the static methods or non static methods directly when they are in same class
	}
}


// Static variables are also known as CLASS variables
// Static - Non access modifier
// With the help o static modifier we can declare variables , we can define methods and also static blocks

//The variables which are declared within a class with static modifier
// For the static variables memory is not allocated in Object
// Memory is allocated in constant pool
// ***For Static fields memory is allocated only once and it can be shared by n no of objects of same type
// *** Static fields can be refereed by either class name or object reference whenever you want to access it from outside of class
// USAGE : Whenever you want to maintain the common data across more than one object of same type then we need to make use of static


// *************** NOTE ******************
// Static variables can be accessed by the static methods or non static methods directly when they are in same class
// But if you want to access SV into Static methods / non static methods of outside the class we must require class name or Object reference
