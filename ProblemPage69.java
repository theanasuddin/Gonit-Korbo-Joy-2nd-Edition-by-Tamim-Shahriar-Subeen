package gonitKorboJoy;

import java.util.Scanner;

public class ProblemPage69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, temp;

		System.out.println("Enter the first number: ");
		a = scan.nextInt();
		System.out.println("Enter the second number: ");
		b = scan.nextInt();
		scan.close();

		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		while (a != b) {
			if (b == 0) {
				break;
			}
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		
		System.out.println("GCD is " + a);
	}

}
