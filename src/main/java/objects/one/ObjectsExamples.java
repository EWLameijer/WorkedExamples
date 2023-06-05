package objects.one;

import java.math.BigDecimal;

public class ObjectsExamples {
    public static void main(String[] args) {
        // When you start programming in classes, you must learn to switch between the context of
        // 'normal' programming, where you are like a carpenter, nailing plank A to board B at exactly
        // the right spot, and being a 'contractor': deciding what needs to be done and hiring the correct
        // people for the job. A class declaration is basically a job description; the interface of the class
        // (its public methods) is what services it provides, and are essential to any useful class.
        // Usually the class must have some kind of memory (has to know things), for that (private) fields and
        // likely also constructors are needed.
        // In practice, developers often follow the following sequence
        // 1. What data do objects of this class have?
        //    => you turn that into private fields; final private fields if they should never change.
        // 2. Let the editor create a) a constructor, b) getters, and possibly c) setters*
        // * often either setters need to contain logic to see whether the new value is legal, so you must manually
        // correct the setters that the compiler makes, and/or you don't make a 'normal' setter but add
        // another method that is more appropriate. For example, a bag may not have a
        // setContents(List<Item>) but will more likely have add(Item) and remove(Item) methods
        // 3. Create the (other) methods required by the class

        // => Example 1: the book (You can follow the development of this class in Book.java)
        Book book = new Book("Domain-Driven Design", "Eric Evans", 2004);
        System.out.printf("I have the book '%s' by %s (%d).\n", book.getTitle(), book.getAuthor(),
                book.getYearOfPublication());

        // => Example 2: the flower (You can follow the development of this class in Flower.java)
        Flower flower = new Flower("Daffodil", Color.YELLOW, 40, new BigDecimal("2.50"));
        System.out.printf("This is a %s with color %s, a diameter of %.0f mm that costs €%s.\n",
                flower.getName(), flower.getColor(), flower.getDiameterInMm(), flower.getPrice());
        System.out.println("Inflation strikes!");
        flower.setPrice(new BigDecimal("4.50"));
        System.out.printf("This is now a %s with color %s, a diameter of %.0f mm that costs €%s.\n",
                flower.getName(), flower.getColor(), flower.getDiameterInMm(), flower.getPrice());

        // Example 3: the jug (You can follow the development of this class in Jug.java)
        var smallJug = new Jug(3);
        var largeJug = new Jug(5);
        smallJug.fill();
        System.out.printf("The small jug has a capacity of %d L, and currently contains %d L.\n",
                smallJug.getCapacity(), smallJug.getContents());
        System.out.printf("The large jug has a capacity of %d L, and currently contains %d L.\n",
                largeJug.getCapacity(), largeJug.getContents());
        smallJug.pourInto(largeJug);
        System.out.printf("The small jug has a capacity of %d L, and currently contains %d L.\n",
                smallJug.getCapacity(), smallJug.getContents());
        System.out.printf("The large jug has a capacity of %d L, and currently contains %d L.\n",
                largeJug.getCapacity(), largeJug.getContents());
        smallJug.fill();
        smallJug.pourInto(largeJug);
        System.out.printf("The small jug has a capacity of %d L, and currently contains %d L.\n",
                smallJug.getCapacity(), smallJug.getContents());
        System.out.printf("The large jug has a capacity of %d L, and currently contains %d L.\n",
                largeJug.getCapacity(), largeJug.getContents());
        // yeah, seeing all those very repetitive printf statements suggests I would do well to override the toString
        // method in Jug. But for now let's stick with the basics of OO design!

        // Find the error 1 -what is wrong with the Person class? Then uncomment the code below
//        Person me = new Person("John", "Smith");
//        me.introduce();

        // Find the error 2: which 'good coding' rule is disobeyed in the Coordinate class? Please correct it.
        Coordinate coordinate = new Coordinate(2,3);
        System.out.println("I am now at " + coordinate); // "+" when used for String concatenation
        // automatically calls 'toString' for its non-String argument

        // Find the error 3: what is awkward about the Soldier class?

        // Complete the code 1: Correct the Stamp class. Then uncomment the code below.
//        var stamp = new Stamp(StampCountry.NETHERLANDS, 4, true);
//        String usedPrefix = !stamp.isUsed() ? "an un" : "a ";
//        System.out.printf("I have %sused stamp #%d of %s.\n", usedPrefix, stamp.getNumber(), stamp.getCountry());

        // Complete the code 2: Correct the Cat class. Then uncomment the code below.
//        var cat = new Cat("Mauw", 3, CatGender.FEMALE, CatColor.TORTOISESHELL);
//        System.out.printf("My cat is a %s %s cat named %s, weighing %.1f kg.\n", cat.getGender(), cat.getColor(), cat.getName(), cat.getWeight());
//        cat.updateGender(CatGender.NEUTERED_FEMALE);
//        System.out.printf("My cat is now a %s %s cat named %s, weighing %.1f kg.\n", cat.getGender(), cat.getColor(), cat.getName(), cat.getWeight());

        // Complete the code 3: Correct the Sight class. Then uncomment the code below.
//        var sight = new Sight("Gebouw Leidsch Dagblad", "Leiden");
//        System.out.printf("My favorite sight is %s in %s.\n", sight.getName(), sight.getLocation());

        // Exercise 1: create the Song class according to specification. Then uncomment the code below.
//        var song = new Song("Rocket Man", "Elton John", "Bernie Taupin", 1972);
//        System.out.printf("A famous song is %s by %s and %s, released in %d", song.getTitle(), getComposer(), getLyricist(), getYear());

        // Exercise 2: create the Country class according to specification. Then uncomment the code below.
//        var country = new Country("the Netherlands", "Wilhelmus", 17_245_924, "King Willem-Alexander");
//        System.out.printf("A country in Europe is %s, which has a population of %d and as head of state %s. Its anthem is the '%s'.\n",
//                country.getName(), country.getPopulation(), country.getHeadOfState(), country.getAnthem());
//        // a new citizen is born!
//        country.setPopulation(17_245_925); // Perhaps a born(int), immigrate(int), emigrate(int) and die(int) would be more convenient...
//        System.out.printf("A country in Europe is %s, which has a population of %d and as head of state %s. Its anthem is the '%s'.\n",
//                country.getName(), country.getPopulation(), country.getHeadOfState(), country.getAnthem());
//        // a revolution breaks out!
//        country.setHeadOfState("President Paul de Leeuw");
//        System.out.printf("A country in Europe is %s, which has a population of %d and as head of state %s. Its anthem is the '%s'.\n",
//                country.getName(), country.getPopulation(), country.getHeadOfState(), country.getAnthem());

        // Exercise 3: create the Car class according to specification. Then uncomment the code below.
//        var car = new Car("Toyota", 2022, java.awt.Color.BLUE);
//        System.out.printf("This is a %s %s from %d, which has driven %.1f km.\n", car.getColor(), car.getBrand(), car.getYear(), car.getKilometersDriven());
//        car.drive(1000);
//        System.out.printf("This is a %s %s from %d, which has driven %.1f km.\n", car.getColor(), car.getBrand(), car.getYear(), car.getKilometersDriven());
//        car.drive(-1000);
//        System.out.printf("This is a %s %s from %d, which has driven %.1f km.\n", car.getColor(), car.getBrand(), car.getYear(), car.getKilometersDriven());
         // which should display 2000.0 km!

        // Design 1: create an Employee class with fields and getters/setters/constructors/other methods you deem appropriate
        // Test it below

        // Design 2: create a Tree class with fields and getters/setters/constructors/other methods you deem appropriate
        // Test it below

        // Design 3: create a Printer class with fields and getters/setters/constructors/other methods you deem appropriate
        // Test it below
    }
}



