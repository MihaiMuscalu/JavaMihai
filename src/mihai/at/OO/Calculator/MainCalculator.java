package mihai.at.OO.Calculator;

public class MainCalculator {
    public static void main(String[] args) {
        CalculatorBasic c1 = new CalculatorBasic(1,2);
        CalculatorReasearch c2 = new CalculatorReasearch(1,2);
        CalculatorSquareRoot c3 = new CalculatorSquareRoot(1,2);

        System.out.println(c1.division());

        System.out.println(c2.Sinus(1));
        System.out.println(c3.SquareRoot(4));
    }



}
