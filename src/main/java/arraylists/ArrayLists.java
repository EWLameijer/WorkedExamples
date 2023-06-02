package arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList API: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
        // the API has 31 methods and 3 constructors
        // For a number of challenges, checking the list of all methods is helpful, but in most cases it is sufficient
        // to know about 7 to 10:

        // *Most-used operations*
        // size(): returns the number of elements of the list
        // get(int n): gets the value of the nth element of the list (as with arrays, a list starts with the 0th element)
        // add(T valueToAddAtEnd)

        // *Finding element*
        // contains(T elementToFind): boolean : is this element in the list?
        // indexOf(T elementToFind): int: first position the element is in the list (-1 if not found)
        // lastIndexOf(T elementToFind): int: first position the element is in the list (-1 if not found)

        // *Miscellaneous: not used that often, as you generally only add to a list, not modify it*
        // remove(int indexOfElementToRemove): T: removes the element at the given index, and returns it
        // remove(Object elementToRemove): boolean: removes the first occurrence of an element, returns true if
        //     successful
        //     What if you have a list of Integers and call remove(3)? 3 is an int, and int is mo, so the element at index 3
        //     will be removed. If you want to remove the VALUE 3, you need remove((Integer)3).
        //     Since int is more specific than Object (you can convert every int into an object, but not every object
        //     into an int, the overload with int takes precedence and you remove the 3th element of the list.
        //     If you want to remove the VALUE 3 from the list, use remove((Integer)3) or remove(Integer.valueOf(3))
        // add(int index, T value): inserts the value at the indexth position
        // set(int index, T value): CHANGES the value at the indexth position
        // clear() : empties list
        //
        // Handy nowadays is also the combination of
        // ArrayList<String> myList = new ArrayList<>(List.of("eeny", "meeny", "miny", "moe"));
        // using a combination of one of the three ArrayList constructors and the List.of() static method
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
        // This way you can easily create a list with predefined values, in contrast to creating an ArrayList and then
        // repeatedly calling add()

        // Example 1: Looping over a list. How does this work?
        List<Integer> smallPrimes = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19));
        for (int prime : smallPrimes) {
            System.out.println(prime);
        }

        // Example 2: getting the contents at a certain position. How does this work?
        System.out.println("Which prime do you want to see? (1 => 2, 2 => 3, 3 => 5): ");
        Scanner in = new Scanner(System.in);
        int primeIndex = in.nextInt();
        System.out.printf("Prime number %d is %d.\n", primeIndex, smallPrimes.get(primeIndex - 1));

        // Example 3: getting the size and adding to the list. How does this work?
        System.out.printf("I have %d primes\n", smallPrimes.size());
        smallPrimes.add(23);
        smallPrimes.add(29);
        System.out.printf("I now have %d primes\n", smallPrimes.size());

        List<String> sentence = new ArrayList<>(List.of("the quick brown fox jumps over the lazy dog".split(" ")));
        System.out.println("Is there a dog? " + sentence.contains("dog"));
        System.out.println("Is there a fox? " + sentence.contains("fox"));
        System.out.println("Is there a cat? " + sentence.contains("cat"));
        System.out.println("The first position of 'the' is " + sentence.indexOf("the"));
        System.out.println("The last position of 'the' is " + sentence.lastIndexOf("the"));
        System.out.println("The position of 'cat' is " + sentence.indexOf("cat"));

        // Find the error 1: how to fix this?
        System.out.print("Please give the word to search: ");
        String soughtWord = in.next();
        System.out.println("That word is found at index " + sentence.contains(soughtWord));

        // Find the error 2: how to fix this? (after uncommenting the code, of course)
//        List<String> prizes = List.of("gold", "silver", "bronze");
//        System.out.println("You've got the first prize: " + prizes[0]);

        // Find the error 3: how to fix this?
        // System.out.println("The last word in the sentence is '" +sentence.get(sentence.size()) + "'.");

        // Fill in the missing code (1 of 3)
        // Note: rei = 0 ...kyuu = 9
        List<String> japaneseNumbers = new ArrayList<>(List.of("rei", "ichi", "ni", "san", "yoku", "go", "roku", "nana", "hachi", "kyuu"));
        //System.out.println("I know %d Japanese numbers!\n", japaneseNumbers???);

        // Fill in the missing code (2 of 3)
        System.out.print("Which digit do you want to know the Japanese word for? ");
        int digit = in.nextInt();
        //System.out.printf("%d in Japanese is '%s'.", digit, ***YOURCODEHERE*** );

        // Fill in the missing code (3 of 3)
        // japaneseNumbers // juu, juuichi, juuni (add these to the end of the list)
        System.out.println("The Japanese numbers I know are: ");
        for (String number : japaneseNumbers) {
            System.out.println(number);
        }
        // should print rei ... juuni

        // Code on your own: 1/3
        // Make an ArrayList of heights of presidents (https://presidenstory.com/stat_tal.php)
        // We'l just take 4 for now: take the heights of the top and bottom of each list: so Lincoln( 1.93),
        // Reagan (1.85), Madison (1.63), and Hayes(1.73)

        // Part 2:
        // print out all the heights

        // Part 3: show the number of heights you have now (should show 4, but you should get that number
        // from the list, not "System.out.println(4)" (after all, we may add presidents)

        // Part 4: Calculate the average height of your presidential sample

        // Part 5: Add Joe Biden's height (1.83)

        // Part 6: Again print out all heights, the number of heights, and the average height.

        // Part 7: let the computer calculate if there is any length in this list of 1.80 (and of 1.85?)
        // Part 8: Show the index of the candidate with length 1.63.
    }
}
