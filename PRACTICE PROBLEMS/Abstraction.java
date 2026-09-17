abstract class Calculator {
    abstract void add();
    abstract void sub();
}

class Math extends Calculator {

    void add() {
        System.out.println(10 + 20);
    }

    void sub() {
        System.out.println(20 - 10);
    }

    public static void main(String[] args) {
        Math m = new Math();
        m.add();
        m.sub();
    }
}
