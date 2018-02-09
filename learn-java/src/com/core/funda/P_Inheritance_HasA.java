package com.core.funda;


public class P_Inheritance_HasA {
	
	public static void main(String args[]){
		SubB sb = new SubB();
		System.out.println(sb.y);
		System.out.println(sb.sa.x);
		System.out.println();
		
	}
	
	

}

class SuperA{
	
	int x=100;
}

class SubB{
	
	int y =200;
	SuperA sa = new SuperA();
	
}

/*   HAS-A Relationship
 * 		It is a process of creating the object of the super class into the subclass.
 * 		By the reference of super class we can access the properties of super class into sub class
 * 
 	Syntax:
 			[Modifiers] <class> <SuperClassName>
 			{
 			  fields/methods
 			}
 			
 			[Modifiers] <class> <SubClassName>
 			{
 			  <SuperClassName> <super_reference> =new <SuperClassName>([List of args]);
 			   fields/methods
 			}
 			
 * Note: Reference variable will hold the address i.e hash code
 *
 * 						PROGRAM EXPLINATION
 * 
 * y is a variable of integer type
 * sa is a variable of SuperA type
 * with the help of class keyword we can define our own data type called user defined datatype i.e suoerA is datatype
 * y and sa are members of subB which are non static means instance members of subB class
 * 
 * i want to access y in P_Inheritance_HasA
 * 		y is member of subB - non static
 * 					sb.y
 * 
 * 
 * I want to access x
 * 		x is in SuperA - non static of superA which can be accesses by object reference of superA i.e sa.x
 * 
 * 				sa is member of subB
 * 
 * 						sb.sa.x

 */
