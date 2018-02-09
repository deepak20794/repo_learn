package com.core.funda;

public class G_MethodOverloading {
	
	void method(String x){
		System.out.println(x);
	
	}
	
	void method(String x, String y){
		System.out.println(x+" "+y);
	}
	
	void method(int x, int y){
		System.out.println(x+" "+y);
	}
// can you overload main method ? - Yes
	public void main(boolean x){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		G_MethodOverloading mo= new G_MethodOverloading();
		
		mo.method("Deepak");
		mo.method("Manikanta", "Kumpatla");
		mo.method(10, 20);
		mo.main(true);

	}

}
// Is a process of defining more than one method with same name for different purpose
// method name must be same
// List of arguments should NOT be same
// Return type may or may not be same
// Methods should be unique for JVM
