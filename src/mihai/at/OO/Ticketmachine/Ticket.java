package mihai.at.OO.Ticketmachine;
import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime inTime;
    private LocalDateTime outTime;

    public Ticket(int id) {
        this.id = id;
        this.inTime = java.time.LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

}
