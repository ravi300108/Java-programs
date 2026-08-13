class Book {
    private int id;
    private String name, author;
    private double price;

    Book(int id, String name, String author, double price) {
        this.id=id; this.name=name; this.author=author; this.price=price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id=id; }
    public String getName() { return name; }
    public void setName(String name) { this.name=name; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author=author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price=price; }

    void display() {
        System.out.println(id+" "+name+" "+author+" "+price);
    }
}

class Person {
    String name; int age;
    void display() { System.out.println(name+" "+age); }
}

class Student extends Person {
    String course;
    void display() {
        super.display();
        System.out.println(course);
    }
}

class Faculty extends Person {
    String dept;
    void display() {
        super.display();
        System.out.println(dept);
    }
}

class Area {
    void area(double r) { System.out.println(3.14*r*r); }
    void area(int l,int b) { System.out.println(l*b); }
}

class Vehicle {
    void display() { System.out.println("Vehicle"); }
}

class Car extends Vehicle {
    void display() { System.out.println("Car"); }
}

class Bike extends Vehicle {
    void display() { System.out.println("Bike"); }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Rectangle"); }
}

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() { System.out.println("Report"); }
}

public class Library {
    public static void main(String[] args) {

        Book b=new Book(101,"Java","Gosling",500);
        b.display();

        Student s=new Student();
        s.name="Bob"; s.age=20; s.course="Engineering";
        s.display();

        Faculty f=new Faculty();
        f.name="Dr.Bob"; f.age=45; f.dept="CSE";
        f.display();

        Area a=new Area();
        a.area(5.0);
        a.area(10,20);

        Vehicle v1=new Car(), v2=new Bike();
        v1.display(); v2.display();

        Shape sh1=new Circle(), sh2=new Rectangle();
        sh1.draw(); sh2.draw();

        Printable p=new Report();
        p.print();
    }
}
