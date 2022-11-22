package mihai.at.OO.Figures;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        double area = Math.PI * Math.pow(radius,radius);
        return area;
    }
}
