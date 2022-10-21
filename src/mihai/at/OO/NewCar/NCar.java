package mihai.at.OO.NewCar;

public class NCar {

    private String color;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumption;
    private double consumption;
    private int distanceDriven;
    private NEngine engine;
    private Producer producer;
    private double price;

    public NCar(String color, int maxSpeed, int distanceDriven, int basePrice, int baseConsumption, NEngine engine, Producer producer) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.distanceDriven = distanceDriven;
        if(distanceDriven > 50000)
        {
            consumption = baseConsumption * 1.098;
        }else consumption = baseConsumption;
        this.engine = engine;
        this.producer = producer;
        this.price = this.basePrice * this.producer.getDiscount();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public NEngine getEngine() {
        return engine;
    }

    public void setEngine(NEngine engine) {
        this.engine = engine;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(int distanceDriven) {
        this.distanceDriven = distanceDriven;
    }
}
