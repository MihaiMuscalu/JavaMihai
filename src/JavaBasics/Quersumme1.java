package JavaBasics;

public class Quersumme1 {
    public static void main(String[] args) {
    int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            //if the Sum of the character in a number is equal to 15: show the number
            if(getSum(numbers[i]) == 15){
                System.out.println(numbers[i]);
            }
        }
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
