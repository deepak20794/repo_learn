package com.core.funda;

public class K_StaticBlocks {

	static{System.out.println("Static 1");}
	static{System.out.println("Static 2");}
	
	public static void main(String args[]){
		
		System.out.println("I am main");
	}
	static{System.out.println("Static 3");}
	
		

	}




// Syntax for Static Blocks
// Static{ Statements(s); }
// Static blocks are nothing but initial blocks and initializer blocks
// These blocks are executed first before the main method
// These blocks are executed automatically whenever class is loaded into the memory
// ***These blocks are recommended to use for resource allocation such as network connections, database connections, Opening the files etc
/*
 * Can i Execute java program without main method
 *  class TestIQ
 *  {
 *  	static{
 *  		sysout("Hello");
 *  		sysout("Have a nice day");
 * 			sysout("Java prog without main");
 * 			system.exit(1);
 * }
 * }
 * 
 * OUTPUT: Hello
 * 			Have a nice day
 * 			JAva prog without main
 * 			Error: java.lang.NosuchMethodError(After executing static block Jvm will search for main method)
 * 			So tell the JVM to come out after executing the block
 *  NOTE:   java.lang.System
 *  			public static void exit(int);
 *  				System.exit(1);
 *  (exit method belongs to system class of java.lang package, its return type is void & Static method of System class)
 *  It is a predefined method of System class
 *  It is used to terminate the Program execution from that particular point only
 *  You can pass any int value 0,1,10,15
 *  
 *  EXAMPLE FOR ERROR : try in a new file
 *  public class T_StaticBlocksEx {
	
	int x=100;
	static{x=100;} // cannot refere non static into static
	static{x+=100;}

	public static void main(String[] args) {
		x+=100;
		System.out.println("I am main"+x);
		static{x=100;}

	}

}
 */
