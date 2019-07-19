package training.day4.io;

import java.util.Vector;

//working of Vector
public class CollEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(7,5);
		System.out.println("Initial Capacity is " + list.capacity());
		System.out.println("Initial Size is " + list.size());
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("five");
		
		System.out.println("Final Capacity is " + list.capacity());
		System.out.println("Final Size is " + list.size());
	}
}
