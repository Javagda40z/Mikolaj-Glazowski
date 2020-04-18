package AplikacjaOSamochodach.TollGate;

import AplikacjaOSamochodach.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Entering {

    private final LocalDateTime entranceDateTime;
    private final Vehicle vehicle;

    public Entering(LocalDateTime entranceDateTime, Vehicle vehicle) {
        this.entranceDateTime = entranceDateTime;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntranceDateTime() {
        return entranceDateTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
