package mihai.at.OO.Calculator;

public class CalculatorReasearch extends CalculatorBasic{


    public CalculatorReasearch(int number1, int number2) {
        super(number1, number2);

    }

    public double Sinus(double a) {
        double b = Math.sin(a);
        return b;
    }

    public double Cosinus(double a) {
        double b = Math.cos(a);
        return b;
    }
}
