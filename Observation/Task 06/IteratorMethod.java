import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorMethods {

    public static void main(String[] args) {

        // Creating a List
        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arjun");
        students.add("Meera");
        students.add("Anjali");

        System.out.println("Original List: " + students);

        // Creating Iterator
        Iterator<String> iterator = students.iterator();

        // hasNext() and next()
        System.out.println("\nUsing hasNext() and next():");

        while (iterator.hasNext()) {

            String student = iterator.next();

            System.out.println("Student: " + student);

            // remove()
            if (student.equals("Arjun")) {
                iterator.remove();
                System.out.println("Arjun removed.");
            }
        }

        System.out.println("\nList after remove(): " + students);

        // Creating a new Iterator
        iterator = students.iterator();

        // Moving to the first element
        if (iterator.hasNext()) {
            System.out.println("\nFirst element: " + iterator.next());
        }

        // forEachRemaining()
        System.out.println("\nRemaining elements using forEachRemaining():");

        iterator.forEachRemaining(student -> {
            System.out.println("Student: " + student);
        });
    }
}
