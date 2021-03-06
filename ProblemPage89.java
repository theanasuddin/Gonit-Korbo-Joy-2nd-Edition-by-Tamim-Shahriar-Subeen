package gonitKorboJoy;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemPage89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> wkts_list = new ArrayList<Integer>();
		int[] wkts_list_array = { 6, 5, 6, 4, 3, 1, 3, 2, 1, 0, 5, 3, 3, 2, 2, 1, 3, 4, 3, 3 };

		for (int i : wkts_list_array) {
			wkts_list.add(i);
		}

		for (int i = 0; i < 11; i++) {
			System.out.println("Wicket: " + i + " Count: " + Collections.frequency(wkts_list, i));
		}

	}

}
