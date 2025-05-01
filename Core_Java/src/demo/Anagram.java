package demo;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Length check
        if (str1.length() != str2.length()) {
            return false;
        }

        // Count characters in str1
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Subtract character counts using str2
        for (char c : str2.toCharArray()) {
            if (!countMap.containsKey(c)) return false;
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0) return false;
        }

        return true; // All counts must be zero now
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));  // true
        System.out.println(isAnagram("Hello", "Olelh"));    // true
        System.out.println(isAnagram("Hello", "World"));    // false
    }
}

