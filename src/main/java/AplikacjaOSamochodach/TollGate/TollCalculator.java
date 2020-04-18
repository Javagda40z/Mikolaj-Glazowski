package AplikacjaOSamochodach.TollGate;

import AplikacjaOSamochodach.Util.RandomAmountOfHours;
import AplikacjaOSamochodach.Vehicle.GasType;
import AplikacjaOSamochodach.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TollCalculator {

    public static int tollAmount = 2;

    public double calculate(Entering entering){
        LocalDateTime entranceDate = entering.getEntranceDateTime();
        LocalDateTime leavingDate = LocalDateTime.now();
        Vehicle vehicle = entering.getVehicle();
        long parkingTime = ChronoUnit.HOURS.between(entranceDate,leavingDate);

        //dla testu
        parkingTime = parkingTime + RandomAmountOfHours.randomBetween(0,48);

        //
        if (parkingTime<1){
            return 0;
        }
        double multiplier = calculateMultiplier(vehicle);

        return tollAmount*parkingTime*multiplier;


    }

    private double calculateMultiplier(Vehicle vehicle) {
        double multiplier = 1;
        switch (vehicle.getVehicleType()){
            case PASSENGERS:
                multiplier = multiplier*1;
                break;
            case MOTORCYCLE:
                multiplier = multiplier*0.5;
                break;
            case TRUCK:
                multiplier = multiplier*2;
                break;
            default:
                break;
        }
        switch (vehicle.getGasType()){
            case ELECTRIC:
                multiplier = multiplier *0;
                break;
            case COMBUSTION:
                multiplier = multiplier *1.5;
                break;
            case LPG:
                multiplier = multiplier*1;
                break;
            default:
                break;
        }
        return multiplier;

    }

}
