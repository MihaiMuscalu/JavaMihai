package OO;

import OO.CarTest.Car;
import OO.CarTest.Engine;
import OO.CarTest.RearMirror;
import OO.CarTest.Wheel;

public class Main {
    public static void main(String[] args) {

    Engine e1 = new Engine(70,140, Engine.TYPE.DIESEL);
    RearMirror r1 = new RearMirror(100, 0);
    RearMirror r2 = new RearMirror(100, -40);
    Wheel w1 = new Wheel(30, 1, Wheel.TYPE.Summer);
    Wheel w2 = new Wheel(30, 2, Wheel.TYPE.Summer);
    Wheel w3 = new Wheel(30, 3, Wheel.TYPE.Summer);
    Wheel w4 = new Wheel(30, 4, Wheel.TYPE.Summer);
    Car car1 = new Car(e1,8,"Audi","88887");
    car1.setFuelAmount(90);
    System.out.println(car1.getFuelAmount());
    car1.drive(72);
    System.out.println(car1.getFuelAmount());
    car1.addMirror(r1);
    car1.addMirror(r2);
    car1.addWheel(w1);
    car1.addWheel(w2);
    car1.addWheel(w3);
    car1.addWheel(w4);

    System.out.println(car1.getMirrors().get(0).getPosition());
    System.out.println(car1.getWheels().get(0).getSize());
    }
}
