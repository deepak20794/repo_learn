package com.core.funda;

public class F_InstanceMethodsEx1 {
	
	int m1,m2,m3 ; // Let's suppose say these variables should be used for different purpose in different methods
	 			   // So create 
	
	// Setter method
	void setStudent(int a,int b,int c){
		m1=a;m2=b;m3=c;
	}

	boolean findResult(){
		if(m1>34&&m2>34&m3>34)
			return true;
			else
			return false;
		}
	
	public static void main(String[] args) {
		
		F_InstanceMethodsEx1 ime1= new F_InstanceMethodsEx1();
		ime1.setStudent(55,32,98);
		
		boolean result = ime1.findResult();
		  if(result)
		      System.out.println("pass");
		  else
			  System.out.println("fail");
		
		
		 if(ime1.findResult())
		  System.out.println("Student pass");
		 else
		  System.out.println("Student fail");
 }
}

// If you want to access instance fields we create Setter and Getter methods

/* Getter and setter methods are used to retrieve and manipulate private variables in a different class.
A "getter" method does as it name suggest, retrieves a the attribute of the same name. A setter method allows you to set the value of the attribute.*/


/*When you are accelerating your car cars accelerator pedal in your game, you do car.setSpeed(increased_value); 
To read the current speed (for example, to display it on screen or calculate some physics), you do car.getSpeed() and use that value as you want to.*/