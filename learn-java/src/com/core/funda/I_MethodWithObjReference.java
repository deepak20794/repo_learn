package com.core.funda;


// Copy data from one object to another object

public class I_MethodWithObjReference {
	
	
	int x,y;
	
	void setData(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	void getData(){
		System.out.println("X value is "+x+"\n"+"Y value is "+y);
		
	}

	void copyData(I_MethodWithObjReference m1) {
						//type			variable
		// now m1 is having the data in mor 
		// m1 is having 10 and 20 in  x and y so to access m1.x  and m1.y
		
		x= m1.x ;
		// x and y are instance of mor1 
		// m1.x means the vaue in mor
		
		y=m1.y ;
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		I_MethodWithObjReference mor = new I_MethodWithObjReference();
		
		System.out.println(mor.x+"\n"+mor.y); // will get default values
		
		
		mor.setData(10, 20);
		System.out.println("Values of mor are ");
		mor.getData();
		
		// mor is having 10 and 20
		
		I_MethodWithObjReference mor1 = new I_MethodWithObjReference();
		
		System.out.println(mor1.x+"\n"+mor1.y); // Default values will be initialized for this object 
		
		mor1 .copyData(mor); // type mor is P_MethodWithObjReference
				//actual - passed at the time of calling
				// Formal p are copies of actual arguments
		// when this method is called control jumps to copy data method now m1 is having the data which is in mor
		
		mor1.getData();
		
		
		

	}

}
