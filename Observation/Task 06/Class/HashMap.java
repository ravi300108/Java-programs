import java.util.HashMap;

class HashMap1 {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // put(K key, V value)
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Arjun");
        students.put(104, "Sneha");

        System.out.println("After put(): " + students);

        // get(Object key)
        System.out.println("Student with ID 102: " + students.get(102));

        // containsKey(Object key)
        System.out.println("Contains key 103? "
                + students.containsKey(103));

        // containsValue(Object value)
        System.out.println("Contains value Arjun? "
                + students.containsValue("Arjun"));

        // getOrDefault(Object key, V defaultValue)
        System.out.println("Student with ID 105: "
                + students.getOrDefault(105, "Not Found"));

        // keySet()
        System.out.println("Keys: " + students.keySet());

        // values()
        System.out.println("Values: " + students.values());

        // entrySet()
        System.out.println("Key-Value pairs: " + students.entrySet());

        // size()
        System.out.println("Size of HashMap: " + students.size());

        // remove(Object key)
        students.remove(103);
        System.out.println("After remove(103): " + students);

        // isEmpty()
        System.out.println("Is HashMap empty? " + students.isEmpty());

        // clear()
        students.clear();
        System.out.println("After clear(): " + students);

        // isEmpty() after clear
        System.out.println("Is HashMap empty now? " + students.isEmpty());
    }
}
