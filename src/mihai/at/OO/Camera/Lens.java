package mihai.at.OO.Camera;

public class Lens {
    private Producer producer;
    private int focalLength;


    public Lens(Producer producer, int focalLength) {
        this.producer = producer;
        this.focalLength = focalLength;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getFocalLength() {
        return focalLength;
    }
}
