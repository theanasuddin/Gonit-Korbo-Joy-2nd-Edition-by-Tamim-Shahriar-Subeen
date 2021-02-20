package gonitKorboJoy;

public class ProblemPage27_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 10;
		int divisor = 2;
		int quotient = 0;

		while (dividend != 0) {
			dividend -= divisor;
			quotient++;
		}

		System.out.println("10 divided by " + divisor + " equals " + quotient);
	}

}
