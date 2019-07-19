package training.day4.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollEx08 {
	public static void main(String[] args) {
		List<String> goodmorning = Arrays.asList("good morning", "namaskara", "bonjour");
		List<String> goodevening = Arrays.asList("good evening", "Shubh sanja", "bonsoir");
		List<String> goodnight = Arrays.asList("good night", "Shbuh Ratri", "bonne nuit");
		Map<String, List<String>> map = new HashMap<>();




		
		map.put("goodmorning", goodmorning);
		map.put("goodevening", goodevening);
		map.put("goodnight", goodnight);
		
		
		
		Iterator<Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, List<String>> next = iterator.next();
			System.out.println("Word " + next.getKey());
			for(String temp : next.getValue()) {
				System.out.println(temp + "\t");
			}
			System.out.println();
		}
	}
}
