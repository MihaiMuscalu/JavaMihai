package OO.Objects;

public class Car {

    private Engine engine;
    private int fuelConsumption;
    private int Tank;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;


    public Car(Engine engine, int fuelConsumption, int Tank, String brand, String serialNumber) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.Tank = Tank;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption <= this.Tank) {
            this.fuelConsumption = fuelConsumption;
        } else this.fuelConsumption = this.Tank;
    }

    public void setTank(int tank) {
        Tank = tank;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount <= this.Tank) {
            this.fuelAmount = fuelAmount;
        } else this.fuelAmount = this.Tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTank() {
        return Tank;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void Drive() {

        if (fuelAmount >= fuelConsumption) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I am driving!");
        }

    }

    public void Break() {

        System.out.println("I am breaking!");

    }

    public void TurboBoost() {

        if (this.fuelAmount > Tank / 10) {
            System.out.println("SuperBoostMode!");
        } else System.out.println("Not enough fuel in tank to go Turbo!");

    }

    public void honk(int Repetitions) {

        while (Repetitions > 0) {
            Repetitions -= 1;
            System.out.println("tuut");
        }
    }

    public void getRemainingRange() {

        int range = (fuelAmount / fuelConsumption) * 100;

        if (range > 1) {
            System.out.printf("You can drive %d more kilometers!", range);
        }
        if (range == 1) {
            System.out.printf("You can drive %d more kilometer!", range);
        }
        if (range < 1) {
            System.out.printf("You can't drive any more kilometers!");
        }
    }
}
