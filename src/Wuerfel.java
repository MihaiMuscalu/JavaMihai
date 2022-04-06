import java.util.Scanner;

public class Wuerfel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        boolean end = false;

        System.out.println("1. Start Game");
        System.out.println("2. End Game");
        int selection = scanner.nextInt();
        int tries = 6;

        while (!end)
        {

            switch (selection)
            {
                case 1:
                    int diceM = (int) (Math.random() *6) +1;
                    int diceP = (int) (Math.random() *6) +1;

                    System.out.printf("You rolled %d!%n", diceP);
                    System.out.printf("Computer rolled %d!%n", diceM);

                    if(diceP > diceM) {System.out.println("You won!"); tries = 6;}
                    if(diceM >= diceP)
                    {
                        System.out.println("You lost!");

                        if (tries > 1) {System.out.printf("%d tries left %n",tries); tries -= 1;}
                        if (tries == 1){System.out.printf("%d try left%n",tries); tries -= 1;}
                        if(tries == 0) System.out.println("Game over!");

                        System.out.println("Continue?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        int wait = scanner.nextInt();

                        if(wait == 1) {break;}
                        if(wait == 2){end = true;}

                        if (tries > 1) {System.out.printf("%d tries left %n",tries); tries -= 1;}
                        if (tries == 1){System.out.printf("%d try left%n",tries); tries -= 1;}
                        if(tries == 0) System.out.println("Game over!");

                    }

                    System.out.println("Play again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    int play = scanner.nextInt();

                    if(play == 1) {selection = 1;}
                    if(play == 2){end = true;}

                    break;
                case 2:

                    end = true;
                    break;
            }

        }
    }
}
