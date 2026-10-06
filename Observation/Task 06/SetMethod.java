import java.util.HashSet;
import java.util.Set;

class SetMethod {

    public static void main(String[] args) {

        // Creating a Set
        Set<String> courses = new HashSet<>();

        // add(E e)
        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("Java");   // Duplicate value is not added

        System.out.println("After add(): " + courses);

        // remove(Object o)
        courses.remove("C");
        System.out.println("After remove(): " + courses);

        // contains(Object o)
        System.out.println("Contains Python? " + courses.contains("Python"));

        // size()
        System.out.println("Set size: " + courses.size());

        // isEmpty()
        System.out.println("Is set empty? " + courses.isEmpty());

        // clear()
        courses.clear();
        System.out.println("After clear(): " + courses);

        // Checking again
        System.out.println("Is set empty after clear()? " + courses.isEmpty());
    }
}
