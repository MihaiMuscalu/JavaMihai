package OO.Objects;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public void Drive()
    {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving!");
    }
}
