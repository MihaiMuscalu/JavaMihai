package mihai.at.OO.Phone;

import java.util.List;

public class MainPhone {
    public static void main(String[] args) {
        PhoneFile f1 = new PhoneFile("mihai", ".jpg", 2);
        SDCard sd1 = new SDCard(120);
        Camera c1 = new Camera(3);
        SIM s1 = new SIM(1,"0600123123123");

        Phone p1 = new Phone("blue",sd1,c1,s1);

        //save file
        sd1.saveFile(f1);
        System.out.println(sd1.getAllFiles());

        c1.makePicture();


        p1.printAllFiles();



    }

}
