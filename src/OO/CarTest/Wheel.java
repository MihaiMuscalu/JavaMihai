package OO.CarTest;

public class Wheel {

    public enum TYPE {Winter, Summer};
    private TYPE type;
    private int size; // in cm
    private int pos; // 1 = front right wheel, 2 = left right wheel, 3 =  back right wheel, 4 = back left wheel


    public Wheel(int size, int pos, TYPE type) {
        this.type = type;
        this.size = size;
        this.pos = pos;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
