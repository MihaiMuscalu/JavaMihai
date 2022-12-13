package mihai.at.OO.Camera;

import mihai.at.OO.Phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacityInGB;
    private List<Photo> photos = new ArrayList<>();
    private int freeSpace;

    public SDCard(int capacityInGB) {
        this.capacityInGB = capacityInGB;
        this.freeSpace = capacityInGB;
    }

    public int getCapacity() {
        return capacityInGB;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public int getFreeSpace() {
        for (Photo photo : photos) {
            this.freeSpace -= photo.getSize();
        }
        return this.freeSpace;
    }
}
