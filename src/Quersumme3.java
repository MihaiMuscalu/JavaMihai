import java.util.Arrays;

public class Quersumme3 {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        int[] howOften = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            howOften[getSum(numbers[i])] += 1;
            //Sort(howOften);
            System.out.println(howOften[i]);

        }
    }
//    public static int[] Sort (int[] a)
//    {
//        int temp;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                if(a[i] > a[j])
//                {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        return a;
//    }


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