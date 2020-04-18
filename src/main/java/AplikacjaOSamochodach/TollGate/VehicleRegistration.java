package AplikacjaOSamochodach.TollGate;

import AplikacjaOSamochodach.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistration {

    Map<String, Entering> register= new HashMap<>();

    public boolean markEnrtance (Vehicle vehicle){
        Entering entering = new Entering(LocalDateTime.now(), vehicle);

        if(checkVehicleInside(vehicle)){
            return false;
        }

        register.put(vehicle.getRegistrationCode(), entering);

        return true;
    }

    public Entering leftParking(Vehicle vehicle){
        Entering entering = register.remove(vehicle.getRegistrationCode());
        return entering;
    }

    private boolean checkVehicleInside(Vehicle vehicle) {
        return register.containsKey(vehicle.getRegistrationCode());
    }

}
