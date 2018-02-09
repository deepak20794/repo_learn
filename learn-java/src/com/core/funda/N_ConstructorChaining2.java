package com.core.funda;

public class N_ConstructorChaining2 extends Superclass{
	
	int i =10;
	N_ConstructorChaining2(){
		super(); // optional , as anyhow the first line of constructor is super() 
		System.out.println("Hi BUDDY i am subclass");
	}
	public static void main(String args[]){
		N_ConstructorChaining2 s= new N_ConstructorChaining2();
	}
}

class Superclass {
	int j=30;
	Superclass(){
		System.out.println("I am Super class");
		
	}
	
}

/* Constructor used for Object Creation and initialization
 * 
 * class Vechile{ // (Superclass/Base class)
 * 
 * }
 * 
 * class car extends Vechile // (Subclass/Child)
 * 
 *  whenever sub class is extended by a super class
    Subclass automatically gets all states and behaviors to sub class from super class 
	But remember Constructors are not inherited only states and behaviours are inherited
 *  Whenever you write a class there will be a default constructor
	The purpose of default Constructor indicates JVM to create an object and also helps to instantiate the variables
 * class vechile{

	String model;   // vechile class has a constructor vechile(){}
	String regno;
	double price;
	}

	class Car extends vechile{	
		car(){ // Constructor responsible for initializing variables of only car class the same way vechile class constructor does
		}
	}
	CONCLUSION : The constructor of a class is responsble for intializing the states of that particular class
****************************************************************************************************************	
	class A{

		int i;
	}


	class b extends A{

		double d;}

	Now we can create an object either way

	new B();
		or
	b ref = new B();

	Now the object of b is created at some address 
	and Double d is initialized with default value i.e 0.0 and
	i is also initialized with o but we didn't initialized nor we didn't called constructor of A but it is initialized ...but that initialization will happen only when calling it which certainly not happening

	How this happens is constructor chaining

	REASON -- whenever any class constructor is WRITTEN(Custom or default constructor) ..the 1st line of the code in that constructor is calling immediate super constructor i.e A

	the 1st line of code in that code is super(); through Which it calls 

		class sup{
			int j=30;
			sup(){
			}
		}
		
		class sub extends super{
			int i=10;
				sub(){ 
					super();
					}
				}


****************EXAMPLE 2***************

public class A{

		A(int i){ //Custom constructor

	}

public class B extends A{
  B() // constructor will be like this

  {
 	super(); // will call default constructor or zero param constructot i.e A() -> error
   }
}

Once we write Custom constructor the default constructor is not supplied by the Compiler


 */
