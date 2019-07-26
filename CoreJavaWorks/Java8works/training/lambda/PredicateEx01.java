package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx01 {
	public static void main(String[] args) {
		Predicate<Integer> positiveNumber = i -> i >= 0;
		Predicate<Integer> negativeNumber = i -> i < 0;
		List<Integer> integerList = Arrays.asList(23,34,45,-12,-33,0,100);
		//we need only positive nos
		List<Integer> filteredList = filterList(integerList, positiveNumber);
		System.out.println("positive numbers...");
		filteredList.forEach(System.out :: println);
		//we need only negative nos
		List<Integer> filteredList1 = filterList(integerList, negativeNumber);
		System.out.println("negative numbers...");
		filteredList1.forEach(System.out :: println);
	}

	private static List<Integer> filterList(List<Integer> integerList, Predicate<Integer> positiveNumber) {
		List<Integer> filteredList = new ArrayList<>();
		for(Integer temp:integerList) {
			if(positiveNumber.test(temp)) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}
}
