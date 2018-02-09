package com.core.funda;

public class H_ThisEx {

	String x="Deepak"; // Instance
	
	public String method1(){
		String x = "Manikanta"; // Local
		System.out.println(x);
		System.out.println(this.x);
		String y= this.x;
		
		return y;
		
	}
	public static void main(String[] args) {
		
		H_ThisEx m = new H_ThisEx();
		
		       String x =  m.method1();
		       System.out.println(x);
		

	}

}
// When both local and instance are declared with same name priority is given to local
// In order to make the differentiation make use of this for instance fields
