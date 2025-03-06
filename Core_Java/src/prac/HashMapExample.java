package prac;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		System.out.println("Start of the program");
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("One", 1001);
		hashMap.put("Two", 1002);
		hashMap.put("Three", 1001);
		
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
		System.out.println(hashMap.containsValue(1234));
		System.out.println(hashMap.containsKey("One"));
	}
}
