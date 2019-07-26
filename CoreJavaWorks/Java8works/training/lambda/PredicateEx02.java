package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx02 {
	public static void main(String[] args) {
		
		List<Device> devices = Arrays.asList(
				new Device(1, "Tv", 22000, "Electronics"),
			new Device(2, "Refrigerator", 10000, "Electronics"),
			new Device(3, "trimmer", 500, "Electronics"),
			new Device(4, "baseball bat", 1200, "Sport"),
			new Device(5, "Tennis bat", 800, "Sport"));
		Predicate<Double> priceGreaterThan1000 = i -> i > 1000;
		Predicate<String> isElectronics = i -> i == "Electronics";
		
		System.out.println("Devices having price greater than 1000");
		List<Device> filteredList = filterList(devices,priceGreaterThan1000);
		filteredList.forEach(System.out::println);
		
		System.out.println("Electronics Devices");
		List<Device> filteredList1 = filterList1(devices,isElectronics);
		filteredList1.forEach(System.out::println);
		
	}

	private static List<Device> filterList1(List<Device> devices, Predicate<String> isElectronics) {
		List<Device> filteredList = new ArrayList<>();
		for(Device temp:devices) {
			if(isElectronics.test(temp.getCategory())) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}

	private static List<Device> filterList(List<Device> devices, Predicate<Double> priceGreaterThan1000) {
		List<Device> filteredList = new ArrayList<>();
		for(Device temp:devices) {
			if(priceGreaterThan1000.test(temp.getPrice())) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}
}

