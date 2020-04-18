package AplikacjaOSamochodach.Vehicle;

public abstract class Vehicle {

    private String registrationCode;
    private VehicleType vehicleType;
    private GasType gasType;

    public Vehicle(String registrationCode, VehicleType vehicleType, GasType gasType) {
        this.registrationCode = registrationCode;
        this.vehicleType = vehicleType;
        this.gasType = gasType;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public GasType getGasType() {
        return gasType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return registrationCode.equals(vehicle.registrationCode);
    }

    @Override
    public int hashCode() {
        return registrationCode.hashCode();
    }
}
