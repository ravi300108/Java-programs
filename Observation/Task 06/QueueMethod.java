import java.util.Queue;
import java.util.LinkedList;

class QueueMethod {

    public static void main(String[] args) {

        // Creating a Queue
        Queue<String> tasks = new LinkedList<>();

        // add()
        tasks.add("Study");
        tasks.add("Practice");
        tasks.add("Assignment");

        System.out.println("Queue after add(): " + tasks);

        // offer()
        tasks.offer("Project");

        System.out.println("Queue after offer(): " + tasks);

        // element()
        System.out.println("Head using element(): " + tasks.element());

        // peek()
        System.out.println("Head using peek(): " + tasks.peek());

        // remove()
        System.out.println("Removed using remove(): " + tasks.remove());

        System.out.println("Queue after remove(): " + tasks);

        // poll()
        System.out.println("Removed using poll(): " + tasks.poll());

        System.out.println("Queue after poll(): " + tasks);
    }
}
