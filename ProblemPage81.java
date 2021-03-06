package gonitKorboJoy;

public class ProblemPage81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] li = { 1, 2, 3 };
		System.out.println("Average: " + average(li));
		li = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
		System.out.println("Average: " + average(li));
		li = new int[] { -1, 0, 1 };
		System.out.println("Average: " + average(li));
	}

	public static float average(int[] list) {
		int sum = 0;
		for (int i : list) {
			sum = sum + i;
		}
		return sum / list.length;
	}

}
