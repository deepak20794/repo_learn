package com.core.funda;

public class N_CopyConstructor {
	int x,y;
	N_CopyConstructor(){
		x=111; y=222;
	}
	
	N_CopyConstructor(N_CopyConstructor ncc){
			x =	ncc.x;
			y = ncc.y;
		
	}
	
	void getData(){
		System.out.println(x+""+y);
	}

	public static void main(String[] args) {
		
		N_CopyConstructor cc = new N_CopyConstructor();
			cc.getData();
		N_CopyConstructor cc1 = new N_CopyConstructor(cc);	
			cc1.getData();
	}

}
/* 
 * Defining a Constructor with reference type parameter
 * The main moto of copy constructor is copying the content of one object to another object
 * In order to work with the copy constructor then the corresponding class ust be defined with either default constructor or parameterized constructor along with copy constructor
 */
