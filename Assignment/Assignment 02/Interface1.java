interface I1 {
    void add();
}

interface I2 {
    void add();
}

class C1 implements I1, I2 {

    public void add() {
        int a = 10, b = 20, c = 30;
        System.out.println("Addition is: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.add();
    }
}
