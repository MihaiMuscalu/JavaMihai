package mihai.at.OO.Phone;

public class PhoneFile {
    private String extension;
    private String name;
    private int size;


    public PhoneFile(String name, String extension, int sizeMB) {
        this.extension = extension;
        this.name = name;
        this.size = sizeMB;
    }

    public String getExtension() {
        return extension;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
