package pro.sky.homework14;

import pro.sky.homework14.driver.BusDriver;
import pro.sky.homework14.driver.CarDriver;
import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.driver.TruckDriver;
import pro.sky.homework14.transport.Bus;
import pro.sky.homework14.transport.Car;
import pro.sky.homework14.transport.Transport;
import pro.sky.homework14.transport.Truck;


public class Main {
    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver("Ivan Ivanov", true, 10);
        TruckDriver truckDriver = new TruckDriver("Petr Petrov", true, 6);
        BusDriver busDriver = new BusDriver("Mixail Mihailov", true, 8);

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

        carLadaGranta.printType();
        truckKamaz.printType();
        busIkarus.printType();
        truckMan.printType();

//        carMercedes.participateInRace(carDriver);
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
        driver.startDrive();
        driver.refuelTransport();
        driver.stopDrive();
    }

}
