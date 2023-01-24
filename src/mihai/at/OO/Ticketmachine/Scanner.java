package mihai.at.OO.Ticketmachine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private List<Ticket> tickets;

    public Scanner() {
        this.tickets = new ArrayList<>();
    }

    public void scanTicket(Ticket ticket) {
        tickets.add(ticket.getId(), ticket);
        ticket.setOutTime(LocalDateTime.of(2023,1,26,12,0,0,0));
        System.out.println(ticket.getInTime() + "  " + ticket.getOutTime());
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

}
