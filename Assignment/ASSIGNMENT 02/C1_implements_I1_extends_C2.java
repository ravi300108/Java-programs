package core_java;

interface I1 {
    void calculateBill();
}

class C2 implements I1 {
    
    public void calculateBill() {
        System.out.println("Total bill calculated");
    }
    
    void generateReceipt() {
        System.out.println("Receipt generated");
    }
}

class C1 extends C2 {
    
    void makePayment() {
        System.out.println("Payment completed successfully");
    }
}

public class C1C2I1 {
    public static void main(String[] args) {
        
        C1 obj = new C1();
        
        obj.calculateBill();
        obj.generateReceipt();
        obj.makePayment();
    }
}
