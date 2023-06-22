package objects.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BetterBox {
    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    public void remove(String item) {
        items.remove(item);
    }

    public List<String> getContents() {
        return Collections.unmodifiableList(items);
    }
}


class BetterBoxManager {
    private final static BetterBox BOX = new BetterBox();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Do you want to put something into the box (p), remove something from the box (r), or exit (x)? ");
            var action = in.nextLine().toLowerCase();
            if (action.startsWith("x")) break;
            if (action.startsWith("p")) {
                System.out.print("Please enter the name of the item you wish to put into the box: ");
                var item = in.nextLine();
                BOX.add(item);
            } else {
                System.out.print("Please enter the name of the item you wish to remove from the box: ");
                var item = in.nextLine();
                BOX.remove(item);
            }
            showContents();
        } while (true);
    }

    private static void showContents() {
        System.out.print("The box contains the following items: ");
        System.out.println(String.join("; ", BOX.getContents()));
    }
}