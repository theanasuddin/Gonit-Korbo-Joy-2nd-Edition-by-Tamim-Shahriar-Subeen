package gonitKorboJoy;

import java.util.HashSet;
import java.util.Set;

public class ProblemPage112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// samit's favorite games
		String[] SInArray = { "cricket", "football", "table tennis", "badminton", "chess" };
		Set<String> S = new HashSet<String>();

		for (String string : SInArray) {
			S.add(string);
		}
		System.out.println("What is the type of S? " + S.getClass());
		System.out.println("Is cricket present in S? " + S.contains("cricket"));
		System.out.println("Is hockey present in S? " + S.contains("hockey"));

		// avik's favorite games
		String[] AInArray = { "cricket", "football", "basketball", "swimming", "volleyball" };
		Set<String> A = new HashSet<String>();

		for (String string : AInArray) {
			A.add(string);
		}

		// getting union
		Set<String> union = new HashSet<String>(S);
		union.addAll(A);
		System.out.println("\nS1 = S | A \n" + union);

		// getting intersection
		Set<String> intersection = new HashSet<String>(S);
		intersection.retainAll(A);
		System.out.println("\nS2 = S & A \n" + intersection);

		// only samit's favorite games or only avik's favorite games
		Set<String> difference = new HashSet<String>(union);
		difference.removeAll(intersection);
		System.out.println("\nS1 - S2 \n" + difference);

		// 2nd way
		Set<String> differenceSA = new HashSet<String>(S);
		differenceSA.removeAll(A);
		System.out.println("\nS1 = S - A \n" + differenceSA);

		Set<String> differenceAS = new HashSet<String>(A);
		differenceAS.removeAll(S);
		System.out.println("\nS2 = A - S \n" + differenceAS);

		Set<String> unionASSA = new HashSet<String>(differenceSA);
		unionASSA.addAll(differenceAS);
		System.out.println("\nS1 | S2 \n" + unionASSA);

		// empty set
		Set<String> emptySet = new HashSet<String>();
		System.out.println(
				"\nEmpty set \n" + emptySet + "\nSize " + emptySet.size() + "\nIs empty? " + emptySet.isEmpty());
	}

}
