package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		list.add(45);
//		list.add(55);
//		list.add(35);
//		list.add(105);
//		list.add(105);
//		list.add(105);
//		System.out.println(list);
//		
//		System.out.println(Collections.min(list));
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.frequency(list, 105));
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println(list);
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(5, "Aayush"));
		list.add(new Student(4, "Nachi"));
		list.add(new Student(8, "Lalit"));
		list.add(new Student(2, "Gunjan"));
		list.add(new Student(6, "Akash"));
		
		// Iterator
		System.out.println("Iterating via Iterator");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
//			if(student.rollno == 8) {
//				iterator.remove();
//			}
			System.out.println(student.toString());
		}
		
		

		System.out.println(list);
		System.out.println("\n Sorting");
		Collections.sort(list);
		// Comparable sort
		System.out.println(list);
		// Comparator sort
		Collections.sort(list, (obj1, obj2) -> obj1.name.compareTo(obj2.name));
		System.out.println(list);
		
	}

}
