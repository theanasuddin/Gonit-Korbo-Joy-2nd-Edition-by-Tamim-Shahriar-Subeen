package gonitKorboJoy;

import java.util.Scanner;

public class ProblemPage56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		while (true) {
			System.out.println("Please enter a positive integer. Enter 0 to quit: ");
			n = scan.nextInt();

			if (n == 0) {
				break;
			}

			if (n < 0) {
				System.out.println("You must enter a positive integer. Please try again.");
				continue;
			}

			System.out.printf("Factors of %d :", n);
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.printf(" %d", i);
				}
			}
			System.out.printf("\n");
		}
		scan.close();
	}

}
