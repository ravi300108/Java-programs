import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        // Create a Map using HashMap
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.println("Map: " + map);

        System.out.println("Get key 102: " + map.get(102));
        System.out.println("Contains key 101: " + map.containsKey(101));
        System.out.println("Contains value Bob: " + map.containsValue("Bob"));

        // Display keys, values, and key-value entries
        System.out.println("Key Set: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry Set: " + map.entrySet());

        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        map.remove(103);
        System.out.println("After remove(103): " + map);

        map.clear();
        System.out.println("After clear(): " + map);
    }
}
