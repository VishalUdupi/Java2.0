package ParkingLotLLD;

public class Ticket {
    String ticketStatus;

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Ticket(){
        this.ticketStatus = "EXITED";
    }

    boolean isTicketActive(){
        if (this.ticketStatus.equals("ACTIVE")){
            return true;
        }
        return false;
    }

}
