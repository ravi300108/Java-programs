interface Calculator {
    void add();
}

class Smtg1 implements Calculator {

    public void add() {
        int a = 10;
        int b = 20;
        System.out.println("Smtg1 Addition = " + (a + b));
    }
}

class Smtg2 implements Calculator {

    public void add() {
        int a = 30;
        int b = 40;
        System.out.println("Smtg2 Addition = " + (a + b));
    }

    public static void main(String[] args) {

        Smtg1 obj1 = new Smtg1();
        Smtg2 obj2 = new Smtg2();

        obj1.add();
        obj2.add();
    }
}
