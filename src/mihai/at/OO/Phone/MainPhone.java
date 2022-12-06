package mihai.at.OO.Phone;

import java.util.List;

public class MainPhone {
    public static void main(String[] args) {
        PhoneFile f1 = new PhoneFile("mihai", ".jpg", 2);
        SDCard s1 = new SDCard(120);


        //save file
        s1.saveFile(f1);
        System.out.println(s1.getAllFiles());


        //get files name with a loop
        List<PhoneFile> list = s1.getAllFiles();
        for (PhoneFile file : list) {
            System.out.println(file.getName() + file.getExtension() + "\nSize: " + file.getSize() + " MegaBytes");
        }
    }

}
