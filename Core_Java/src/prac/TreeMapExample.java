package prac;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		System.out.println("Start of the program");
		Map<String, Integer> hashMap = new TreeMap<>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		
		hashMap.remove("Five");
		
//		if(!hashMap.containsKey("Aayush")) {
//			hashMap.put("Aayush", 100448);
//		}
//		
//		hashMap.putIfAbsent("Aayu", 19920);
		System.out.println(hashMap);
		
		// Iterating
		for(Map.Entry<String, Integer> e: hashMap.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println();
		for(String s: hashMap.keySet()) {
			System.out.println(s);
		}
		System.out.println();
		for(Integer i: hashMap.values()) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.containsValue(2));
		System.out.println(hashMap.containsKey("One"));
		
		hashMap.clear();
		System.out.println(hashMap);

	}

}
