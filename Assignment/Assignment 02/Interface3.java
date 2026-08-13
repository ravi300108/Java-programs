interface I1 {
    void add(int c);
}

class C2 {
    void add() {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b));
    }
}

class C1 extends C2 implements I1 {

    public void add(int c) {
        int a = 10, b = 20;
        System.out.println("Addition is: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.add();
        obj.add(30);
    }
}
