package mihai.at.OO.Camera;

import mihai.at.OO.Phone.PhoneFile;

import java.util.List;

public class Camera {
    private int mass;
    private String color;
    private SDCard sdCard;
    private Producer producer;
    private Lens lens;

    public enum TYPE {SMALL, MEDIUM, BIG}

    private TYPE type;
    private int photoNR = 0;

    public Camera(int mass, String color) {

        this.mass = mass;
        this.color = color;
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

    public void takePicture(TYPE type) {

        Photo result = null;
        photoNR += 1;
        if (sdCard == null) return;
        switch (type) {
            case SMALL:
                if (sdCard.getFreeSpace() < 2) {
                    System.out.println("No space available!");
                    break;
                }
                result = new Photo(2, Integer.toString(photoNR), ".jpg");
            case MEDIUM:
                if (sdCard.getFreeSpace() < 4) {
                    System.out.println("No space available!");
                    break;
                }
                result = new Photo(4, Integer.toString(photoNR), ".jpg");
            case BIG:
                if (sdCard.getFreeSpace() < 6) {
                    System.out.println("No space available!");
                    break;
                }
                result = new Photo(6, Integer.toString(photoNR), ".jpg");
        }

        sdCard.getPhotos().add(result);
    }

    public void printAllFiles() {
        List<Photo> photos = this.sdCard.getPhotos();
        for (Photo photo : this.sdCard.getPhotos()) {
            photo.getFileInfo();
        }
    }
}
