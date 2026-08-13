interface I2 {
    void add();
}

interface I3 {
    void add(int c);
}

interface I1 extends I2, I3 {
    void add(int c, int d);
}

class C1 implements I1 {

    public void add() {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b));
    }

    public void add(int c) {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b + c));
    }

    public void add(int c, int d) {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b + c + d));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition is: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.add();
        obj.add(30);
        obj.add(30, 40);
        obj.add(10, 20, 30);
    }
}
