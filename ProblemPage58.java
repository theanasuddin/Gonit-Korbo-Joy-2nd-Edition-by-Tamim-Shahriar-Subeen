package gonitKorboJoy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemPage58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		ArrayList<Integer> factors = new ArrayList<Integer>();

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

			factors.clear();
			factors.add(1);
			factors.add(n);

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					factors.add(i);
				}
			}
			Collections.sort(factors);
			System.out.println("Factors of " + n + ": " + factors);
		}
		scan.close();
	}
}
