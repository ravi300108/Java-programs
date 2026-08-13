class A {
    void smtg() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void smtg2() {
        System.out.println("This is Class B");
    }
}

class C extends A {
    void smtg3() {
        System.out.println("This is Class C");
    }
}

class D extends B {
    void smtg4() {
        System.out.println("This is Class D");
    }
}

public class Main {
    public static void main(String[] args) {

        D obj = new D();

        obj.smtg();
        obj.smtg2();
        obj.smtg4();

        C obj2 = new C();

        obj2.smtg();
        obj2.smtg3();
    }
}
