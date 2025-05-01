package prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {

	public static void main(String[] args) {
		System.out.println("Concurrent demo class");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(100, "Aayush Tiwari");
		hashMap.put(101, "Lalit Patel");
		hashMap.put(102, "Nachiketa Mohanty");
		hashMap.put(103, "Gunjan Ujjainiya");
		
		System.out.println("Before modification" + hashMap);
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			if(entry.getKey() == 101) {
//				hashMap.remove(entry.getKey());
////				hashMap.put(300, "Dummy value");
//			}
//			hashMap.put(400, "Dummy value");
//			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("After modification" + hashMap);
		
		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put(100, "Aayush Tiwari");
		concurrentHashMap.put(101, "Lalit Patel");
		concurrentHashMap.put(102, "Nachiketa Mohanty");
		concurrentHashMap.put(103, "Gunjan Ujjainiya");
		
		for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
//			concurrentHashMap.put(400, "Dummy value");
			if(entry.getKey() == 101) {
				concurrentHashMap.remove(entry.getKey());
			}
		}
		
		System.out.println(concurrentHashMap);
	}
}
