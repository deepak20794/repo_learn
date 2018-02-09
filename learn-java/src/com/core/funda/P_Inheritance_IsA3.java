package com.core.funda;

// 5th point program

public class P_Inheritance_IsA3 {

	public static void main(String[] args) {
		
		SubBBB sbbb = new SubBBB();
		sbbb.method1();
	}

}
class SuperAAA{
	void method1(){
		System.out.println("Method 1 from SuperA");
	}
}

class SubBBB extends SuperAAA{
	
	void method1(){
		
		super.method1();
		System.out.println("Method from subb");
	}
}