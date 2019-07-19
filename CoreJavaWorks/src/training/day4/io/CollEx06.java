package training.day4.io;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

//to show working of TreeSet
public class CollEx06 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("anurag");
		set.add("vaish");
		set.add("abhi");
		set.add("vaibhav");
		System.out.println(set);
		System.out.println("-------------------------------");
		
		TreeSet<Device> devices = new TreeSet<>(DeviceSortingTemplate.sortByName());
		devices.add(new Device(101, "Laptop", 500));
		devices.add(new Device(102, "Keyboard", 35));
		devices.add(new Device(103, "Presenter", 45));
		devices.add(new Device(104, "Styluss", 67));
		devices.add(new Device(104, "Styluss", 67));
		for (Device temp:devices) {
			System.out.println(temp.hashCode() + "," + temp);
		}
	}
}
