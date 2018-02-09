package com.core.funda;

public class G_MethodOverloadingEx {
	
	void method1(byte b){
		System.out.println("I am byte "+b);
	}
	
	void method1(short s){
		System.out.println("I am Short "+s);
	}
	
	void method1(int i){
		System.out.println("I am Int "+i);
	}

	public static void main(String[] args) {

		G_MethodOverloadingEx moe =new G_MethodOverloadingEx();
		
		moe.method1(10);
		moe.method1(100);
		moe.method1(10000);
		
		// byte short int - among these highest priority is for int  i.e why we got all 3 as i am int
		
		moe.method1((byte)10);
		moe.method1((short)100);
		moe.method1(10000);
		
		
	}

}
