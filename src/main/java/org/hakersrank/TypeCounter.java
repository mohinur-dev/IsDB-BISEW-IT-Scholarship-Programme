package org.hakersrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TypeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        Object[] array = new Object[n];
        for (int i = 0; i < n; i++) {
            // You might need to handle different types (int, double, string, etc.)
            // For simplicity, let's assume you are dealing with Object type in this example.
            array[i] = readElement(scanner);
        }

        // Count the occurrences of each type
        Map<Class<?>, Integer> typeCountMap = countTypes(array);

        // Print the result
        printTypeCounts(typeCountMap);

        scanner.close();
    }

    // Method to read an element of any type
    private static Object readElement(Scanner scanner) {
        // Implement logic to read elements of different types
        // For simplicity, let's assume all elements are of type Object in this example.
        return scanner.next();
    }

    // Method to count occurrences of each type
    private static Map<Class<?>, Integer> countTypes(Object[] array) {
        Map<Class<?>, Integer> typeCountMap = new HashMap<>();

        for (Object element : array) {
            Class<?> type = element.getClass();
            typeCountMap.put(type, typeCountMap.getOrDefault(type, 0) + 1);
        }

        return typeCountMap;
    }

    // Method to print the type counts
    private static void printTypeCounts(Map<Class<?>, Integer> typeCountMap) {
        for (Map.Entry<Class<?>, Integer> entry : typeCountMap.entrySet()) {
            System.out.println(entry.getKey().getSimpleName() + ": " + entry.getValue());
        }
    }
}

