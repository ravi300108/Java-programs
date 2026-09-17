package core_java;

interface I1 {
    void start();
}

interface I2 {
    void stop();
}

class C1 implements I1, I2 {

    public void start() {
        System.out.println("System started");
    }

    public void stop() {
        System.out.println("System stopped");
    }

    void checkStatus() {
        System.out.println("System status is normal");
    }
}

public class C1toI1I2 {
    public static void main(String[] args) {
        
        C1 obj = new new C1();
        
        obj.start();
        obj.checkStatus();
        obj.stop();
    }
}
