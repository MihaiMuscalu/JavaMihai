package mihai.at.OO.Accounts;

import java.util.SortedMap;

public class SavingsAccount extends BaseAccount {

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0)
        {
            return super.withdraw(amount);
        }else
        {
            System.out.println("Keine Deckung");
            return 0;
        }
    }
}
