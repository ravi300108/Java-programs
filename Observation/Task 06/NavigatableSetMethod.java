import java.util.NavigableSet;
import java.util.TreeSet;

class NavigableSetMethods {

    public static void main(String[] args) {

        // Creating a NavigableSet using TreeSet
        NavigableSet<Integer> values = new TreeSet<>();

        // Adding elements
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
        values.add(60);

        System.out.println("NavigableSet: " + values);

        // lower()
        System.out.println("Lower than 30: " + values.lower(30));

        // floor()
        System.out.println("Floor of 30: " + values.floor(30));

        // ceiling()
        System.out.println("Ceiling of 35: " + values.ceiling(35));

        // higher()
        System.out.println("Higher than 30: " + values.higher(30));

        // pollFirst()
        System.out.println("Removed first element: " + values.pollFirst());

        System.out.println("After pollFirst(): " + values);

        // pollLast()
        System.out.println("Removed last element: " + values.pollLast());

        System.out.println("After pollLast(): " + values);

        // descendingSet()
        System.out.println("Descending Set: " + values.descendingSet());
    }
}
