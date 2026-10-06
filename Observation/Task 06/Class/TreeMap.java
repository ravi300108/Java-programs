import java.util.TreeMap;

class TreeMap1 {

    public static void main(String[] args) {

        // Creating a TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();

        // put(K key, V value)
        students.put(103, "Arjun");
        students.put(101, "Rahul");
        students.put(105, "Sneha");
        students.put(102, "Priya");
        students.put(104, "Kiran");

        System.out.println("After put(): " + students);

        // get(Object key)
        System.out.println("Student with ID 102: "
                + students.get(102));

        // containsKey(Object key)
        System.out.println("Contains key 103? "
                + students.containsKey(103));

        // containsValue(Object value)
        System.out.println("Contains value Rahul? "
                + students.containsValue("Rahul"));

        // firstKey()
        System.out.println("First key: " + students.firstKey());

        // lastKey()
        System.out.println("Last key: " + students.lastKey());

        // higherKey(K key)
        System.out.println("Key higher than 102: "
                + students.higherKey(102));

        // lowerKey(K key)
        System.out.println("Key lower than 102: "
                + students.lowerKey(102));

        // ceilingKey(K key)
        System.out.println("Ceiling key of 103: "
                + students.ceilingKey(103));

        // floorKey(K key)
        System.out.println("Floor key of 103: "
                + students.floorKey(103));

        // entrySet()
        System.out.println("Key-Value pairs: "
                + students.entrySet());

        // remove(Object key)
        students.remove(104);
        System.out.println("After remove(104): "
                + students);
    }
}
