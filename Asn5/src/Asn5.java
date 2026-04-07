//Kyle Greer
import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Adding elements to list 1 and 2
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // Display the contents of list 1 and 2, having it be on a single line instead of multiple
        System.out.println("Words: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Numbers: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i));
            if (i < list2.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Removing and setting/changing elements in both lists
        list.remove("Apple");
        list2.set(2, 20);

        // Displaying the contents after the changes
        System.out.println("Words after removal: ");
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.print(list.get(i1));
            if (i1 < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Numbers after change: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i));
            if (i < list2.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
