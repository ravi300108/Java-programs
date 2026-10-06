import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorMethods {

    public static void main(String[] args) {

        // Creating a List
        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arjun");
        students.add("Meera");

        System.out.println("Original List: " + students);

        // Creating ListIterator
        ListIterator<String> iterator = students.listIterator();

        // hasNext(), next(), nextIndex()
        System.out.println("\nForward Traversal:");

        while (iterator.hasNext()) {

            System.out.println(
                "Index: " + iterator.nextIndex() +
                ", Student: " + iterator.next()
            );
        }

        // hasPrevious(), previous(), previousIndex()
        System.out.println("\nBackward Traversal:");

        while (iterator.hasPrevious()) {

            System.out.println(
                "Index: " + iterator.previousIndex() +
                ", Student: " + iterator.previous()
            );
        }

        // Move to first element
        iterator = students.listIterator();

        // next() and set()
        iterator.next();
        iterator.set("Aarav");

        System.out.println("\nAfter set(): " + students);

        // add()
        iterator.add("Diya");

        System.out.println("After add(): " + students);

        // Move to next element and remove it
        iterator.next();
        iterator.remove();

        System.out.println("After remove(): " + students);
    }
}
