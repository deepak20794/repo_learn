package practice;

import java.util.Random;

public class A_Random {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println(rand.nextInt(10)); // 0-9
		
		int n = rand.nextInt(20) + 1;   // 1-20 inclusive
		System.out.println(n);
		
		int n1 = rand.nextInt(7) + 4;
		System.out.println(n1); //A random integer between 4 and 10 inclusive
		String email = "ecommoffshore"+rand.nextInt(9999)+rand.nextInt(999)+1+"@gmail.com";
		System.out.println(email);
	}

}
