package com.core.funda;

public class R_OverloadingVSOverriding1 {
	
	int x,y;
	R_OverloadingVSOverriding1(int x, int y){
		this.x=x; this.y=y;
	}
	
	public boolean equals(Object o){
		
		R_OverloadingVSOverriding1 obj = (R_OverloadingVSOverriding1) o;
		 if(x==obj.x && y==obj.y)
			 return true;
		 else
			 return false;
	}

	public static void main(String args[]){
		
		R_OverloadingVSOverriding1 t1 = new R_OverloadingVSOverriding1(10,20);
		R_OverloadingVSOverriding1 t2 = new R_OverloadingVSOverriding1(10,20);
		
		if(t1.equals(t2))
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
		
	}

}



/*Is it possible to override the predefined methods in Java language?
		ans: Yes
		
		java.lang.Object
			public boolean equals(Object):
This method is used to compare the hash codes of two objects
Following program determines overriding the equals method of object class to compare the content of two objects


*/