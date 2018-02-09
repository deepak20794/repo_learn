package com.core.funda;

// OverRiding - Possible in only inherited classes
public class R_OverloadingVSOverriding2 {
	
	public static void main(String args[]){
		
		SuuperA sa = new SuuperA();
				sa.m1(111);
	// A super class reference variable can hold the Object of any of its sub class implicitly called upcasting or generalization
				sa = new SuubB();
				sa.m1(222);
				sa=new SuuperA();
				sa.m1(333);
	}

}

class SuuperA{
	
	void m1(int x){
		System.out.println("Method1 of SuperA"+x);
	}
}

class SuubB extends SuuperA{
	
	void m1(int x){
		System.out.println("Method1 of SubB"+x);
	}
}