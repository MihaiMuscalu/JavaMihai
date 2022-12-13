package mihai.at.OO.Camera;
public class Photo {
    private int size;
    private String name;
    private String extension;

    public Photo(int size, String name, String extension) {
        this.size = size;
        this.name = name;
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public void getFileInfo()
    {
        System.out.println(this.getName() + this.getExtension() + "\nSize: " + this.getSize() + " GigaBytes");
    }
}
