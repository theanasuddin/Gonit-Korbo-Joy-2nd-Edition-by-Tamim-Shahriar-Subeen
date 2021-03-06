package gonitKorboJoy;

import java.util.Scanner;

public class ProblemPage78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, loan_amount, interest_rate, months;
		float total_amount;

		System.out.println("Please enter the loan amount: ");
		loan_amount = scan.nextInt();
		System.out.println("Please enter the interest rate: ");
		interest_rate = scan.nextInt();
		System.out.println("After how many months you want to settle the loan? ");
		months = scan.nextInt();
		scan.close();

		total_amount = (float) (loan_amount + loan_amount * interest_rate / 100.0);

		for (i = 1; i <= months; i++) {
			total_amount = (float) (total_amount + total_amount * interest_rate / 100.0);
			System.out.printf("After month %d, the total amount is %.2f\n", i, total_amount);
		}

	}

}
