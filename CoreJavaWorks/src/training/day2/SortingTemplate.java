package training.day2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
	public static Student[] sortByNameAsc(Student[] students) {
		Comparator<Student> comparatorSortByNameAsc = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};
		Arrays.sort(students, comparatorSortByNameAsc);
		return students;
	}

	public static Student[] sortByNameDsc(Student[] students) {
		Comparator<Student> comparatorSortByNameDsc = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		Arrays.sort(students, comparatorSortByNameDsc);
		return students;
	}

	public static Student[] sortByIdAsc(Student[] students) {
		Arrays.sort(students, (s1, s2) -> {
			return s1.getsId() - s2.getsId();
		});
		return students;
	}
	
	public static Student[] sortByIdDsc(Student[] students) {
		Arrays.sort(students, (s1, s2) -> {
			return s2.getsId() - s1.getsId();
		});
		return students;
	}
	
	public static boolean isStudentFound(Student[] students, int id) {
		int[] ids = new int[students.length];
		int i = 0;
		for (Student a : students) {
			ids[i++] = a.getsId();
		}
		return Arrays.binarySearch(ids, id) >=0;  
	}
}
