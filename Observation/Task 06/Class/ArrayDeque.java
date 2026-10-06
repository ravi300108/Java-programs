import java.util.ArrayDeque;

class ArrayDeque {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque<String> names = new ArrayDeque<>();

        // addFirst(E e)
        names.addFirst("Rahul");
        names.addFirst("Priya");

        System.out.println("After addFirst(): " + names);

        // addLast(E e)
        names.addLast("Arjun");
        names.addLast("Sneha");

        System.out.println("After addLast(): " + names);

        // offerFirst(E e)
        names.offerFirst("Kiran");
        System.out.println("After offerFirst(): " + names);

        // offerLast(E e)
        names.offerLast("Meena");
        System.out.println("After offerLast(): " + names);

        // peekFirst()
        System.out.println("First element using peekFirst(): "
                + names.peekFirst());

        // peekLast()
        System.out.println("Last element using peekLast(): "
                + names.peekLast());

        // pollFirst()
        System.out.println("Removed first element using pollFirst(): "
                + names.pollFirst());

        System.out.println("After pollFirst(): " + names);

        // pollLast()
        System.out.println("Removed last element using pollLast(): "
                + names.pollLast());

        System.out.println("After pollLast(): " + names);
    }
}
