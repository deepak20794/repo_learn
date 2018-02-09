package com.core.funda;

public class J_StaticVaraiblesEx {
	
	int sno; String sname; static String course="Java"; // as course is common to a batch
	
	void setStudentData(int x, String name){
		
		sno=x; sname=name;
		
	}
	
	void getStudentData(){
		System.out.println(sno+"\n"+sname+"\n"+course);
		
	}

	public static void main(String[] args) {
		J_StaticVaraiblesEx sv1 = new J_StaticVaraiblesEx();
		sv1.setStudentData(119, "Deepak");
		sv1.getStudentData();
		J_StaticVaraiblesEx sv2 = new J_StaticVaraiblesEx();
		sv2.setStudentData(120, "Manikanta");
		sv2.getStudentData();
	}

}
