package AplikacjaOSamochodach.TollGate;

import AplikacjaOSamochodach.Report;
import AplikacjaOSamochodach.Vehicle.Vehicle;

public class TollGate implements GateInOut {

    private Report report;
    private VehicleRegistration vehicleRegistration;
    private TollCalculator tollCalculator;

    public TollGate(VehicleRegistration vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
        report = new Report();
    }

    @Override
    public void In(Vehicle vehicle) {

        boolean ifEnetred = vehicleRegistration.markEnrtance(vehicle);
        if (!ifEnetred){
            callHelp(vehicle);
        } else {
            System.out.println("Vehicle with: "
                    + vehicle.getRegistrationCode() + " entered the parking lot.");
        }

    }

    private void callHelp(Vehicle vehicle) {
        System.out.println("HELP!" + vehicle.getRegistrationCode());
    }

    public void setTollCalculator(TollCalculator tollCalculator) {
        this.tollCalculator = tollCalculator;
    }

    @Override
    public void Out(Vehicle vehicle, double amountPaid) {
        Entering entering = vehicleRegistration.leftParking(vehicle);
        double parkingPrice = tollCalculator.calculate(entering);
        report.sumUpVehicles(vehicle.getVehicleType());
        report.sumUpCash(amountPaid);
        report.sumUpExpense(parkingPrice);
        if(parkingPrice>amountPaid){
            callHelp(vehicle);
        }
        System.out.println(entering.getVehicle().getRegistrationCode() + " is leaving the parking lot. "
                + amountPaid + "$ has been collected and "
                + parkingPrice + "$ needs to be collected.");
    }

    public TollGate(TollCalculator tollCalculator) {
        this.tollCalculator = tollCalculator;
    }

    public Report prepareReport(){
        return report;
    }
}
