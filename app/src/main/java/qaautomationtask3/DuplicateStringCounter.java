package qaautomationtask3;

import java.util.*;

public class DuplicateStringCounter {

    public static Map<String, Integer> findDuplicates(List<String> strings) {
        // Creating a HashMap to store string and its occurrence count
        Map<String, Integer> countMap = new HashMap<>();

        // Iterating through the list of strings
        for (String str : strings) {
            // If the string is already in the map, increment its count
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Creating a result map to store only strings with more than one occurrence
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Find and print duplicate strings with their counts
        Map<String, Integer> duplicates = findDuplicates(strings);
        System.out.println("Duplicates and their counts: " + duplicates);
    }
}