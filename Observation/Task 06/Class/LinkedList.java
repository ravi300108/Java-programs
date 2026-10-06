import java.util.LinkedList;

class LinkedList1 {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // add(E e)
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Mumbai");

        System.out.println("After add(): " + cities);

        // addFirst(E e)
        cities.addFirst("Delhi");
        System.out.println("After addFirst(): " + cities);

        // addLast(E e)
        cities.addLast("Kolkata");
        System.out.println("After addLast(): " + cities);

        // get(int index)
        System.out.println("Element at index 2: " + cities.get(2));

        // getFirst()
        System.out.println("First element: " + cities.getFirst());

        // getLast()
        System.out.println("Last element: " + cities.getLast());

        // remove(int index)
        cities.remove(2);
        System.out.println("After remove(index): " + cities);

        // remove(Object o)
        cities.remove("Chennai");
        System.out.println("After remove(object): " + cities);

        // removeFirst()
        String first = cities.removeFirst();
        System.out.println("Removed first element: " + first);
        System.out.println("After removeFirst(): " + cities);

        // removeLast()
        String last = cities.removeLast();
        System.out.println("Removed last element: " + last);
        System.out.println("After removeLast(): " + cities);

        // offer(E e)
        cities.offer("Pune");
        System.out.println("After offer(): " + cities);

        // peek()
        System.out.println("Head using peek(): " + cities.peek());
        System.out.println("List after peek(): " + cities);

        // poll()
        System.out.println("Removed head using poll(): " + cities.poll());
        System.out.println("List after poll(): " + cities);
    }
}
