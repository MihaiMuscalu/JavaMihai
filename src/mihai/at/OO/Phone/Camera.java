package mihai.at.OO.Phone;

public class Camera {

    private int Megapixels;
    private int photoNR;

    public Camera(int megapixels) {
        this.Megapixels = megapixels;
        this.photoNR = 0;
    }

    public int getMegapixels() {
        return Megapixels;
    }

    public PhoneFile makePicture()
    {
        photoNR +=1;
        PhoneFile f1 = new PhoneFile(Integer.toString(photoNR),".jpg",Megapixels*4);
        return f1;
    }
}


