package training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSorting {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(101, "kumar"),
				new Person(23, "subodh"),
				new Person(44, "anurag"),
				new Person(21, "manasi"),
				new Person(26, "vaishnavi"));
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getpId() - o2.getpId();
			}
		});
		persons.forEach(System.out::println);
		
		System.out.println("------------In Asc Order of Id-------------");
		persons.sort((o1,o2) -> o1.getpId() - o2.getpId());
		persons.forEach(System.out::println);
		
		System.out.println("------------In Asc Order of name-------------");		
		persons.sort((Person o1, Person o2) -> o1.getpName().compareTo(o2.getpName()));
		persons.forEach(System.out::println);

		System.out.println("------------In Dsc Order of name-------------");		
		Comparator<Person> perAscName = (o1, o2) -> o1.getpName().compareTo(o2.getpName());
		persons.sort(perAscName.reversed());
		persons.forEach(System.out::println);
		
	}
}
