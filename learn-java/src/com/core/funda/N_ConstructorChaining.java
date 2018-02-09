package com.core.funda;

public class N_ConstructorChaining {
	
	N_ConstructorChaining(){
		System.out.println("I am default");
	}
	
	N_ConstructorChaining(int x){
		this();
		System.out.println("I am para"+x);
	}
	
	N_ConstructorChaining(int x, int y){
		this(x);
		System.out.println("I am para"+x+""+y);
	}

	public static void main(String[] args) {
		N_ConstructorChaining chain = new N_ConstructorChaining(10,20);
		
		
	}

}

/* It is a process of calling an existed constructor into another constructor at the same class
 * it is possible by using this()
 * In constructor chaining this() must be the first statement
 */
