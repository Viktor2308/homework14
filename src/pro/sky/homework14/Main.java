package pro.sky.homework14;

import pro.sky.homework14.driver.*;
import pro.sky.homework14.mechanic.Mechanic;
import pro.sky.homework14.transport.Bus;
import pro.sky.homework14.transport.Car;
import pro.sky.homework14.transport.Transport;
import pro.sky.homework14.transport.Truck;

import static pro.sky.homework14.driver.Driver.getDriversList;
import static pro.sky.homework14.mechanic.Mechanic.getMechanicList;
import static pro.sky.homework14.transport.Transport.getTransportList;


public class Main {
    public static void main(String[] args) {

        CarDriver carDriver1 = new CarDriver("Ivan 1 Ivanov", true, 10, Driver.TypeLicense.B);
        CarDriver carDriver2 = new CarDriver("Ivan 2 Ivanov", true, 10, Driver.TypeLicense.B);
        CarDriver carDriver3 = new CarDriver("Ivan 3 Ivanov", true, 10, Driver.TypeLicense.B);
        CarDriver carDriver4 = new CarDriver("Ivan 4 Ivanov", true, 10, Driver.TypeLicense.B);
        TruckDriver truckDriver1 = new TruckDriver("Petr 1 Petrov", true, 6, Driver.TypeLicense.C);
        TruckDriver truckDriver2 = new TruckDriver("Petr 2 Petrov", true, 6, Driver.TypeLicense.C);
        TruckDriver truckDriver3 = new TruckDriver("Petr 3 Petrov", true, 6, Driver.TypeLicense.C);
        TruckDriver truckDriver4 = new TruckDriver("Petr 4 Petrov", true, 6, Driver.TypeLicense.C);
        BusDriver busDriver1 = new BusDriver("Mixail 1 Mihailov", true, 8, Driver.TypeLicense.D);
        BusDriver busDriver2 = new BusDriver("Mixail 2 Mihailov", true, 8, Driver.TypeLicense.D);
        BusDriver busDriver3 = new BusDriver("Mixail 3 Mihailov", true, 8, Driver.TypeLicense.D);
        BusDriver busDriver4 = new BusDriver("Mixail 4 Mihailov", true, 8, Driver.TypeLicense.D);


        Car carLadaGranta = new Car("Lada", "Granta", 1.7, Car.CarBodyType.SEDAN);
        Car carAudiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.CarBodyType.SEDAN);
        Car carBmwX5 = new Car("BMW", "X5", 3.0, Car.CarBodyType.UNIVERSAL);
        Car carMercedes = new Car("Mercedes", "A250", 2.5, Car.CarBodyType.NO_INFORMATION);

        Truck truckKamaz = new Truck("Kamaz", "3116", 9, Truck.LoadCapacity.N1);
        Truck truckScania = new Truck("Scania", "G18", 8.5, Truck.LoadCapacity.N2);
        Truck truckVolvo = new Truck("Volvo", "Volvo Truck 8000", 8.2, Truck.LoadCapacity.N3);
        Truck truckMan = new Truck("Man", "Man 666", 9.9, Truck.LoadCapacity.NO_INFORMATION);

        Bus busVolvo = new Bus("Volvo", "Volvo 9500", 7.7, Bus.PeopleCapacity.LARGE);
        Bus busScania = new Bus("Scania", "Scania CRUIZE", 8, Bus.PeopleCapacity.ESPECIALLY_LARGE);
        Bus busHyundai = new Bus("Hyundai", "Hyundai Universe", 8.5, Bus.PeopleCapacity.MEDIUM);
        Bus busIkarus = new Bus("Ikarus", "Ikarus 7000", 7, Bus.PeopleCapacity.NO_INFORMATION);

        createMechanics();

        for (Transport transport : getTransportList()) {
            transport.createServiceTeam(getMechanicList());
            transport.setDriverForTransport(getDriversList());
            transport.carryOutMaintenance();
            transport.fixTheTransport();
        }

//        for (Transport transport : getTransportList()) {
//            transport.setDriverForTransport(driverQueue);
//            transport.carryOutMaintenance(mechanicQueue);
//            transport.fixTheTransport(mechanicQueue);
//        }


//        System.out.println(getMechanicList());
//        System.out.println(getTransportList());
//        System.out.println(getDriversList());


//        diagnostic(carAudiA8, truckKamaz);
//        carMercedes.participateInRace(carDriver);
//            diagnostic(busHyundai);

//        carLadaGranta.printType();
//        truckKamaz.printType();
//        busIkarus.printType();
//        truckMan.printType();

//
//        truckKamaz.participateInRace(truckDriver);
//
//        busVolvo.participateInRace(busDriver);
//
//        transportAllMethod(busIkarus);
//        driverAllMethod(truckDriver);
//
//        busDriver.setDriveLicense(false);
//        busVolvo.participateInRace(busDriver);
//        driverAllMethod(busDriver);


    }

    public static void transportAllMethod(Transport<?> transport) {

        transport.startMovement();
        transport.pitStop();
        transport.endMovement();
        transport.bestLapTime();
        transport.maxSpeed();
    }

    public static void driverAllMethod(Driver driver) {
        driver.toString();
        driver.startDrive();
        driver.refuelTransport();
        driver.stopDrive();
    }

    public static void diagnostic(Transport... transports) {
        for (Transport transport : transports) {
            transport.doDiagnostic();
        }
    }

    static void createMechanics() {
        for (int i = 0; i < 10; i++) {
            Mechanic mechanic = new Mechanic(
                    "Mechanic" + i,
                    "Servise compani #" + i,
                    Driver.TypeLicense.B);
            mechanic.setTypeTransportMechanic(Driver.TypeLicense.C);

        }
        for (int i = 0; i < 15; i++) {
            Mechanic mechanic = new Mechanic(
                    "Mechanic" + i,
                    "Servise compani #" + i,
                    Driver.TypeLicense.C);
            mechanic.setTypeTransportMechanic(Driver.TypeLicense.D);

        }
        for (int i = 0; i < 15; i++) {
            Mechanic mechanic = new Mechanic(
                    "Mechanic" + i,
                    "Servise compani #" + i,
                    Driver.TypeLicense.D);
            mechanic.setTypeTransportMechanic(Driver.TypeLicense.B);

        }

    }

}
