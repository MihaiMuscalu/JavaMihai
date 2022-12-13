package mihai.at.OO.Camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacityInGB;
    private List<Photo> photos = new ArrayList<>();

    public SDCard(int capacityInGB) {
        this.capacityInGB = capacityInGB;
    }

    public int getCapacity() {
        return capacityInGB;
    }

    public List<Photo> getPhotos() {
        return photos;
    }
}
