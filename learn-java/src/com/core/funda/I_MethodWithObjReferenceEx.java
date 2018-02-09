//  Compare the contents of two objects

package com.core.funda;

public class I_MethodWithObjReferenceEx {
	
	int x,y;
	
	void setData(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	boolean	compareData(I_MethodWithObjReferenceEx Q){
			
		if(x==Q.x && y==Q.y)
			return true;
			else
			return false;
		}
	public static void main(String[] args) {
		
		I_MethodWithObjReferenceEx qm = new I_MethodWithObjReferenceEx();
			qm.setData(10,20);
		I_MethodWithObjReferenceEx qm1 = new I_MethodWithObjReferenceEx();
			qm1.setData(10,20);
			boolean result = qm1.compareData(qm);
			System.out.println(result);
			
			if(qm1.compareData(qm))
				System.out.println("Both are same");
			else
				System.out.println("Both are not same");		
			
	}

}
