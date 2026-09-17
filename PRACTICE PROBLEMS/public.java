class Smtg1 {
    public int a = 10;

    public void add() {
        System.out.println(a + 20);
    }
}

class Smtg2 extends Smtg1 {
    public void divide() {
        System.out.println(a / 2);
    }

    public static void main(String[] args) {
        Smtg2 obj = new Smtg2();
        obj.add();
        obj.divide();
    }
}
