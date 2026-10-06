import java.util.Map;
import java.util.HashMap;

class MapMethods {

    public static void main(String[] args) {

        // Creating a Map
        Map<Integer, String> students = new HashMap<>();

        // put()
        students.put(101, "Aarav");
        students.put(102, "Meera");
        students.put(103, "Rohan");
        students.put(104, "Diya");

        System.out.println("Map after put(): " + students);

        // get()
        System.out.println("Value for key 102: " + students.get(102));

        // containsKey()
        System.out.println("Contains key 103: "
                + students.containsKey(103));

        // containsValue()
        System.out.println("Contains value Rohan: "
                + students.containsValue("Rohan"));

        // keySet()
        System.out.println("Keys: " + students.keySet());

        // values()
        System.out.println("Values: " + students.values());

        // entrySet()
        System.out.println("Entries: " + students.entrySet());

        // size()
        System.out.println("Map size: " + students.size());

        // isEmpty()
        System.out.println("Is map empty: " + students.isEmpty());

        // remove()
        students.remove(104);
        System.out.println("After remove(104): " + students);

        // clear()
        students.clear();
        System.out.println("After clear(): " + students);

        // isEmpty() after clear
        System.out.println("Is map empty after clear: "
                + students.isEmpty());
    }
}
