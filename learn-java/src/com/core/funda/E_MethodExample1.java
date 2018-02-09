package com.core.funda;

public class E_MethodExample1 {
	
	int ab, cd;
	
	float findArea(float rad){
		float area;
		area= 3.14f*rad*rad;
		return area;	
	}
	
	float findRectangle(float l, float b)
	{
		float area;
		area = l*b;
		return area;
	}

	public static void main(String[] args) {
		E_MethodExample1 me = new E_MethodExample1();
		float area = me.findArea(50.2f);
		System.out.println(area);
		System.out.println("Area od Rectangle is "+me.findRectangle(20.5f, 30.6f));
		

	}

}

// The variable which are declared in a method can be used in that method only
// whereas a variable which is declared in the class scope can be used throughout the class
