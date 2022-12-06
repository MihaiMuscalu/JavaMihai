package mihai.at.OO.Phone;

import java.util.ArrayList;
import java.util.List;


public class SDCard {
    private int capacity;
    private List<PhoneFile> files = new ArrayList<>();

    public SDCard(int capacityMB) {
        this.capacity = capacityMB;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getAllFiles() {
        return files;
    }

    public void saveFile(PhoneFile file) {
        files.add(file);
    }

}
