import java.util.Arrays;
import java.util.Scanner;

public class Ceasar {
    public static void main(String[] args) {

       // char[] alphabet = {'a', "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        Scanner scanner= new Scanner(System.in);
        System.out.println("Write a word:");
        String word = scanner.next();
        Encrypt(word);


    }
    public static void Encrypt (String a)
    {
        char[] split = a.toCharArray();
        for (int i = 0; i < split.length; i++) {

        }



    }
}
