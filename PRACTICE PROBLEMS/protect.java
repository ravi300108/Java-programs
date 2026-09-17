class Smtg1 {
    protected int a = 20;

    void add() {
        System.out.println(a + 10);
    }
}

class Smtg2 extends Smtg1 {
    void multiply() {
        System.out.println(a * 2);
    }

    public static void main(String[] args) {
        Smtg2 obj = new Smtg2();
        obj.add();
        obj.multiply();
    }
}
