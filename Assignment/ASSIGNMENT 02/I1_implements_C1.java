package core_java;

interface I1 {
    void bookTicket();
}

class C1 implements I1 {

    public void bookTicket() {
        System.out.println("Ticket booked successfully");
    }

    void showSeat() {
        System.out.println("Seat Number: A12");
    }

    void cancelTicket() {
        System.out.println("Ticket cancellation completed");
    }
}

public class I1toC1 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.bookTicket();
        obj.showSeat();
        obj.cancelTicket();
    }
}
