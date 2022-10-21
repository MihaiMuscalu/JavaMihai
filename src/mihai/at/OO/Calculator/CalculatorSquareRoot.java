package mihai.at.OO.Calculator;

public class CalculatorSquareRoot extends CalculatorBasic{

    public CalculatorSquareRoot(int number1, int number2) {
        super(number1, number2);
    }

    public double SquareRoot(double a){
        double b = Math.sqrt(a);
        return b;
    }
}
