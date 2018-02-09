package com.core.funda;

public class N_ParameterizedConstructor {
	
	float l,h;
	N_ParameterizedConstructor(float l, float h){
		this.l=l;
		this.h=h;
	}
	float findArea(){
		return 0.5f*l*h;
	}

	public static void main(String[] args) {
		
		N_ParameterizedConstructor cal = new N_ParameterizedConstructor(4.5f, 5.5f);
		System.out.println(cal.findArea());
	}

}
/*
Defining a Constructor with Primitive type parameters
The class is defined only with the Parameterized constructor
We must pass the parameter to the constructor in order to instantiate the object
if we fail to pass the parameter JVM is trying to call default constructor which is undefined in the class
Hence JVM will raise an error
*/