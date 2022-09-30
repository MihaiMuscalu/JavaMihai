package OO.Objects;

public class Car {

    public int fuelConsumption;
    public int Tank;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

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

        int range = fuelAmount / fuelConsumption;

        if (range > 1) {
            System.out.printf("You can drive %f more kilometers!", range);
        }
        if (range == 1) {
            System.out.printf("You can drive %f more kilometer!", range);
        }
        if (range < 1) {
            System.out.printf("You can't drive any more kilometers!");
        }

    }
}
