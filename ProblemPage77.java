package gonitKorboJoy;

import java.util.Scanner;

public class ProblemPage77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int months, rent_per_month;
		float agent_fee, agent_percentage;

		System.out.println("What is yout monthly rent? ");
		rent_per_month = scan.nextInt();

		System.out.println("For how many months you are renting? ");
		months = scan.nextInt();
		scan.close();

		agent_percentage = (float) ((100.00 / 12) * months);
		agent_fee = rent_per_month * agent_percentage / 100;

		System.out.printf("Agent fee is %.2f\n", agent_fee);

	}

}
