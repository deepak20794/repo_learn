package com.core.funda;

public class P_Inheritance_HasA2 {

	public static void main(String[] args) {
		
		Systems.out.print("Deepak");
	}

}
  class Master1{
	void print(String s){
		System.out.print("Hello "+s);
	}
}

class Systems{
	static Master1 out = new Master1();
}

/*

out is a variable of type Master belongs to System class which is non static

Now make out as static, so out is a class variable or static variable

Now we need to call print method

print method is non static of Master class can be accessed by object reference of Master class in to Static class

	out.print("Sashi")
	
	out is a member of System class which is static
	
	Static members can be accessed by Class name in same or different class
	
	system.out.print("Sashi");

*/