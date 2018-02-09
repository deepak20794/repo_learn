package com.core.funda;

public class D_InstanceFields {
	
	String deepak_rollno = "11071A0219";
	int no= 19;
	float percentage = 75.00f;

	public static void main(String[] args) {
		
		D_InstanceFields i = new D_InstanceFields();
		
		System.out.println(i.deepak_rollno);
		System.out.println(i.no);
		System.out.println(i.percentage);
	}

}

// The variables which are declared within a class without static modifier
// can be called as Object variables
// Memory is always allocated within the object
// Every Object variable must be referred by an Object reference in Static Context
// Instance fields are initialized by their corresponding default values
// In order to access non static content in static context we need object reference 
