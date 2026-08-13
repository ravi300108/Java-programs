class A {
    void smtg() {
        System.out.println("This is Class A");
    }

    void add() {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b));
    }
}

class B extends A {
    void smtg2() {
        System.out.println("This is Class B");
    }

    void add(int c) {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();

        b.smtg();
        b.smtg2();
        b.add(30);
    }
}
