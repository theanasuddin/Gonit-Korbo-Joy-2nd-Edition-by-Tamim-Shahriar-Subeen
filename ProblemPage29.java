package gonitKorboJoy;

public class ProblemPage29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;

		System.out.printf("%d x %d = %d", a, b, a * b);
		System.out.printf("%d / %d = %d", a, b, a / b); // will throw ArithmeticException, error message "Exception in thread "main" java.lang.ArithmeticException: / by zero"
	}
}
