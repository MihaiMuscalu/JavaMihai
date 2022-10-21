package mihai.at.OO.CarTest;

public class Engine {

    public enum TYPE {DIESEL, GAS};
    private int horsepower;
    private TYPE type;
    private int Tank;

    public Engine(int Tank, int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
        this.Tank = Tank;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setTank(int tank) {
        Tank = tank;
    }

    public int getTank() {
        return Tank;
    }
}
