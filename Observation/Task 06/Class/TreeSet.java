import java.util.TreeSet;

class TreeSet1 {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // add(E e)
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("After add(): " + numbers);

        // contains(Object o)
        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println("Contains 60? " + numbers.contains(60));

        // first()
        System.out.println("First element: " + numbers.first());

        // last()
        System.out.println("Last element: " + numbers.last());

        // higher(E e)
        System.out.println("Element higher than 30: " + numbers.higher(30));

        // lower(E e)
        System.out.println("Element lower than 30: " + numbers.lower(30));

        // ceiling(E e)
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));

        // floor(E e)
        System.out.println("Floor of 25: " + numbers.floor(25));

        // remove(Object o)
        numbers.remove(20);
        System.out.println("After remove(20): " + numbers);

        // pollFirst()
        System.out.println("Removed first element: " + numbers.pollFirst());
        System.out.println("After pollFirst(): " + numbers);

        // pollLast()
        System.out.println("Removed last element: " + numbers.pollLast());
        System.out.println("After pollLast(): " + numbers);
    }
}
