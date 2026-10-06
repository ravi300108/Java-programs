import java.util.PriorityQueue;

class PriorityQueue1 {

    public static void main(String[] args) {

        // Creating a PriorityQueue
        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        // add(E e)
        tasks.add(40);
        tasks.add(10);
        tasks.add(30);

        System.out.println("After add(): " + tasks);

        // offer(E e)
        tasks.offer(20);
        System.out.println("After offer(): " + tasks);

        // peek()
        System.out.println("Head using peek(): " + tasks.peek());
        System.out.println("Queue after peek(): " + tasks);

        // contains(Object o)
        System.out.println("Contains 30? " + tasks.contains(30));
        System.out.println("Contains 50? " + tasks.contains(50));

        // size()
        System.out.println("Size of PriorityQueue: " + tasks.size());

        // remove(Object o)
        tasks.remove(30);
        System.out.println("After remove(30): " + tasks);

        // poll()
        System.out.println("Removed head using poll(): " + tasks.poll());
        System.out.println("Queue after poll(): " + tasks);

        // Checking size again
        System.out.println("Final size: " + tasks.size());
    }
}
