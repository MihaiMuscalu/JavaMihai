package OO.Remote;

public class MainRemote {

    public static void main(String[] args) {

        Battery b1 = new Battery(100,100);
        Battery b2 = new Battery(100,100);
        Remote r1 = new Remote();

        r1.addBattery(b1);
        r1.addBattery(b2);

        System.out.println(r1.getStatus());
        r1.turnOn();
        System.out.println(r1.getStatus());
        r1.turnOff();


    }





}
