package gonitKorboJoy;

public class ProblemPage27_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 9;
		int divisor = 2;
		int quotient = 0;
		int dividendCopy = dividend;

		while (dividendCopy >= divisor) {
			dividendCopy -= divisor;
			quotient++;
		}

		System.out.print(dividend + " divided by " + divisor + " equals " + quotient);

		if (dividendCopy != 0) {
			System.out.print(" and the remainder is " + dividendCopy);
		}

	}

}
