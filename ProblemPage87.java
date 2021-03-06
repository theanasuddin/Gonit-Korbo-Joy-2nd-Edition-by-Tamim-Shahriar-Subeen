package gonitKorboJoy;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemPage87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> incomes = new ArrayList<Integer>();
		int[] incomes_array = { 10000, 10000, 20000, 20000, 20000, 20000, 20000, 30000, 500000, 500000 };
		
		for (int i : incomes_array) {
			incomes.add(i);
		}

		float median_income = median(incomes);
		System.out.println("Median for Income: " + median_income);
	}

	public static float median(ArrayList<Integer> li) {
		Collections.sort(li);
		int count = li.size();

		if (count == 0) {
			return -1.0f;
		}

		if (count % 2 == 1) {
			int mid = count / 2;
			return (float) li.get(mid);
		} else {
			int mid2 = count / 2;
			int mid1 = mid2 - 1;
			return (float) (li.get(mid1) + li.get(mid2)) / 2;
		}
	}

}
