package main;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(15);
        numbers.add(8);

        // Using Stream API to perform operations
        System.out.println("Original List: " + numbers);

        // Sorting the list in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted List (Ascending): " + sortedNumbers);

        // Filtering out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
