package OO.NewCar;

public class NEngine {
    private enum TYPE {DIESEL, GAS}
    private int horsePower;

    public NEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
