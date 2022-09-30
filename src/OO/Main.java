package OO;
import OO.Objects.Car;

public class Main {
    public static void main(String[] args)
    {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;

        System.out.println(c1.fuelAmount);
        c1.Drive();
        System.out.println(c1.fuelAmount);
    }
}
