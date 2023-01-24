package mihai.at.OO.Ticketmachine;

public class MainTicketMaschine {
    public static void main(String[] args) {
        Scanner s1 = new Scanner();
        Printer p1 = new Printer();

        TicketMachine m1 = new TicketMachine(s1, p1);

        Ticket t1 = m1.getTicket();

        m1.insertTicket(t1);
        m1.insertMoney(20);
        m1.insertMoney(9.2);
    }
}
