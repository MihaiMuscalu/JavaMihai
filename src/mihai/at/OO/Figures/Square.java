package mihai.at.OO.Figures;

public class Square extends Figure{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        double area = length*length;
        return area;
    }
}
