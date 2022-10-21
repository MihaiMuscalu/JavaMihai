package mihai.at.OO.Lamp;

public class MainLamp {


    public static void main(String[] args) {
        Glowelement g1 = new Glowelement("gred","red");
        Glowelement g2 = new Glowelement("gblue","blue");

        Lamp l1 = new Lamp("lamp1");

        l1.addGlowElement(g1);
        l1.addGlowElement(g2);
        System.out.println(l1.getGlowElements());
        System.out.println(l1.getOverallPowerUsage());
        l1.turnAllOn();
        System.out.println(l1.getOverallPowerUsage());
        l1.turnOn();
        l1.turnOn();
    }
}
