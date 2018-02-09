package com.core.funda;

public class L_StaticMethodsEx {
	
	int x=222;
	
	static void method1(){
		L_StaticMethodsEx sme = new L_StaticMethodsEx();
		System.out.println(sme.x);
	}

	public static void main(String[] args) {
		method1();
		L_StaticMethodsEx sme =new L_StaticMethodsEx();
		sme.method1(); // Calling with object reference
		L_StaticMethodsEx.method1(); // Calling with Class name
	}

}
// Simplified Program for above 1
// Object created in main method is used in method by method object reference
class Master{
	int x=222;
	 static void method1(Master o){
		 
		 System.out.println(o.x);
	 }
	
	 public static void main(String args[]){
		 Master m= new Master();
		  method1(m);
		 
	 }
}