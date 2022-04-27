import java.util.Arrays;
import java.util.Scanner;

public class Ceasar {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Write a word:");
        String word = scanner.next();

        Encrypt(word);


    }

    public static void Encrypt (String a)
    {
        //The Encrypt function takes the letters from a word and shifts them 2 places in the alphabet
        //E.g. a to c; b to e; A to C; B to E
        //The Encrypt function is case-sensitive and will convert uppercase letters as uppercase.
        //If the letter is at the end of the alphabet

        char[] splitWord = a.toCharArray();
        int[] asciiWord = new int[splitWord.length];
        char[] encodedWordSplit = new char[splitWord.length];

        //for every character in Word shift letter 2 places in the alphabet
        for (int i = 0; i < splitWord.length; i++) {
            asciiWord[i] = (int)splitWord [i];

            //if asciiWord is y or Y: change to a or A
            if(asciiWord[i]== 121) {asciiWord[i] =97;}
            if(asciiWord[i]== 89) {asciiWord[i] =65;}

            //if asciiWord is z or Z: change to b or B
            if(asciiWord[i]== 122) {asciiWord[i] =98;}
            if(asciiWord[i]== 90) {asciiWord[i] =66;}

            //if asciiWord is not z or Z: shift letter 2 places in the alphabet
            if(asciiWord[i]!= 97 && asciiWord[i]!= 65 && asciiWord[i]!= 98 && asciiWord[i]!= 66 ) {asciiWord [i] += 2;}

            //convert integer array to character array
            encodedWordSplit[i] = (char) asciiWord[i];
        }

        //convert character array back to String
        String encodedWord = new String(encodedWordSplit);

        System.out.println(encodedWord);

    }
}
