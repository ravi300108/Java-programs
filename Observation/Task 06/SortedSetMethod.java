import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetMethod {

    public static void main(String[] args) {

        // Creating a SortedSet using TreeSet
        SortedSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(40);
        numbers.add(10);
        numbers.add(70);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        System.out.println("SortedSet: " + numbers);

        // first()
        System.out.println("First element: " + numbers.first());

        // last()
        System.out.println("Last element: " + numbers.last());

        // headSet()
        System.out.println("HeadSet before 40: " + numbers.headSet(40));

        // tailSet()
        System.out.println("TailSet from 30: " + numbers.tailSet(30));

        // subSet()
        System.out.println("SubSet from 20 to 60: " + numbers.subSet(20, 60));

        // comparator()
        System.out.println("Comparator: " + numbers.comparator());
    }
}
