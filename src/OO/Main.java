package OO;

import OO.Objects.Car;
import OO.Objects.Engine;
import OO.Objects.RearMirror;

public class Main {
    public static void main(String[] args) {

    Engine e1 = new Engine(70,140, Engine.TYPE.DIESEL);
    RearMirror r1 = new RearMirror(100, 0);
    RearMirror r2 = new RearMirror(100, -40);
    Car car1 = new Car(e1,8,"Audi","88887");
    car1.setFuelAmount(90);
    System.out.println(car1.getFuelAmount());
    car1.drive(72);
    System.out.println(car1.getFuelAmount());
    car1.addMirror(r1);
    car1.addMirror(r2);

        System.out.println(car1.getMirrors().get(0).getPosition());
    }
}
