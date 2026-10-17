import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapMethod1 {

    public static void main(String[] args) {

        // Creating a SortedMap using TreeMap
        SortedMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(103, "Rohan");
        students.put(101, "Aarav");
        students.put(105, "Diya");
        students.put(102, "Meera");
        students.put(104, "Anjali");

        System.out.println("SortedMap: " + students);

        // firstKey()
        System.out.println("First Key: " + students.firstKey());

        // lastKey()
        System.out.println("Last Key: " + students.lastKey());

        // headMap()
        System.out.println("HeadMap (< 103): " + students.headMap(103));

        // tailMap()
        System.out.println("TailMap (>= 103): " + students.tailMap(103));

        // subMap()
        System.out.println("SubMap (102 to 105): " + students.subMap(102, 105));

        // comparator()
        System.out.println("Comparator: " + students.comparator());
    }
}
