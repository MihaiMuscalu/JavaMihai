import java.util.Arrays;
import java.util.Scanner;


public class Ceasar {

    public static void main(String[] args) {

        boolean end = false;

        while (!end) {

            //Menu
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Encrypt Word");
            System.out.println("2.Decrypt Word");
            System.out.println("3.End Script");
            int selection = scanner.nextInt();

            //Chose Encrypt, Decrypt or end code
            switch (selection) {
                case 1:
                    System.out.println("Write your word:");
                    String Word = scanner.next();
                    String encryptedWord = Encrypt(Word);
                    System.out.printf("Your encrypted word is: %s%n", encryptedWord);
                    break;
                case 2:
                    System.out.println("Write your word:");
                    Word = scanner.next();
                    String decryptedWord = Decrypt(Word);
                    System.out.printf("Your decrypted word is: %s%n", decryptedWord);
                    break;
                default:
                    System.out.println("Script ending.");
                    end = true;
                    break;
            }

        }


    }

    public static String Encrypt (String a)
    {
        //The Encrypt function takes the letters from a word and shifts them 2 places in the alphabet forwards
        //E.g. a to c; b to e; A to C; B to E
        //The Encrypt function is case-sensitive and will convert uppercase letters as uppercase.
        //If the letter is at the end of the alphabet it will jump back to the beginning.

        char[] splitWord = a.toCharArray();
        int[] asciiWord = new int[splitWord.length];
        char[] encodedWordSplit = new char[splitWord.length];

        //for every character in Word shift letter 2 places in the alphabet forwards
        for (int i = 0; i < splitWord.length; i++) {
            asciiWord[i] = (int)splitWord [i];

            //if asciiWord is not z or Z OR y or Y: shift letter 2 places in the alphabet
            if(asciiWord[i]!= 121 && asciiWord[i]!= 89 && asciiWord[i]!= 122 && asciiWord[i]!= 90 ) {asciiWord [i] += 2;}

            //if asciiWord is y or Y: change to a or A
            if(asciiWord[i]== 121) {asciiWord[i] =97;}
            if(asciiWord[i]== 89) {asciiWord[i] =65;}

            //if asciiWord is z or Z: change to b or B
            if(asciiWord[i]== 122) {asciiWord[i] =98;}
            if(asciiWord[i]== 90) {asciiWord[i] =66;}



            //convert integer array to character array
            encodedWordSplit[i] = (char) asciiWord[i];
        }

        //convert character array back to String
        String decodedWord = new String(encodedWordSplit);

        return  decodedWord;
    }

    public static String Decrypt(String a) {
        //The Decrypt function takes the letters from a word and shifts them 2 places in the alphabet backwards
        //E.g. c to a; e to b; C to A; E to B
        //The Decrypt function is case-sensitive and will convert uppercase letters as uppercase.
        //If the letter is at the beginning of the alphabet it will jump back to the end.


        char[] splitWord = a.toCharArray();
        int[] asciiWord = new int[splitWord.length];
        char[] decodedWordSplit = new char[splitWord.length];

        for (int i = 0; i < splitWord.length; i++) {
            asciiWord[i] = (int) splitWord[i];

            //if asciiWord is a or A: change to y or Y
            if (asciiWord[i] == 97) {asciiWord[i] = 121;}
            if (asciiWord[i] == 65) {asciiWord[i] = 89;}

            //if asciiWord is b or B: change to z or Z
            if (asciiWord[i] == 98) {asciiWord[i] = 122;}
            if (asciiWord[i] == 66) {asciiWord[i] = 90;}

            //if asciiWord is not a or A OR b or B: shift letter 2 places in the alphabet
            if (asciiWord[i] != 121 && asciiWord[i] != 89 && asciiWord[i] != 122 && asciiWord[i] != 90) {asciiWord[i] -= 2;}

            //convert integer array to character array
            decodedWordSplit[i] = (char) asciiWord[i];
        }
        String decodedWord = new String(decodedWordSplit);

        return decodedWord;

    }


}
