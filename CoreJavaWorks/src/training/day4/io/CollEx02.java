package training.day4.io;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Before Adding -> Size: " + list.size());
		list.add("hello");
		list.add("anu");
		list.add("vaish");
		list.add("chopsticks");
		System.out.println("After Adding -> Size: " + list.size());
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("----------------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------");
		list.add(1, "bill");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(list.get(0));
		list2.add(list.get(1));
		System.out.println(list2);
	}
}
