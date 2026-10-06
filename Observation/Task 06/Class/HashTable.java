import java.util.Hashtable;
import java.util.Enumeration;

class Hashtable1 {

    public static void main(String[] args) {

        // Creating a Hashtable
        Hashtable<Integer, String> employees = new Hashtable<>();

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

        // containsValue(Object value)
        System.out.println("Contains value Rahul? "
                + employees.containsValue("Rahul"));

        // keys()
        System.out.println("Keys:");
        Enumeration<Integer> keyList = employees.keys();

        while (keyList.hasMoreElements()) {
            System.out.println(keyList.nextElement());
        }

        // elements()
        System.out.println("Values:");
        Enumeration<String> valueList = employees.elements();

        while (valueList.hasMoreElements()) {
            System.out.println(valueList.nextElement());
        }

        // size()
        System.out.println("Size of Hashtable: "
                + employees.size());

        // remove(Object key)
        employees.remove(103);
        System.out.println("After remove(103): "
                + employees);

        // isEmpty()
        System.out.println("Is Hashtable empty? "
                + employees.isEmpty());
    }
}
