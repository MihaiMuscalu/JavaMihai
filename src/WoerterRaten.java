import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WoerterRaten {


    public static void main(String[] args) {

        String[] wordArray = {"baby","woman","kid","man","child","teenager"};
        Random number = new Random();
        String choosenWord = wordArray[number.nextInt(wordArray.length)];

        Game(choosenWord);

    }

    public static void Game(String word) {

        char[] rightLetters = new char[10];
        char[] wrongLetters = new char[10];


        char[] wordCheck = word.toCharArray();
        char[] censor = new char[word.length()];



        int wrongLettersNR = 0;
        int rightLetterNR = 0;


        while (true) {

            boolean wordFalse = true;






            //Looks for where the right letters are located.
            //Changes "*" censor with the right letter.
            for (int j = 0; j < wordCheck.length; j++) {

                if (wordCheck[j] == rightLetters[j]) {
                    censor[j] = rightLetters[j];
                } else censor[j] = '*';
            }


            //Types the censored word in the terminal
            System.out.println(censor);

            //Runs input function the puts the letter into a variable
            char input = PlayerInput();

            //Checks if input letter is in the word
            //Puts letter into the right or wrong letter array
            for (int i = 0; i < wordCheck.length; i++) {
                if (input == wordCheck[i]) {
                    rightLetters[i] = input;
                    rightLetterNR += 1;
                    wordFalse = false;
                }
            }

            //Show wrong letters if the array is not empty
            if (wrongLettersNR >= 1) {
                String wrongLettersString = new String(wrongLetters);
                wrongLettersString.trim();
                System.out.println("Wrong Letters:" + wrongLettersString);
            }

            if (wordFalse) {
                wrongLettersNR += 1;
                wrongLetters[wrongLettersNR] = input;
            }



            if ( rightLetterNR == wordCheck.length) {
                System.out.println("You guessed the Word:"+ word + "!");
                break;
            }

        }
    }


    public static char PlayerInput() {
        //Lets player input a letter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a letter:");
        char input = scanner.next().charAt(0);
        return input;
    }


}


