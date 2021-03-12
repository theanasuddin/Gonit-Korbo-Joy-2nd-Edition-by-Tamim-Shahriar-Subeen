package gonitKorboJoy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemPage61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		int sqrt_n;
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

			sqrt_n = (int) Math.sqrt(n);

			for (int i = 2; i <= sqrt_n; i++) {
				if (n % i == 0) {
					factors.add(i);
					factors.add(n / i);
				}
			}
			factors = removeDuplicates(factors);
			Collections.sort(factors);
			System.out.println("Factors of " + n + ": " + factors);
		}
		scan.close();
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList) {
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (Integer integer : originalList) {
			if (!newList.contains(integer)) {
				newList.add(integer);
			}
		}

		return newList;
	}
}
