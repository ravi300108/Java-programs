import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class CollectionMethodsDemo {

    public static void main(String[] args) {

        // Creating a Collection
        Collection<String> students = new ArrayList<>();

        // add(E e)
        students.add("Rahul");
        students.add("Priya");
        students.add("Arjun");

        System.out.println("After add(): " + students);

        // addAll(Collection c)
        Collection<String> newStudents =
                Arrays.asList("Anu", "Kiran");

        students.addAll(newStudents);

        System.out.println("After addAll(): " + students);

        // contains(Object o)
        System.out.println("Contains Rahul? "
                + students.contains("Rahul"));

        // containsAll(Collection c)
        System.out.println("Contains Anu and Kiran? "
                + students.containsAll(newStudents));

        // size()
        System.out.println("Size: " + students.size());

        // isEmpty()
        System.out.println("Is collection empty? "
                + students.isEmpty());

        // remove(Object o)
        students.remove("Arjun");

        System.out.println("After remove(): " + students);

        // removeAll(Collection c)
        students.removeAll(newStudents);

        System.out.println("After removeAll(): " + students);

        // iterator()
        System.out.println("Using iterator():");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // clear()
        students.clear();

        System.out.println("After clear(): " + students);

        // isEmpty() after clear
        System.out.println("Is collection empty now? "
                + students.isEmpty());
    }
}
