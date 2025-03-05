package prac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
//		Set<Integer> set = new HashSet<>(); // Unordered collection, BigO(1)
//		Set<Integer> set = new LinkedHashSet<>(); // Ordered collection(as we put into set)
//		Set<Integer> set = new TreeSet<>(); // Sorted collection, BigO(logN)
//		
//		set.add(11);
//		set.add(22);
//		set.add(11);
//		set.add(33);
//		set.add(101);
//		set.add(1);
//		System.out.println(set);
//		set.remove(101);
//		System.out.println(set.contains(22));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		set.clear();
//		System.out.println(set);
		
		Set<Student> stset = new HashSet<>();
		stset.add(new Student(101, "Aayush"));
		stset.add(new Student(102, "Lalit"));
		stset.add(new Student(103, "Nachiketa"));
		stset.add(new Student(101, "Aayush"));
		System.out.println(stset);
		
	}

}
