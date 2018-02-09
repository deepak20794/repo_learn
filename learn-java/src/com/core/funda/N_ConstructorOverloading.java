package com.core.funda;

public class N_ConstructorOverloading {
	
	float rad;
	
	N_ConstructorOverloading(){
		rad = 2.0f;
	}
	N_ConstructorOverloading(float rad){
		this.rad = rad;
	}
	float area(){
		
		return 3.14f*rad*rad;
		
	}
	public static void main(String[] args) {
		
		N_ConstructorOverloading def = new N_ConstructorOverloading();
		System.out.println(def.area());
		
		N_ConstructorOverloading para = new N_ConstructorOverloading(3.14f);
		System.out.println(para.area());
		

	}

}



/*
 * Process of defining more than one constructor for different purpose
 */

/*
 * NOTE: we should not write any written type for the constructor, if we return any return type for the constructor then theay are treated by the system as a instance method .
 * Hence they required to be called explicitly
 */


class A{
	A(){
		System.out.println("I am DEF");
	}
	void A(int x){
		System.out.println("I am para"+x);
	}
	public static void main(String args[]){
		
		A a = new A();
		a.A(222); //Hence they required to be called explicitly
	}
}

/*
 * We can Restrict to create an object for the class outsid of the class by defining Private onstrcutor in the class
 */

class B{
	
	private B(){
		System.out.println("I am Private, You can't Create an Object for me in another class");
	}
	public static void main(String args[]){
		B b= new B();
	}
}

class C{
	public static void main(String args[]){
		//B b= new B();
	}
}