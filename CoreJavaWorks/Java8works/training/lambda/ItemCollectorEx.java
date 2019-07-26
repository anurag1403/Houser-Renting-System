package training.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ItemCollectorEx {
	public static void main(String[] args) {
		
		List<Item> items = Arrays.asList(
				new Item("apple", 10, new BigDecimal(77.28)),
				new Item("banana", 20, new BigDecimal(22.8)),
				new Item("watermelon", 30, new BigDecimal(7.12)),
				new Item("apple", 8, new BigDecimal(56.67)),
				new Item("apple", 1, new BigDecimal(30.88)),
				new Item("apple", 100, new BigDecimal(46.44)),
				new Item("banana", 78, new BigDecimal(20.88)),
				new Item("apple", 12, new BigDecimal(10.88))
				);
		Map<String, Long> counts = items.stream().collect(
				Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counts);
		Map<String, Integer> sumOfQty = items.stream().collect(
				Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(sumOfQty);
		Map<String, Double> avgOfQty = items.stream().collect(
				Collectors.groupingBy(Item::getName, Collectors.averagingDouble(Item::getQty)));
		System.out.println(avgOfQty);
	}
}
