package com.core.funda;

public class P_Inheritance_IsA5 {

	public static void main(String[] args) {
		
		C2A c2a = new C2A();
		c2a.methodC2();
		c2a.methodB2A();
	// The Keyword super should not be used in the context of static just because this and super always refer to an instance
	}

}

class A2A{
	int x =111;
}

class B2A extends A2A{
	int x =222;
	void methodB2A(){
		System.out.println(super.x);
	}
}

class C2A extends B2A{
	
	
		void methodC2(){
		System.out.println(super.x);
		}
}


/*How many methods are there in classA
	class A{}
ans : All the methods of object class i.e java.lang.Object

Compile Class A program through cmd -> .class file is generated
and to see the content of a .class file make use of javap A

Ans: class A extends with java.lang.Objects implicitly 

it means every class is subclass of Object class




class B extends class A{}
	super class for class B is A
	
	Object -- > A --- > B is correct it is multi level 
	
	Object 		A
	     	B			// Multiple inheritance is not supported as java doesn't using classes
	     	
	    Java does not support multiple inheritance just because of diamond property
	     
*/

/*Why java does not support multiple inheritance using classes

Answer: Diamond problem

for example if we consider two classes with same members an we are extending those two classes in another classes
then Jvm is getting ambiguity while accessing the members

class A{
	int x =100;
}

class B{
	int x =200;
}

class C extends A,B{
	
	void method1(){
		System.out.println(x);
		
		public static void main(String x[]){
			C c = new C();
			c.method1();
		// JVM will get an ambiguity in accessing x value	
		}
	}
}*/
