package practice;

public class Pyramid {

	public void drawPyramidOfNumbers() {
		for (int i = 1; i < 6; i++) {

			for (int j = 0; j < 6 - i; j++) {

				System.out.print(" ");
			}

			for (int k = 1; k < i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
	public static void main(String args[]){
		
		Pyramid s = new Pyramid();
		s.drawPyramidOfNumbers();
	}
}
