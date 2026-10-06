import java.util.LinkedHashMap;

class LinkedHashMap1 {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

        // put(K key, V value)
        employees.put(101, "Rahul");
        employees.put(102, "Priya");
        employees.put(103, "Arjun");
        employees.put(104, "Sneha");

        System.out.println("After put(): " + employees);

        // get(Object key)
        System.out.println("Employee with ID 102: "
                + employees.get(102));

        // containsKey(Object key)
        System.out.println("Contains key 103? "
                + employees.containsKey(103));

        // keySet()
        System.out.println("Keys: " + employees.keySet());

        // values()
        System.out.println("Values: " + employees.values());

        // entrySet()
        System.out.println("Key-Value pairs: "
                + employees.entrySet());

        // remove(Object key)
        employees.remove(103);
        System.out.println("After remove(103): "
                + employees);
    }
}
