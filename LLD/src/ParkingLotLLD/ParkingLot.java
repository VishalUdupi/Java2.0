package ParkingLotLLD;

public class ParkingLot {

    ParkingSpot parkingSpot;
    Car car;
    Ticket ticket;

    void parkVehicle(){
        car = new Car();
        ticket = new Ticket();
        car.setTicket(ticket);
        if(!(ticket.isTicketActive())) ticket.setTicketStatus("ACTIVE");
        if (parkingSpot.isParkingSpotEmpty()) parkingSpot.setParkingSpotStatus("OCCUPIED");
    }

    void exitVehicle(){
        ticket.setTicketStatus("EXITED");
        parkingSpot.setParkingSpotStatus("EMPTY");
    }

}
