import java.util.Random;

public class WoerterRaten {


    public static void main(String[] args) {

        String Censor = "";
        String[] wordArray = {"man","woman","child","kid","teenager","adult","baby"};
        Random number = new Random();
        String choosenWord = wordArray[number.nextInt(wordArray.length)];
        for (int i = 0; i < choosenWord.length(); i++) {
            Censor += "*";

        }
        GameStart(choosenWord);
        System.out.println(Censor);


    }
    public static void GameStart(String choosenWord)
    {
        char[] WordCheck = choosenWord.toCharArray();



    }

}
