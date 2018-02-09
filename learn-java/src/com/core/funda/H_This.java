package com.core.funda;

public class H_This {
	
	void method1(){
		System.out.println("From m1 Address of current object is"+this);
	}

	void method2(){
		System.out.println("From m2 Address of current object is"+this);
	}
	public static void main(String[] args) {
		H_This t = new H_This();
		
		t.method1();
		System.out.println("Add of the object is"+t);
		t.method2();
		System.out.println("Add of the object is"+t);

		// m1 is executing w.rt. t type of t is this -> control jumps to this class -> Searches for method1 defined or not -> 
		// m1 is holding the address of current obj
		// current obj - method1 is invoked by t - since it's holding the address of t
	}

}

// This is not supported by static blocks
// This is always used to hold the address of the current object
// Every INSTANCE method will have this implicit
// Recommended to use whenever local and instance are declared with same name .. cont
// in order to make differentiation between them we need to make use of this for instance fields
/*this is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor. Using this you can refer the members of a class such as constructors, variables and methods.

NoteThe keyword this is used only within instance methods or constructors*/