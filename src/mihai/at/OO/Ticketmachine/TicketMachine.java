package mihai.at.OO.Ticketmachine;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TicketMachine {
    private Scanner scanner;
    private Printer printer;
    public List<Ticket> tickets = new ArrayList<>();
    private double ticketPrice = 0;

    public TicketMachine(Scanner scanner, Printer printer) {
        this.scanner = scanner;
        this.printer = printer;
    }

    public Ticket getTicket() {
        Ticket ticket = this.printer.printTicket();
        this.tickets = this.printer.getTickets();
        return ticket;
    }

    public double getPrice(Ticket ticket) {
        double Price = ChronoUnit.MINUTES.between(ticket.getInTime(), ticket.getOutTime()) * 0.01;
        return Price;
    }

    public void insertTicket(Ticket ticket) {
        scanner.scanTicket(ticket);
        System.out.println("You need to pay: " + getPrice(ticket) + " Euros");
        ticketPrice = getPrice(ticket);
    }

    public void insertMoney(double money) {
        ticketPrice -= money;
        if(ticketPrice>0) {
            System.out.println("There remains " + (double)Math.round(ticketPrice * 100)/100 + " Euros to pay");
        }
        if(ticketPrice<0) {
            System.out.println("You rest is " + (double)Math.round(ticketPrice * -100)/100 + " Euros");
        }
    }

    public Scanner getScanner() {
        return scanner;
    }

    public Printer getPrinter() {
        return printer;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
