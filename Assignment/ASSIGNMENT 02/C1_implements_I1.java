package core_java;

interface I1 {
    void login();
    void logout();
}

class C1 implements I1 {

    public void login() {
        System.out.println("User logged in successfully");
    }

    public void logout() {
        System.out.println("User logged out successfully");
    }

    void showProfile() {
        System.out.println("Profile is displayed");
    }
}

public class C1toI1 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.login();
        obj.showProfile();
        obj.logout();
    }
}
