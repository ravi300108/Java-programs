class Smtg1 {
    int a[] = {10, 20, 30, 40, 50};

    void add() {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);
    }
}
public static void main(String[] args) {
        Smtg1 s = new Smtg2();
        s.add();        
    }
}
