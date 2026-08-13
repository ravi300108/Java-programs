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

class C extends A {
    void smtg3() {
        System.out.println("This is Class C");
    }

    void add(int c, int d) {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b + c + d));
    }
}

public class Main {
    public static void main(String[] args) {

        B obj1 = new B();
        C obj2 = new C();

        obj1.smtg();
        obj1.smtg2();
        obj1.add(30);

        obj2.smtg();
        obj2.smtg3();
        obj2.add(30, 40);
    }
}
