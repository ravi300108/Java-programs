package core_java;

interface I2 {
    void connect();
}

interface I1 extends I2 {
    void sendData();
}

class C1 implements I1 {

    public void connect() {
        System.out.println("Network connected");
    }

    public void sendData() {
        System.out.println("Data sent successfully");
    }

    void disconnect() {
        System.out.println("Network disconnected");
    }
}

public class I1toI2 {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.connect();
        obj.sendData();
        obj.disconnect();
    }
}
