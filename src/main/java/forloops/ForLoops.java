package forloops;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello for-loops!");
        Thread.sleep(1); // to avoid the warning about throwing an InterruptedException :/
        // instructions: please uncomment each piece of code when you start doing the exercise
        // CTRL + / helps uncomment code!

        // Example 1: showing the table of 7
//        for (int multiplier = 1; multiplier <= 10; multiplier++) {
//            System.out.println(multiplier + " x " + 7 + " = " + (multiplier * 7));
//            // System.out.printf("%d x 7 = %d%n", multiplier, multiplier * 7); // alternative!
//        }
//
//        // Example 2: processing a string
//        String name = "FRANS";
//        for (int index = 0; index < name.length(); index++) {
//            System.out.printf("Give me an '%c'!!!%n", name.charAt(index));
//        }
//        System.out.printf("THAT MAKES %s!!!%n", name);
//
//        // Example 3: processing an array
//
//        String[] gifts = {"partridge in a pear tree", "turtle doves", "french hens", "calling birds", "gold rings",
//                "geese a-laying", "swans a-swimming", "maids a-milking", "ladies dancing", "lords a-leaping",
//                "pipers piping", "drummers drumming"};
//
//        for (int dayIndex = 0; dayIndex < gifts.length; dayIndex++) {
//            System.out.printf("I'll give you %d %s!%n", dayIndex + 1, gifts[dayIndex]);
//        }
//
//        // Example 4: of course, we can also REVERSE the order of iteration!
//        for (int dayIndex = gifts.length - 1; dayIndex >= 0; dayIndex--) {
//            System.out.printf("Hey! I gave you %d %s!%n", dayIndex + 1, gifts[dayIndex]);
//        }
//
//        // Practice 1: For-loops are like while-loops
//        // for (a; b; c) {d; } is the same as a; while (b) { d; c; }.
//        // NOTE THAT if b is empty (so for (something;;something) b is interpreted as true in the while loop!
//
//        // Demonstration:
//        for (int multiplier = 1; multiplier <= 10; multiplier++) {
//            System.out.println(multiplier + " x " + 7 + " = " + (multiplier * 7));
//            // System.out.printf("%d x 7 = %d%n", multiplier, multiplier * 7); // alternative!
//        }
//
//        // to while-loop:
//        int multiplier = 1;
//        while (multiplier <= 10) {
//            System.out.printf("%d x 7 = %d%n", multiplier, multiplier * 7);
//            multiplier++;
//        }
//
//        // Now try this with the others!
//
//        //  String name = "FRANS";
//        //        for (int index = 0; index < name.length(); index++) {
//        //            System.out.printf("Give me an '%c'!!!%n", name.charAt(index));
//        //        }
//        //        System.out.printf("THAT MAKES %s!!!%n", name);
//        //
//        //        // Example 3: processing an array
//        //
//        //        String[] gifts = { "partridge in a pear tree", "turtle doves", "french hens", "calling birds", "gold rings",
//        //                "geese a-laying", "swans a-swimming", "maids a-milking", "ladies dancing", "lords a-leaping",
//        //                "pipers piping", "drummers drumming" };
//        //
//        //        for (int dayIndex = 0; dayIndex <gifts.length; dayIndex++) {
//        //            System.out.printf("I'll give you %d %s!%n", dayIndex + 1, gifts[dayIndex]);
//        //        }
//        //
//        //        // Example 4: of course, we can also REVERSE the order of iteration!
//        //        for (int dayIndex= gifts.length - 1; dayIndex >= 0; dayIndex--) {
//        //            System.out.printf("Hey! I gave you %d %s!%n", dayIndex + 1, gifts[dayIndex]);
//        //        }
//
//        // Of course, this means that you can also transform a while-loop to a for-loop. Examples
//
//        char letter = 'a';
//        while (letter <= 'z') {
//            System.out.print(letter);
//            letter++;
//        }
//        System.out.println();
//
//        // as a for-loop, this would be:
//        // since 'letter already exists, I need to use 'currentLetter' instead of letter to prevent a name clash
//        for (char currentLetter = 'a'; currentLetter <= 'z'; currentLetter++) {
//            System.out.print(currentLetter);
//        }
//
//        // Try the same conversion from while-loops to for-loops for 3 more examples
//
//        StringBuilder myName = new StringBuilder("Bill Sykes");
//        while (myName.length() < 20) {
//            System.out.println("My name is " + myName);
//            myName.append('s');
//        }
//
//        int count = 10;
//        while (count > 0) {
//            System.out.printf("The rocket will launch in %d seconds...%n", count);
//            Thread.sleep(1000);
//            count--;
//        }
//        System.out.println("And there it goes, to infinity and beyond!");
//
//        int factorialOf6 = 1;
//        int factor = 1;
//        while (factor <= 6) {
//            factorialOf6 *= factor;
//            factor++;
//        }
//        System.out.printf("The factorial of 6 is %d.%n", factorialOf6);
//
//        // of course, you can 'play around' with the several parts of the for statement
//        // you can have multiple initializers and updates:
//
//        for (int factorialOf10 = 1, currentFactor = 1; currentFactor <= 10; currentFactor++, factorialOf10 *= currentFactor) {
//            System.out.printf("Is 10! equal to %d?%n", factorialOf10);
//        }
//
//        // the condition can be complex! And the body can be empty...
//        int number = 10;
//        for (; number % 7 != 0 || number % 2 != 0; number++) {
//        }
//        System.out.printf("The first even 7-fold greater than 10 is %d.%n", number);
//
//        // And you can make the update different from the usual ++ or --
//        for (int base = 1; base < 1_000_000; base = 2 * base) {
//            System.out.printf("The next power of 2 is %d%n", base);
//        }
//
//        // All right. Now it is your turn again. remember: the for-loop looks like for (a;b;c) D;
//        // (where D can be { d;} or just d; Comma's can be used to evaluate multiple items. What is wrong with
//
//        /* // should print all odd numbers up to 100 (so 1, 3, 5 ... 99)
//        for (int oddNumber = 1, oddNumber < 100; oddNumber += 2) {
//            System.out.println(oddNumber);
//        }
//        */
//
//        // should print 'Hurrah!' 4 times
////        for (int hurrahCount = 0; hurrahCount <= 4; hurrahCount++) {
////            System.out.println("Hurrah!");
////        }
////
////        // should print the divisors or 12
////        int targetNumber = 12;
////        for (int divisor = 1; divisor < targetNumber; divisor--) {
////            if (12 % divisor == 0) System.out.println( divisor + " is a divisor of 12!");
////        }
//
//        // Now let's try to do some 'fill in the blanks' exercises
//
//        // Exercise 1: find all triples up to 20 (so 3, 6, 9, 12, 15, 18)
////        for (int tripleCandidate = 3; tripleCandidate < 20; /* something here */) {
////            System.out.println(tripleCandidate);
////        }
//
//        // Exercise 2: add all digits into a string, producing "01234567890"
////        for (char digit = '0'; /* something here*/; digit++) {
////            System.out.print(digit);
////        }
////        System.out.println();
//
//        // exercise 3: let the following loop produce "ABACADAEAFAGAH"
////        for (; letter <= 'H'; letter++) {
////            System.out.println("A" + letter);
////        }
//
//        // exercise 4: let the following for-loop print 1: ichi 2: ni 3: san 4: yon
//        String[] japaneseNumerals = {"rei", "ichi", "ni", "san", "yon", "go", "roku", "nana", "hachi", "kyuu", "juu"};
//        for (int numberToDisplay = 1; numberToDisplay <=4; numberToDisplay++) {
//            // something here....
//        }
//
//        // Now it's time for for-loop demolition derby. Consider the below for-loop
//        // (you can check https://en.wikipedia.org/wiki/Fibonacci_number if you are not familiar with Fibonacci numbers)
//        for (int previousFib = 0, currentFib = 1; currentFib < 10000; ) {
//            System.out.print(currentFib + " ");
//            int newFib = currentFib + previousFib;
//            previousFib = currentFib;
//            currentFib = newFib;
//        }
//
//        // try to first predict what will happen if you do the following things. Then do it, and check your prediction.
//        // if your prediction was wrong, try to understand why you were wrong (and perhaps make a note for yourself?)
//        // a. removing the "int previousFib=0, currentFib = 1" part
//        // b. removing the "currentFib < 10000" part
//        // c. moving the "System.out.print(currentFib + " ")" to right behind the "currentFib < 10000;"
//        // d. removing the { }
//        // e. removing the semicolon after "currentFib < 10000"
//        // f. changing the ; between "currentFib = 1" and "currentFib < 10000" into a comma
//        // g. adding "int" between " int previousFib=0," and "currentFib = 1"
//        // h. removing "int" before previousFib = 0
//        // i. removing int before newFib = ....
//
//        // I hope that by now you are feeling confident of your for-loop skills (if not, please repeat all above
//        // exercises tomorrow). Anyway, as soon as you feel confident enough, here are some for-loop puzzlers for you
//
//            // 1. Create a for-loop that prints the multiplication table of 12 in reverse (so 10x12=120, 9x12=108, etc.)
//
//        // 2. Create a "Gigi-nator" (like Final Fantasy's 14 character Gigi, who speaks in sentences like
//        // "GiGi Is ThE oNe TrUe LoRd Of ThE iNfErNo! MwAhAhAhAh!!!" (https://ffxiv.consolegameswiki.com/wiki/Gigi)
//        // So make a for-loop that Giginates a sentence like
//        // "I like bread" into "I lIke BrEaD"
//
//        // 3. a for-loop that prints all ODD Japanese numerals up to 10, so ichi, san ... kyuu (of course you can use
//        // the array defined above...)

    }
}
