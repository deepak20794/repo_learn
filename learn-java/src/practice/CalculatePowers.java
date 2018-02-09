package practice;

public class CalculatePowers {

	public static void main(String[] args) {
		
		int num	=	2;
		int pow	=	3;
		System.out.println(power(num, pow));
	}
	
	public static int power(int a, int b){
		
		int power = 1;
		
		for(int c=0; c< b ;c++){
			power*=a;
		}
		return power;
		
	}

}
