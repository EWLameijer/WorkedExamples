package enhancedforloops;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {
    public static void main(String[] args) {
        // Examples: try to explain why the below work...

        // Example 1 of 3: enhanced for loop to display the contents of an array. Why does this work?
        int[] numbers = {1, 5, 7, 2, -10, 90, 21};
        for (int number : numbers) {
            System.out.println(number);
        }

        // Example 2 of 3: transforming strings. Why does this work?
        List<String> names = List.of("Ben", "Jerry", "Tom");
        List<String> capitalizedNames = new ArrayList<>();
        for (String name : names) {
            capitalizedNames.add(name.toUpperCase());
        }
        System.out.println(capitalizedNames);

        // Example 3 of 3: Why does this work?
        double[] temperatures = {5, -4.7, 0, 3, 15, -17, -2.1};
        for (double temperature : temperatures) {
            if (temperature < 0) System.out.println("It was freezing at " + temperature);
        }

//        // Find the mistake 1 of 3
//        for (ch : "Donald".toCharArray()) {
//            System.out.println(Character.toUpperCase(ch));
//        }

        // Find the mistake: 2 of 3
//        int sum = 0;
//        for (var a new int[]{5,5,4,3}) {
//            sum += a;
//        }
//        System.out.println(sum);

        // find the mistake: 3 of 3
//        List<Boolean> responses = List.of(true, false, true, true);
//        for (boolean response : responses); {
//            System.out.println("There was a response");
//        }

        // fill in the missing part: 1 of 3
//        String[] animals = { "otter", "zebra", "tortoise"};
//        for ( animals ) System.out.printf("I like %ss\n", animal);

        // fill in the missing part: 2 of 3
//        List<Integer> grades = List.of(5,8,9,10,7,4);
//        for (var grade) {
//            if (grade >= 6) System.out.println("A student passed!");
//        }

        // fill in the missing part: 3 of 3
//        char[] letters = {'Q','A','R','K'};
//        for (letter: letters) {
//            System.out.print((char)(letter + 1));
//        }

        // Exercise 1: print out all letters in this list on one line each
        // so
        // E
        // Q
        // ...
        // P
        List<Character> beautifulLetters = List.of('E', 'Q', 'M', 'J', 'K', 'P');

        // Exercise 2: create a list of squares (n^2) from the original array. So if the original list is (2, 7, 12) then
        // the new list should contain 4, 49, 144
        int[] originalNumbers = {2, 7, 12};
        ArrayList<Integer> squares = new ArrayList<>();
        // your code here ...
        System.out.println(squares);

        // Exercise 3: calculate the average of a list using an enhanced for-loop
        List<Double> listToCalculateAverageFrom = List.of(2.5, 8.0, 3.2);
        double sumOfNumbers = 0;
        // your code here
        System.out.println(sumOfNumbers / listToCalculateAverageFrom.size());
    }
}
