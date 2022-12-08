package JavaBasics;

public class Quersumme4 {
    public static void main(String[] args)
    {
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(getSum(numbers[i]));
        }


    }
    public static int getSum(int number)
    {
        int sum = 0;
            //make from integer a string
            String numberAsString = Integer.toString(number);

            //break the string in characters apart and put them in an array
            char[] numbers = numberAsString.toCharArray();

            //add the characters together
            for (int i = 0; i < numbers.length; i++)
            {
                sum += Character.getNumericValue(numbers[i]);
            }
        return sum;
    }
}
