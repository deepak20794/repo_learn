package com.core.funda;

// 4th point program
public class P_Inheritance_IsA2 {

	public static void main(String[] args) {
		
		SubBB sbb = new SubBB();
		sbb.method1();

	}

}

class SuperAA{
	
	int x=111; // instance fields
}

class SubBB extends SuperAA{
	
	int x =222; // instance fields
	
		void method1(){
			
			int x = 333; // local varaible
			System.out.println("X val is "+x);
			System.out.println("X val is "+this.x);
			System.out.println("X val is "+super.x);
			
		}
}





/*  NOTE2:
	As we know if both local and instance are declared with same name usually priority is given to local variables
	
	Similarly if you declare instance field of sub class exactly same with instance field of super class then priority is 
	given to instance field of subclass
	
	if you want to access the instance field of super class then we need to use a keyword called "SUPER"
	
	if both local and instance fields are declared with same name to access the instance field then we need to make use of "this"*/