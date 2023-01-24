package mihai.at.OO.Ticketmachine;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private List<Ticket> tickets = new ArrayList<>();

    public void makeTicket(){
        Ticket ticket = new Ticket(tickets.size());
        tickets.add(ticket);
    }
}
