package com.core.funda;

public class P_Inheritance_IsA4 {

}
/*=============================================*/

class A1{
	int x= 111;
}

class B1 extends A1{
	
	int x =222;
}

class C1 extends B1{
	int x =333;
	
	void methodc()
	{
		//System.out.println(super.super.x);
	}
	public static void main(String args[]){
		
		C1 c = new C1();
		c.methodc();
	}
}

// super.super, this.this, super.this, this.super --- not valid

/*================================================*/



class A2{
	int x =111;
}

class B2 extends A2{
	int x =222;
}

class C2 {
	
	
		void methodC2(){
			//System.out.println(super.x);
		}
}
	
// not inherited as class c2 is not extended by any other class
