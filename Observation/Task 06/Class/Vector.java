import java.util.Vector;

class Vector1 {

    public static void main(String[] args) {

        // Creating a Vector
        Vector<String> subjects = new Vector<>();

        // add(E e)
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");

        System.out.println("After add(): " + subjects);

        // addElement(Object obj)
        subjects.addElement("DBMS");
        System.out.println("After addElement(): " + subjects);

        // get(int index)
        System.out.println("Element at index 1: " + subjects.get(1));

        // set(int index, E element)
        subjects.set(2, "C");
        System.out.println("After set(): " + subjects);

        // remove(int index)
        subjects.remove(1);
        System.out.println("After remove(index): " + subjects);

        // removeElement(Object obj)
        subjects.removeElement("DBMS");
        System.out.println("After removeElement(): " + subjects);

        // size()
        System.out.println("Size of Vector: " + subjects.size());

        // capacity()
        System.out.println("Capacity of Vector: " + subjects.capacity());

        // contains(Object o)
        System.out.println("Contains Java? " + subjects.contains("Java"));
        System.out.println("Contains Python? " + subjects.contains("Python"));
    }
}
