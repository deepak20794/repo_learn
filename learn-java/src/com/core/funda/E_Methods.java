package com.core.funda;

public class E_Methods {
			//1
	        public  void withoutArg_withoutReturn(){
	        	  int a = 100;
	        	  int b = 200;
	        	  int c = a+b;
	        	  System.out.println(c);
	        	  
	          }
	        //2
	        public int withoutArg_withReturn(){
	          	  int a = 100;
	        	  int b = 200;
	        	  int c=a+b;
	              return c;
	        }
	        //3
	        public void withArg_withoutReturn(int x, int y){
	        	// x and y is a local to this method
	        	// Formal parameters are acting as Local varaibles
	        	
	        	int s=x+y;
	        	System.out.println(s);        	
	        }
	        //4
	        public int withArg_withReturn(int x, int y){        	
	        	int sum=x+y;	        	
	        	return sum;
	        }
	        
	        

	public static void main(String[] args) {
		
			E_Methods m = new E_Methods();
					m.withoutArg_withoutReturn();
			 int a= m.withoutArg_withReturn(); 
			 // This method is returning a value means giving so we need to take and store it into a variable
					  System.out.println("Return values is "+a);
					m.withArg_withoutReturn(10, 20);
			 // Actual parameters are one we are passing may be variables/values/expression at the time of calling
			 int b=	m.withArg_withReturn(100, 500);
			 		  System.out.println("Return value is "+b);
					 
	}

}

// Memory is always allocated in STACK
// if you want to perform any operation corresponding logic should be present in form of method
// whenever you want to perform same logic for multiple no of times either in same/different program
// Method means which returns a value
// Methods are 2 types
	//1. Pre defined or Built-in methods:
		// which are provided by SUN MICRO SYSTEM along with JDK
	//2. User defined or customized methods-
		// Defined by us for our programming requirements

// Method prototypes - 4 types
	// 1. Method without argument without return value
	// 2. Method without argument with return value
	// 3. Method with argument without return value
	// 4. Method with argument with return value

// syntax
  /* <modifiers> ~ <return type> ~ <method name>([List of args])
      {
        [local variables];
        statements(s);
        [return <value/variable/expression>]; 
   */
// whenever you want to use the value calculated by called method in calling method we need to define a return

// method definition 
  /*  
    Hi(){
    }
  */

