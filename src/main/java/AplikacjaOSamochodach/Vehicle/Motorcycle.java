package AplikacjaOSamochodach.Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String registrationCode, GasType gasType) {
        super(registrationCode, VehicleType.MOTORCYCLE, gasType);
    }
}
