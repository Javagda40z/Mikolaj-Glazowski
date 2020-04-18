package AplikacjaOSamochodach.Vehicle;

public class Truck extends Vehicle {
    public Truck(String registrationCode, GasType gasType) {
        super(registrationCode, VehicleType.TRUCK, gasType);
    }
}
