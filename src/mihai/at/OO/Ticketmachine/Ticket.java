package mihai.at.OO.Ticketmachine;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime inTime;
    private LocalDateTime outTime;

    public Ticket(int id) {
        this.id = id;
        this.inTime = java.time.LocalDateTime.now();
        this.outTime = null;
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

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }
}
