package ParkingLotLLD;

abstract class ParkingSpot {
    String parkingSpotStatus;

    public void setParkingSpotStatus(String parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpot(){
        this.parkingSpotStatus = "EMPTY";
    }

    boolean isParkingSpotEmpty(){
        if (parkingSpotStatus.equals("EMPTY")){
            return true;
        }
        return false;
    }



}
