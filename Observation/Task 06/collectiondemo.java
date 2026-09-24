import java.util.ArrayList;
 import java.util.Collection;
 public class CollectionDemo {
public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        Collection<Integer> c2 = new ArrayList<>();
  // add()
        c1.add(10);
        c1.add(20);
        c1.add(30)
        c2.add(20);
        c2.add(30);
        System.out.println(“Collection 1: “ + c1);
        System.out.println(“Collection 2: “ + c2);
        // addAll()
       c1.addAll(c2);
        System.out.println(“After addAll(): “ + c1);
        // contains()
        System.out.println(“Contains 20: “ + c1.contains(20));
        // containsAll()
        System.out.println(“Contains all c2: “ + c1.containsAll(c2));
        // size()
        System.out.println(“Size: “ + c1.size());
        // isEmpty()
        System.out.println(“Is Empty: “ + c1.isEmpty());
        // remove()
       c1.remove(10);
        System.out.println(“After remove(10): “ + c1);
        // removeAll()
        c1.removeAll(c2);
        System.out.println(“After removeAll(c2): “ + c1);
        // Add elements again
        c1.add(50);
        c1.add(60);
        // iterator()
        System.out.print(“Using Iterator: “);
        Iterator<Integer> itr = c1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + “ “);
        }
        System.out.println();
        // clear()
        c1.clear();
        System.out.println(“After clear(): “ + c1);
    }
}
