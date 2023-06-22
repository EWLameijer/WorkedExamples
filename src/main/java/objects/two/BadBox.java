package objects.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BadBox {
    private final List<String> items = new ArrayList<>();

    void run() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Do you want to put something into the box (p), remove something from the box (r), or exit (x)? ");
            var action = in.nextLine().toLowerCase();
            if (action.startsWith("x")) break;
            if (action.startsWith("p")) {
                System.out.print("Please enter the name of the item you wish to put into the box: ");
                var item = in.nextLine();
                items.add(item);
            } else {
                System.out.print("Please enter the name of the item you wish to remove from the box: ");
                var item = in.nextLine();
                items.remove(item);
            }
            showContents();
        } while (true);
    }

    private void showContents() {
        System.out.println("The box contains: " + String.join(", ", items));
    }
}

class BadBoxManager {
    public static void main(String[] args) {
        var badBox = new BadBox();
        badBox.run();
    }
}
