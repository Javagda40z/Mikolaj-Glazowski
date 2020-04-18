package AplikacjaOSamochodach;

import AplikacjaOSamochodach.Vehicle.VehicleType;

import java.util.EnumMap;
import java.util.Map;


public class Report {

    private double dailyIncome;
    private double expense;
    private Map<VehicleType, Integer> amountOfVehicles = new EnumMap<>(VehicleType.class);

    public double getDailyIncome() {
        return dailyIncome;
    }

    public Map<VehicleType, Integer> getAmountOfVehicles() {
        return amountOfVehicles;
    }

    public double getExpense() {
        return expense;
    }

    public void sumUpCash(double cash){
        dailyIncome += cash;
    }

    public void sumUpExpense(double expense){
        this.expense += expense;
    }

    public void sumUpVehicles (VehicleType vehicleType){
        if (amountOfVehicles.containsKey(vehicleType)){
            Integer amount = amountOfVehicles.get(vehicleType);
            amount++;
            amountOfVehicles.put(vehicleType,amount);
        } else{
            amountOfVehicles.put(vehicleType, 1);
        }
    }

    public void display(){
        System.out.println("Income: " + dailyIncome);
        System.out.println("Expenses: " + expense);
        for (VehicleType vehicleType:amountOfVehicles.keySet()) {
            System.out.println("Vehicle type: " + vehicleType.name()
                    + ", amount: " +amountOfVehicles.get(vehicleType));
        }
    }


}
