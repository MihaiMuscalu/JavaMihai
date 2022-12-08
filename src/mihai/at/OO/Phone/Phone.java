package mihai.at.OO.Phone;

import java.util.List;

public class Phone {
    private String color;
    private SDCard sdCard;
    private Camera cam;
    private SIM sim;

    public Phone(String color, SDCard sdCard, Camera cam, SIM sim) {
        this.color = color;
        this.sdCard = sdCard;
        this.cam = cam;
        this.sim = sim;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public Camera getCam() {
        return cam;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public String getColor() {
        return color;
    }


    public void takePicture()
    {
        if(this.sdCard.getFreeSpace() <= this.sdCard.getCapacity()/10 || this.sdCard == null)
        {
            System.out.println("Kein Platz oder keine Karte");
            return;
        }
        PhoneFile file = this.cam.makePicture();
    }

    public void printAllFiles()
    {
        List<PhoneFile> files = this.sdCard.getAllFiles();
        for (PhoneFile file : this.sdCard.getAllFiles()) {
           file.getFileInformation();
        }
    }

    public int getFreeSpace()
    {
        return sdCard.getFreeSpace();
    }
    public void makeCall(String number)
    {
        if (sim == null)
        {
            System.out.println("No SIM card!");
            return;
        }
        System.out.println("Calling " + number);
    }
}
