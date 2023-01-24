package mihai.at.OO.Ticketmachine;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private List<Ticket> tickets;

    public Printer() {
        this.tickets = new ArrayList<>();
    }

    public Ticket printTicket() {
        Ticket ticket = new Ticket(tickets.size());
        tickets.add(ticket);
        System.out.println("Ticket printed on: " + ticket.getInTime());
        return ticket;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
