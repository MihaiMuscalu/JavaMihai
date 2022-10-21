package mihai.at.OO.Calculator;

public class CalculatorBasic {
    private double number1;
    private double number2;

    public CalculatorBasic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double addition(){
        double addition = number1 + number2;
        return addition;

    }

    public double subtraction(){
        double subtraction = number1 - number2;
        return subtraction;
    }

    public double multiplication(){
        double multiplication = number1 * number2;
        return multiplication;
    }

    public double division(){
        double division = number1 / number2;
        return division;
    }

}
