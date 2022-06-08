import java.util.Arrays;

public class Quersumme3 {

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int[] howOften = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            howOften[getSum(numbers[i])] += 1;
        }


            System.out.println(Sort(howOften));

    }

    public static int Sort (int[] a)
    {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (temp < a[i])
            {
                temp =  i;
            }
        }
     return temp;
    }


    public static int getSum(int number) {
        //make from integer a string
        String numberAsString = Integer.toString(number);

        //break the string in characters apart and put them in an array
        char[] numbers = numberAsString.toCharArray();

        int sum = 0;

        //add the characters together
        for (int i = 0; i < numbers.length; i++) {

            sum += Character.getNumericValue(numbers[i]);
        }
        return sum;
    }



}