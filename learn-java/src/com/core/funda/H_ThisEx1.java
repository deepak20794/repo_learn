package com.core.funda;

public class H_ThisEx1 {

	int x =111;
	
	public void method1(int x){
		
		System.out.println(x);
		x=this.x;
		System.out.println(x);
		this.x = x;
		System.out.println(this.x );
		x=this.x;
		System.out.println(x);
	}
	
	public void method2(){
		System.out.println(x+" "+this.x);
		// Here no local varaible with name x so we can write x or this.x
	}
	
	public static void main(String[] args) {
		
		H_ThisEx1 tex1 = new H_ThisEx1();
		tex1.method1(10);
		tex1.method2();
	}

}
