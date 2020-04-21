package AplikacjaOSamochodach;

import AplikacjaOSamochodach.TollGate.TollCalculator;
import AplikacjaOSamochodach.TollGate.TollGate;
import AplikacjaOSamochodach.TollGate.VehicleRegistration;
import AplikacjaOSamochodach.Vehicle.*;



//Sprawdzanie czy jest miejsce
//SPrawdzanie czy rejestracja jest poprawna - statyczna metoda
//Stworz nowy kalkulator oplat
//Nie pozwalac na podmiane kalkulatora jezeli ktos jest na parkingu
//Stosowac stary kalkulator do pojazdow ktore wjechaly przed podmiana
//Zmienna oplata w zaleznosci od godziny
//Zmienna oplata w zaleznosci od paliwa
//Wydawanie reszty
//Wzywanie policji?
//Zrobienie lepszego raportu - np wysylanie maila albo generowanie do pliku
//Co zostalo na parkingu?

public class Aplication {
    public static void main(String[] args) {
        VehicleRegistration vehicleRegistration = new VehicleRegistration();
        TollGate tollGate = new TollGate(vehicleRegistration);
        tollGate.setTollCalculator(new TollCalculator());
        Motorcycle motorcycle1 = new Motorcycle("GD12345", GasType.COMBUSTION);
        PassengersCar passengersCar1 = new PassengersCar("GD54321", GasType.COMBUSTION);
        Bus bus1 = new Bus("DG32154", GasType.COMBUSTION);
        Truck truck1 = new Truck("DG12345", GasType.COMBUSTION);

        tollGate.In(motorcycle1);
        tollGate.In(passengersCar1);
        tollGate.In(bus1);
        tollGate.In(truck1);

        tollGate.Out(passengersCar1, 7);
        tollGate.Out(bus1,48);

        tollGate.In(passengersCar1);

        Report report = tollGate.prepareReport();
        report.display();


    }
}
