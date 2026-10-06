import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class EmployeeListDemo {

    public static void main(String[] args) {

        // Creating a List
        List<String> employees = new ArrayList<>();

        // add(E e)
        employees.add("Anjali");
        employees.add("Vikram");
        employees.add("Rohan");
        employees.add("Anjali");

        System.out.println("Original List: " + employees);

        // add(int index, E element)
        employees.add(1, "Meena");
        System.out.println("After add(1, \"Meena\"): " + employees);

        // get(int index)
        System.out.println("Element at index 2: " + employees.get(2));

        // set(int index, E element)
        employees.set(2, "Karthik");
        System.out.println("After set(2, \"Karthik\"): " + employees);

        // remove(int index)
        employees.remove(3);
        System.out.println("After remove(3): " + employees);

        // indexOf(Object o)
        System.out.println("First index of Anjali: "
                + employees.indexOf("Anjali"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Anjali: "
                + employees.lastIndexOf("Anjali"));

        // subList(int fromIndex, int toIndex)
        List<String> selectedEmployees = employees.subList(1, 3);
        System.out.println("SubList from index 1 to 3: "
                + selectedEmployees);

        // sort(Comparator)
        employees.sort(Comparator.naturalOrder());
        System.out.println("After Sorting: " + employees);
    }
}
