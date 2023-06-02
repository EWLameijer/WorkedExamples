package objects.one;

import java.math.BigDecimal;

public class ObjectsExamples {
    public static void main(String[] args) {
        // When you start programming in classes, you must learn to switch between the context of
        // 'normal' programming, where you are like a carpenter, nailing plank A to board B at exactly
        // the right spot, and being a 'contractor': deciding what needs to be done and hiring the correct
        // people for the job. A class declaration is basically a job description; the interface of the class
        // (its public methods) is what services it provides, and are essential to any useful class.
        // Sometimes the class must have some kind of memory (has to know things), for that (private) fields and
        // likely also constructors are needed.
        // In practice, developers often follow the following sequence
        // 1. What data do objects of this class have?
        //    => you turn that into private fields; final private fields if they should never change.
        // 2. Let the editor create a) an constructor, b) getters, and possibly c) setters
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

    }


}



