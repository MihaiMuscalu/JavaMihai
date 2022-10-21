package mihai.at.OO.CarTest;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Wheel> wheels;
    private int fuelConsumption;
    private double fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;


    public Car(Engine engine, int fuelConsumption, String brand, String serialNumber) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption <= engine.getTank()) {
            this.fuelConsumption = fuelConsumption;
        } else this.fuelConsumption = engine.getTank();
    }


    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount <= engine.getTank()) {
            this.fuelAmount = fuelAmount;
        } else this.fuelAmount = engine.getTank();
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

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public double getFuelAmount() {
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

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void drive(double speed) {

        if (this.fuelAmount >= this.fuelConsumption) {
            double distance = this.fuelConsumption * (speed / 100) * 100;
            this.fuelAmount -= distance / 100;
            System.out.println("I drove " + (int) distance + " kilometers");

        } else {

            double distance = this.fuelConsumption * (speed / 100);
            this.fuelAmount = 0;
            System.out.println("I drove " + (int) distance * 100 + " kilometers");

        }

    }

    public void Break() {

        System.out.println("I am breaking!");

    }

    public void TurboBoost() {

        if (this.fuelAmount > engine.getTank() / 10) {
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

        double range = (fuelAmount / fuelConsumption) * 100;

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

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }
}
