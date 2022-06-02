package Test;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();
        int Zahl1 = random.nextInt(1000);
        int Zahl2 = random.nextInt(1000);

        if(Zahl1 > Zahl2)
        {
            Zahl1 -= Zahl2;
        }
        if(Zahl1 == Zahl2)
        {
            Zahl1 -= 1;
        }

        for (int i = Zahl2; i > Zahl1 || i == Zahl1; i--) {
            System.out.println(i);
        }
    }
}
