class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    public synchronized boolean bookTicket(int numTickets) {
        if (numTickets > 0 && numTickets <= availableTickets) {
            System.out.println(Thread.currentThread().getName() + " is booking " + numTickets + " ticket(s).");
            availableTickets -= numTickets;
            System.out.println(Thread.currentThread().getName() + " successfully booked " + numTickets + " ticket(s).");
            System.out.println("Available tickets: " + availableTickets);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to book tickets.");
            return false;
        }
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numTickets;

    public BookingThread(TicketBookingSystem bookingSystem, int numTickets) {
        this.bookingSystem = bookingSystem;
        this.numTickets = numTickets;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(numTickets);
    }
}

public class Main3 {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(5);

        BookingThread thread1 = new BookingThread(bookingSystem, 2);
        BookingThread thread2 = new BookingThread(bookingSystem, 3);
        BookingThread thread3 = new BookingThread(bookingSystem, 4);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
