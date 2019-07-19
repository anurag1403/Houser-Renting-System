package training.day2;

import java.util.Arrays;

public class NameSortEx {

	public static void main(String[] args) {
		String[] names = {"Anurag", "Praneeth", "Himanshu", "Udit",};
		for (String temp:names) {
			System.out.println(temp);
		}
		Arrays.sort(names);
		System.out.println("-------------------------");
		for (String temp:names) {
			System.out.println(temp);
		}
	}

}
