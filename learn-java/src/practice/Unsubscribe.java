package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unsubscribe {

	public static void main(String[] args) {

		int n = 0;

		List<String> subscribelist = new ArrayList<>();

		Scanner number = new Scanner(System.in);

		System.out.println("To Exit :Press Enter\nEnter Phone numbers for subscription:");

		for (int i = 0; i >= n;) {

			System.out.println("Hit enter to exit or Enter Number " + i + " :");

			subscribelist.add(i, number.nextLine());

			if (subscribelist.get(i).isEmpty()) {
				break;
			}

			else {
				i++;
			}

		}

		System.out.println("Program Successfull");

	}

}
