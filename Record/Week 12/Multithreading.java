class Reservation {
 int availableSeats = 10;
 synchronized void reserve(String name, int seats) {
 System.out.println(name + " entered.");
 System.out.println("Available seats: " + availableSeats
 + " Requested seats: " + seats);
 if (seats <= availableSeats) {
 System.out.println("Seat Available. Reserve now :-)");
 availableSeats = availableSeats - seats;
 System.out.println(seats + " seats reserved.");
 } else {
 System.out.println("Requested seats not available :-)");
 }
 System.out.println(name + " leaving.");
 System.out.println("----------------------------------------------");
 }
}
class Person extends Thread {
 Reservation reservation;
 int seats;
 Person(String name, Reservation reservation, int seats) {
 super(name);
 this.reservation = reservation;
 this.seats = seats;
 }
 public void run() {
 reservation.reserve(getName(), seats);
 }
}
public class ReservationDemo {
 public static void main(String[] args) {
 Reservation reservation = new Reservation();
 Person p1 = new Person("Person-1", reservation, 5);
 Person p2 = new Person("Person-2", reservation, 2);
 Person p3 = new Person("Person-3", reservation, 4);
 p1.start();
 try {
 p1.join();
 p2.start();
 p2.join();
 p3.start();
 p3.join();
 } catch (InterruptedException e) {
 System.out.println("Thread interrupted."); }
 }
}

