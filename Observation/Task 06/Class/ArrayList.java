import java.util.ArrayList;
import java.util.Comparator;

class ArrayList1 {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // add(E e)
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("After add(): " + fruits);

        // add(int index, E element)
        fruits.add(2, "Grapes");
        System.out.println("After add(index, element): " + fruits);

        // get(int index)
        System.out.println("Element at index 1: " + fruits.get(1));

        // set(int index, E element)
        fruits.set(1, "Pineapple");
        System.out.println("After set(): " + fruits);

        // remove(int index)
        fruits.remove(3);
        System.out.println("After remove(index): " + fruits);

        // remove(Object o)
        fruits.remove("Apple");
        System.out.println("After remove(object): " + fruits);

        // contains(Object o)
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // size()
        System.out.println("Size of ArrayList: " + fruits.size());

        // isEmpty()
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());

        // indexOf(Object o)
        fruits.add("Banana");
        System.out.println("First index of Banana: " + fruits.indexOf("Banana"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Banana: " + fruits.lastIndexOf("Banana"));

        // sort(Comparator)
        fruits.sort(Comparator.naturalOrder());
        System.out.println("After sorting: " + fruits);

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // Checking isEmpty() again
        System.out.println("Is ArrayList empty now? " + fruits.isEmpty());
    }
}
