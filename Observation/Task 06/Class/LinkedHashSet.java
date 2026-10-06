import java.util.LinkedHashSet;

class LinkedHashSet1 {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet<String> subjects = new LinkedHashSet<>();

        // add(E e)
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");
        subjects.add("Java");   // Duplicate, will not be added

        System.out.println("After add(): " + subjects);

        // contains(Object o)
        System.out.println("Contains Java? " + subjects.contains("Java"));
        System.out.println("Contains HTML? " + subjects.contains("HTML"));

        // size()
        System.out.println("Size of LinkedHashSet: " + subjects.size());

        // remove(Object o)
        subjects.remove("Python");
        System.out.println("After remove(): " + subjects);

        // clear()
        subjects.clear();
        System.out.println("After clear(): " + subjects);

        // Checking size after clear
        System.out.println("Size after clear(): " + subjects.size());
    }
}
