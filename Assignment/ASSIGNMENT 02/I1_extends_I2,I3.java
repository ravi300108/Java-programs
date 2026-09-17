package core_java;

interface I2 {
    void turnOn();
}

interface I3 {
    void setVolume();
}

interface I1 extends I2, I3 {
    void playMusic();
}

class C1 implements I1 {

    public void turnOn() {
        System.out.println("Music system is turned on");
    }

    public void setVolume() {
        System.out.println("Volume set to 10");
    }

    public void playMusic() {
        System.out.println("Playing favourite song");
    }

    void turnOff() {
        System.out.println("Music system is turned off");
    }
}

public class I1toI2I3 {
    public static void main(String[] args) {
        
        C1 obj = new C1();
        
        obj.turnOn();
        obj.setVolume();
        obj.playMusic();
        obj.turnOff();
    }
}
