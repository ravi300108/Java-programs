package core_java;

class C3 {
    void openLibrary() {
        System.out.println("Library is open");
    }
}

class C2 extends C3 {
    void issueBook() {
        System.out.println("Book issued successfully");
    }
}

class C1 extends C2 {
    void readBook() {
        System.out.println("Reading a Java book");
    }
}

public class C1toC2C3 {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.openLibrary();
        obj.issueBook();
        obj.readBook();
    }
}
