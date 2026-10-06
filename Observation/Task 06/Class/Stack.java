import java.util.Stack;

class Stack1 {

    public static void main(String[] args) {

        // Creating a Stack
        Stack<String> books = new Stack<>();

        // push(E item)
        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.push("DBMS");

        System.out.println("After push(): " + books);

        // peek()
        System.out.println("Top element using peek(): " + books.peek());
        System.out.println("Stack after peek(): " + books);

        // search(Object o)
        System.out.println("Position of Python: " + books.search("Python"));
        System.out.println("Position of Java: " + books.search("Java"));

        // pop()
        String removed = books.pop();
        System.out.println("Removed element using pop(): " + removed);
        System.out.println("Stack after pop(): " + books);

        // empty()
        System.out.println("Is Stack empty? " + books.empty());

        // Pop remaining elements
        books.pop();
        books.pop();
        books.pop();

        System.out.println("Stack after removing all elements: " + books);

        // Checking empty again
        System.out.println("Is Stack empty now? " + books.empty());
    }
}
