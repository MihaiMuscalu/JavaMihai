package JavaBasics;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int Balance = 0;
        boolean end = false;


        while (!end)
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Einzahlen");
        System.out.println("2. Abnehmen");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten:");
                Balance += scanner.nextInt();
                System.out.println("Sie haben " + Balance + " Euro eingezahlt!");
                break;
            case 2:
                System.out.println("Wieviel würden sie gerne abnehmen?");
                Balance -= scanner.nextInt();
                System.out.println("Sie haben " + Balance + " Euro abgehoben!");
                break;
            case 3:
                System.out.println("Der Kontostand beträgt: " + Balance + " Euro");
                break;
            case 4:
                System.out.println("TicketMachine ist stopping!");
                end = true;
                break;
            }
        }
    }
}
