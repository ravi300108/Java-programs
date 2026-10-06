import java.util.HashSet;

class HashSet1 {

    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> languages = new HashSet<>();

        // add(E e)
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");   // Duplicate, will not be added

        System.out.println("After add(): " + languages);

        // contains(Object o)
        System.out.println("Contains Java? " + languages.contains("Java"));
        System.out.println("Contains HTML? " + languages.contains("HTML"));

        // size()
        System.out.println("Size of HashSet: " + languages.size());

        // remove(Object o)
        languages.remove("Python");
        System.out.println("After remove(): " + languages);

        // isEmpty()
        System.out.println("Is HashSet empty? " + languages.isEmpty());

        // clear()
        languages.clear();
        System.out.println("After clear(): " + languages);

        // isEmpty() after clear
        System.out.println("Is HashSet empty now? " + languages.isEmpty());
    }
}
