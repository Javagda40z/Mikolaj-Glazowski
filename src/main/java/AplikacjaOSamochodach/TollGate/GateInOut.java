package AplikacjaOSamochodach.TollGate;

import AplikacjaOSamochodach.Vehicle.Vehicle;

public interface GateInOut {

    void In (Vehicle vehicle);

    void Out (Vehicle vehicle, double amountPaid);

}
