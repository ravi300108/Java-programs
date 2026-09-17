package core_java;

class C2 {
    void showCollege() {
        System.out.println("Welcome to C2 College");
    }
    
    void showCourse() {
        System.out.println("Course: Computer Science");
    }
}

class C1 extends C2 {
    void showStudent() {
        System.out.println("Student Name: Ravi");
    }
}

public class C1toC2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        
        obj.showCollege();
        obj.showCourse();
        obj.showStudent();
    }
}
