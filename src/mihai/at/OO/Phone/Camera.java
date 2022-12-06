package mihai.at.OO.Phone;

public class Camera {
    private enum AspectRatio {LANDSCAPE,PORTRAIT};
    private AspectRatio aspectRatio;
    private int Resolution;

    public Camera(int resolution, AspectRatio aspectRatio) {
        this.Resolution = resolution;
        this.aspectRatio = aspectRatio;
    }

    public int getResolution() {
        return Resolution;
    }

    public AspectRatio getAspectRatio() {
        return aspectRatio;
    }

    public void makePicture()
    {

    }
}


