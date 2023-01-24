package mihai.at.OO.Ticketmachine;

import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private List<Ticket> tickets = new ArrayList<>();

    public Scanner() {
    }

    public void scanTicket(Ticket ticket) {
        tickets.add(ticket.getId(), ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

}
