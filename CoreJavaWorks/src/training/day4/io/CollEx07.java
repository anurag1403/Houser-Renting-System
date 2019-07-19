package training.day4.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Harry", 2000);
		map.put("Potter", 3000);
		map.put("Ron", 4000);
		System.out.println(map.get("Harry"));
		
		Set entrySet = map.entrySet();
		java.util.Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry temp = (java.util.Map.Entry) itr.next();
			System.out.println("Key is " + temp.getKey() + ",value is " + temp.getValue());
			
		}
	}
}
