package mihai.at.OO.Camera;

public class Camera {
    private int pixel;
    private int mass;
    private String color;
    private SDCard sdCard;
    private Producer producer;
    private Lens lens;
    private enum TYPE{SMALL,MEDIUM,BIG}
    private TYPE type;
    private int photoNR = 0;

    public Camera(int pixel, int mass, String color) {
        this.pixel = pixel;
        this.mass = mass;
        this.color = color;
    }

    public int getPixel() {
        return pixel;
    }

    public int getMass() {
        return mass;
    }

    public String getColor() {
        return color;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public Producer getProducer() {
        return producer;
    }

    public Lens getLens() {
        return lens;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public void takePicture(TYPE type)
    {
        Photo result = null;
        photoNR +=1;
        switch (type) {
            case SMALL:
                result = new Photo(2,Integer.toString(photoNR),".jpg");
                break;
            case MEDIUM:
                result = new Photo(4,Integer.toString(photoNR),".jpg");
                break;
            case BIG:
                result = new Photo(6,Integer.toString(photoNR),".jpg");
                break;
        }
        sdCard.getPhotos().add(result);
    }
}
