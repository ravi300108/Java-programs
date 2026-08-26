class Customer {
    String customerName;
    String customerPlace;
    Customer(String customerName,String customerPlace) {
        this.customerName=customerName;
        this.customerPlace=customerPlace;
    }
    void sendOrder() {
        System.out.println(customerName+" has sent the order.");
    }
    void receiveOrder() {
        System.out.println(customerName+" has received the order.");
    }
}
class Order {
    String orderDate;
    String orderId;

    Order(String orderDate,String orderId) {
        this.orderDate=orderDate;
        this.orderId=orderId;
    }

    void confirmOrder() {
        System.out.println("Order "+orderId+" confirmed.");
    }

    void closeOrder() {
        System.out.println("Order "+orderId+" closed.");
    }
}

class SpecialOrder extends Order {
    SpecialOrder(String date,String id) {
        super(date,id);
    }

    void dispatchOrder() {
        System.out.println("Special Order "+orderId+" dispatched.");
    }
}
class NormalOrder extends Order {
    NormalOrder(String date,String id) {
        super(date,id);
    }
    void dispatchOrder() {
        System.out.println("Normal Order "+orderId+" dispatched.");
    }
    void receiveNormalOrder() {
        System.out.println("Normal Order "+orderId+" received.");
    }
}
public class OrderDemo {
    public static void main(String[] args) {
        Customer c1=new Customer("Meghana","Srikakulam");
        SpecialOrder s1=new SpecialOrder("11-08-2026","S101");
        NormalOrder n1=new NormalOrder("11-08-2026","N101");
        System.out.println("Customer Information");
        System.out.println("Customer Name: "+c1.customerName);
        System.out.println("Place: "+c1.customerPlace);
        System.out.println("\nSpecial Order Details");
        s1.confirmOrder();
        s1.dispatchOrder();
        s1.closeOrder();
        System.out.println("\nNormal Order Details");
        n1.confirmOrder();
        n1.dispatchOrder();
        n1.receiveNormalOrder();
        n1.closeOrder();
        System.out.println("\nCustomer Activities");
        c1.sendOrder();
        c1.receiveOrder();
    }
}
