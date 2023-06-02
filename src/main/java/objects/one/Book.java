package objects.one;

// *BOOK-EXAMPLE*
// I have books, and I want to make a catalog of them. Books have a title and an author, and also a year of publication
// (useful to know, especially in software development, that one's library is not getting too much out of date...)
// The services a book provides should therefore be a title, an author, and a year of publication.
// Step 1: (private) fields I should have: title, author, yearOfPublication. Should any of these change later? No, none.
//         So I can make them all final.
// Step 2: I let IDEA (with Alt+Insert) generate a) a constructor, b) getters. Setters are not needed (or possible),
//         because the values of the fields cannot change (a book in my bookcase won't spontaneously change its title)
// Step 3: I don't require other methods for now, so I don't add them.

/* Step 1 (won't compile yet because if you have final values that are not assigned on the same line (and you rarely
assign them on the same line unless they are class constants like "static final double MY_PI = 3.14;") you need
to assign them in the constructor. Which we have not created yet...
class BookStep1 {
    private final String title;

    private final String author;

    private final int yearOfPublication;
}
*/

// 2A: create constructor (Alt+Insert, or whatever shortcut your operating system/IntelliJ version uses)
class BookStep2A {
    private final String title;

    private final String author;

    private final int yearOfPublication;

    public BookStep2A(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
}

// Step 2b: generate getters (setters not needed). No other methods needed; class is done!
// (again Alt+Insert helps generate getters fast)

// Note: IntelliJ suggests that this class can be a record. This is correct; classes that
// don't have modifiable fields CAN be transformed into records, starting from Java 14.
// (it would become "record Book(String title, String author, int yearOfPublication);")
// However, as most classes cannot be records, I am choosing to show the GENERAL way of how to make a class,
// that works for classes of arbitrary complexity. In a real program (and IF you can work with Java 14+, which
// is definitely not a given yet since due to upgrading Java versions not being trivial on large projects, most Java
// software developers are still working with Java 11 and 8
// (https://www.itprotoday.com/programming-languages/what-state-java-ecosystem-2023#close-modal))
// you would transform a book class like the below one into a record. However, for now, study the
// fields-constructor-getters structure, as that is very important to get right, and we'll apply it again in the next
// and more complex examples.
public class Book {
    private final String title;

    private final String author;

    private final int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}