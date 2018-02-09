package com.core.funda;

public class Q_Polymorphism {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x+y); //30
		System.out.println("Deepak"+"Manikanta"); //DeepakManikanta
	}

}

/*Poly means many morphism means nothing but behavior or forms

In simple words polymorphism is nothing but ability to generate multiple forms

polymorphism plays an important role in allowing multiple objects to have different internal structure 
by sharing same external interface 


polymorphism categorized in two ways
	1. Compiled time polymorphism
	2. Run time polymorphism
	
1. Compiled time polymorphism always takes place based on the REFERENCE of the object.
	The decisions will be taken at the time of compilation.Hence it is called static binding or early binding
	Eg: Overloading
	
2. Run time polymorphism always taken place based on the object we are passing through the reference
	It will be done at the time of execution .Hence it is called late binding or dynamic binding or 
	Method dispatching
	
	Eg: Overriding
	*/