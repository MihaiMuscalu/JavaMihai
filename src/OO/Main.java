package OO;

import OO.Objects.Car;
import OO.Objects.Engine;

public class Main {
    public static void main(String[] args) {

    Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
    Car car1 = new Car(e1,8,80,"Audi","88887");
    car1.setFuelAmount(90);

    }
}
