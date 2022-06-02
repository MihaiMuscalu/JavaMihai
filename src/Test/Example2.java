package Test;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {

        int Sum = 0;

        while(true)
        {
            Random random = new Random();
            int Zahl = random.nextInt(10);


            Sum += Zahl;

            if(Zahl == 5)
            {
                System.out.println(Sum);
                break;
            }
        }
    }
}
