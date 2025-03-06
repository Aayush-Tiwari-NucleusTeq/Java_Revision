package prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		System.out.println("Start of the program");
		
		// Creating list
		List<String> arrList = new ArrayList<>();
		
		// Adding elements
		arrList.add("Aayush");
		arrList.add("Lalit");
		arrList.add("Nachiketa");
		System.out.println(arrList);
		arrList.add("Akash");
		System.out.println(arrList);
		arrList.add(0, "Aayu");
		System.out.println(arrList);
		List<String> newList = new ArrayList<>();
		newList.add("Amit");
		newList.add("Mahendra");
		arrList.addAll(newList);
		System.out.println(arrList);
		System.out.println(arrList.getClass().getTypeName());
		System.out.println(arrList.get(4));
		arrList.set(0, "Nucleus"); // BigO(1)
		System.out.println(arrList);
		
		// Removing elements
		arrList.remove(0);
		System.out.println(arrList);
		arrList.remove(String.valueOf("Lalit"));
		System.out.println(arrList);
		
		System.out.println(arrList.contains("Nachi"));
		
		// Iterating
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println("\n");
		
		for (String string : arrList) {
			System.out.print(string + " ");
		}
		System.out.print("\n");
		
		Iterator<String> it = arrList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
		
		arrList.forEach((i) -> {System.out.println(i + " NucleusTeq");});
	}

}
