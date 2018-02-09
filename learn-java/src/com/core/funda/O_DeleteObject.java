package com.core.funda;

public class O_DeleteObject {
	
	int x,y;
	
	O_DeleteObject(){
		x=111; y=222;
	}
	
	void getData(){
		System.out.println(x+"\n"+y);
	//	System.err.println("Error");
	}
	
	protected void finalize(){
		System.out.println("Object is Deleted");
	}

	public static void main(String[] args) {
		
		O_DeleteObject dobj = new O_DeleteObject();
		dobj.getData();
		dobj=null;
		System.gc();
		//dobj.getData();
		O_DeleteObject dobj2 = new O_DeleteObject();
		dobj2.getData();
	}

}
/*
 * Whenever an object is no longer in use we need to delete an object
 * 			ADV : Memory optimization 
 * In order to delete an object we need to place null to the reference
 * 
 * After placing null to the reference then the object becomes unused
 * 
 * GARBAGE COLLECTION : is a subprogram of JVM whose responsibilities are identifying the Unused objects in the memory
 * 
 * if you are trying to access the properties of the class by the reference which is referred to a null then JVM will raise an exception
 *  	java.lang.NullPointerException
 *  
 *  GARBAGE COLLECTOR: is a subprogram of JVM whose responsibilities are "Cleanup" operations
 *  			i.e whatever the unused objects are there in the garbage collection wll be cleared by the garbage collector
 *  
 *  GARBAGE COLLECTOR: is a subprogram of JVM designed for executing at random intervals
 * 			Hence we are not guarantee in execution of Garbage Collector soon after placing null to reference 
 * 
 * In order to invoke the garbage collector explicitly we need to make use of following predefined method
 * 			java.lang.System
 * 				public static void gc();
 * 					Eg: System.gc();
 * 
 * NOTE: whatever the resources has been allocated by us by the time of Object instantiation then the corresponding resources must be deallocated by us by the time of Object destruction
 * 
 * In order to perform the resource deallocation then we need to make use of following predefined method of Object class
 * 
 * 				java.labg.Object
 * 					protected void finalize(){}
 * The finalize will be executed automatically whenever we call System.gc()
 * 
 */
 