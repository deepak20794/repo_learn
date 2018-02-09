/*package com.core.funda;

Why to write System.out before println()?

class PrintStream{
	public void println(String s){
		
	}
	
	public void println(int s){
		
	}

	public void println(float s){
	}
	
}

class System{
	public static java.io.PrintStream out;
	public static java.io.PrintStream err;
}
public class P_Inheritance_HasA3 {

	public static void main(String[] args) {
		
		System.out.println("Sashli");
		System.out.println(10);
		System.out.println(3.14f);
	}

}*/


/*
Why to write System.out before println()?
		
		println() is a over loaded method of PrintStream class
		
		println() methods are non static methods of PrintStream class
		
		In order to access non static methods of a class we need an object reference
		
		To access the non static methods of PrintStream class SUN Micro system created an object called "out"
		
		out is the object reference of PrintStream class but it is the Static member of System class
		
		To access static member of the class we need to make use of ClassName whenever you want to access
		it from outside of class. Thus we have to write Sysem.out to access members of PrintStream class
		
What is the diference between System.out.println() and System.err.println()

		out and err are object reference of PrintStream class both are technically same in order to make the
		difference b/w normal and error messages we need to make use of System.err
		
Note: whenever you want to use any class properties of a package then it is recommended to import the corresponding package
but it is optional for java.lang as it is default in JVM*/