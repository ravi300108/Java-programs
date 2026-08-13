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

class C extends B {
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

        C obj = new C();

        obj.smtg();     
        obj.smtg2();   
        obj.smtg3();   

        obj.add();    
        obj.add(30);    
        obj.add(30, 40);  
    }
}
