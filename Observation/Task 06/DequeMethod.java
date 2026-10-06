import java.util.Deque;
import java.util.ArrayDeque;

class DequeMethods {

    public static void main(String[] args) {

        // Creating a Deque
        Deque<String> items = new ArrayDeque<>();

        // addFirst()
        items.addFirst("Book");
        items.addFirst("Pen");

        System.out.println("After addFirst(): " + items);

        // addLast()
        items.addLast("Bag");
        items.addLast("Bottle");

        System.out.println("After addLast(): " + items);

        // offerFirst()
        items.offerFirst("Notebook");

        System.out.println("After offerFirst(): " + items);

        // offerLast()
        items.offerLast("Pencil");

        System.out.println("After offerLast(): " + items);

        // peekFirst()
        System.out.println("First element: " + items.peekFirst());

        // peekLast()
        System.out.println("Last element: " + items.peekLast());

        // removeFirst()
        System.out.println("Removed first: " + items.removeFirst());

        System.out.println("After removeFirst(): " + items);

        // removeLast()
        System.out.println("Removed last: " + items.removeLast());

        System.out.println("After removeLast(): " + items);

        // pollFirst()
        System.out.println("Polled first: " + items.pollFirst());

        System.out.println("After pollFirst(): " + items);

        // pollLast()
        System.out.println("Polled last: " + items.pollLast());

        System.out.println("After pollLast(): " + items);
    }
}
