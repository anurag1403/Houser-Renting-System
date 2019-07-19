package training.day2;

import java.util.Arrays;

public class StudentSortImpl {

	public static void main(String[] args) {
		Student[] students = { new Student(105, "anu", 22), new Student(101, "abhi", 25), new Student(111, "vaish", 30),
				new Student(102, "manu", 18), new Student(107, "tanu", 27), };
		for (Student temp : students) {
			System.out.println(temp);
		}

		SortingTemplate.sortByNameDsc(students);
		// Arrays.sort(students);
		
		SortingTemplate.sortByIdAsc(students); 
		
		
		System.out.println(SortingTemplate.isStudentFound(students, 101));

		System.out.println("----------------");
		for (Student temp : students) {
			System.out.println(temp);
		}
	}

}
