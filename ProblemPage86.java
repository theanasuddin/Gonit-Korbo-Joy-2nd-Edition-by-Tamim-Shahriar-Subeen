package gonitKorboJoy;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemPage86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> run_robin = new ArrayList<Integer>();
		int[] run_robin_array = { 95, 88, 47, 0, 10, 1, 5, 12, 0, 3 };
		ArrayList<Integer> run_shomit = new ArrayList<Integer>();
		int[] run_shomit_array = { 10, 40, 20, 37, 0, 1, 25, 35, 30, 33 };

		for (int i : run_shomit_array) {
			run_shomit.add(i);
		}

		for (int i : run_robin_array) {
			run_robin.add(i);
		}

		float median_robin = median(run_robin);
		float median_shomit = median(run_shomit);

		System.out.println("Median run for Robin: " + median_robin);
		System.out.println("Median run for Shomit: " + median_shomit);
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
