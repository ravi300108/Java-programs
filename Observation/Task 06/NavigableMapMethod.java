import java.util.NavigableMap;
import java.util.TreeMap;

class NavigableMapMethodsDemo {

    public static void main(String[] args) {

        // Creating a NavigableMap using TreeMap
        NavigableMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(101, "Aarav");
        students.put(103, "Rohan");
        students.put(105, "Diya");
        students.put(107, "Anjali");
        students.put(109, "Meera");

        System.out.println("NavigableMap: " + students);

        // lowerKey()
        System.out.println("Lower Key of 105: " + students.lowerKey(105));

        // floorKey()
        System.out.println("Floor Key of 105: " + students.floorKey(105));

        // ceilingKey()
        System.out.println("Ceiling Key of 106: " + students.ceilingKey(106));

        // higherKey()
        System.out.println("Higher Key of 105: " + students.higherKey(105));

        // firstEntry()
        System.out.println("First Entry: " + students.firstEntry());

        // lastEntry()
        System.out.println("Last Entry: " + students.lastEntry());

        // pollFirstEntry()
        System.out.println("Poll First Entry: " + students.pollFirstEntry());
        System.out.println("After pollFirstEntry(): " + students);

        // pollLastEntry()
        System.out.println("Poll Last Entry: " + students.pollLastEntry());
        System.out.println("After pollLastEntry(): " + students);

        // descendingMap()
        System.out.println("Descending Map: " + students.descendingMap());
    }
}
