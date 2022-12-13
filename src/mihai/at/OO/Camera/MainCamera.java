package mihai.at.OO.Camera;

public class MainCamera {
    public static void main(String[] args) {

        Camera c1 = new Camera(1080,50,"blue");

        Producer p1 = new Producer("Markus","Deutschland");
        Lens l1 = new Lens(p1,80);
        SDCard s1 = new SDCard(20);

        c1.setLens(l1);
        c1.setProducer(p1);
        c1.setSdCard(s1);
        c1.takePicture(Camera.TYPE.SMALL);
        s1.getPhotos();
        c1.printAllFiles();
    }
}
