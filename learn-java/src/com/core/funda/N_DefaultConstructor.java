package com.core.funda;

public class N_DefaultConstructor {
	
	float l,b;
	
	N_DefaultConstructor(){
		l=4.0f; //this.l =4.0f
		b=4.0f;
	}
	   float findArea(){
		   return l*b;
	   }
	public static void main(String[] args) {
		
		N_DefaultConstructor rect = new N_DefaultConstructor();
		
		System.out.println(rect.findArea());
		

	}

}

/*NOTES
 * In general we use setter(mutable) and getter(immutable) methods for non static fields
 * Ex:
 * 		class sample{
 * 			int x,y;
 * 			void setData(){
 * 				x=11; y=22;}
 * 			void getData(){
 * 				system.out.println(x);
 * 				system.out.println(x); }
 * 			P S V M(S a[]){
 * 				Sample s = new Sample();
 * 					s.setData();
 * 					s.getData();
 * 			}
 * 
 * If we use Constructor  - Defining a special method whose same exactly same with Class  name
 * 				void setData(){
 * 				x=11; y=22;}
 * The above two lines are not required
 * Whenever we are calling constructor an Object of a class is instantiated and initialized both will be done at a point 
 * CONSTRUCTOR DOESNT REQUIRE RETURN TYPE
 */

/*
 * It is an initializer method, used for object instantiation and Object initialization
 * Instantiation is nothing but creating an object
 * Initialization is not only the matter of initializing the values for fields. It is a matter of resource allocation
 */


/*
 * Difference between STATIC BLOCKS and CONSTRUCTORS? 
 *	Both are meant for resource allocation
 * 	If you want to perform any resource allocation before object instantiation then the corresponding logic is recommended to write under the static block
 * Similarly, if you want to perform only resource allocation by the time of object instantiation then the logics are recommended to write under constructors
 */

/*
 * Difference between INSTANCE METHODS and CONSTRUCTORS?
 * 
 * Instance methods required to be defined one time and it can be invoked 'n' no of times after object instantiation
 * Instance methods required to be call explicitly
 * IM will have return type
 *  IM require an Object reference
 *  CONSTRUCTORS are defined one time, it can be invoked only once in order to instantiate the object
 *  C does.t require object ref
 *  Constructors are invoked implicitly
 *  Constructors require an operator new 
 *  C doesn't require return type
 */
 
/*Do we require constructor in the class to create an object ?
 *  YES, by the time of compiling the java program, the java compiler will ensure is the class is defined with any constructor or not
 *  If the class is not defined with any constructor then JVM will take the responsibility in defining a constructor called COMPILED COSTRUCTOR
 *  With the help of COMPILED CONSTRUCTOR only we can create object for the class
 */

/* 
 * Class A{
 * }
 * 
 * javac A.java
 * javap A
 * javap is a utility program used to display content of a dot class file
 * 
 * javap A
 * compiled from A.java
 * Class A extends java.lang.object{
 * A(); // Compiled Constrcutor
 * }
 * 
 */

/*
 * RULES for CONSTRUCTORS
 * 1. C and Class name bust be same
 * 2. C can be parameterized
 * 3. It can be overloaded
 * 4. It can be nexted
 * 5. Execution order is from Top- Bottom
 * 6. Never return any return type even Vois type
 */

/*
 * TYPES of CONSTRUCTORS
 * 1.Default
 * 2.Parameterized
 * 3.Copy
 */
