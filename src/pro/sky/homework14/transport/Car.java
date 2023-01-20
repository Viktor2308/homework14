package pro.sky.homework14.transport;

import pro.sky.homework14.driver.CarDriver;
import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.mechanic.Mechanic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static pro.sky.homework14.driver.Driver.getDriversList;
import static pro.sky.homework14.mechanic.Mechanic.getMechanicSet;

public class Car extends Transport<CarDriver> {
    //    private static final int COUNT_MECHANIC_SERVICE = 2;
//    private final List<Mechanic> serviceTeam = new ArrayList<>(COUNT_MECHANIC_SERVICE);
    private CarBodyType carBodyType;


    public Car(String mark, String model, double engineVolume, CarBodyType carBodyType) {
        super(mark, model, engineVolume);
        setCarBodyType(carBodyType);
    }

    public enum CarBodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн"),
        NO_INFORMATION("No body type information");

        private String bodyName;

        CarBodyType(String bodyName) {
            this.bodyName = bodyName;
        }

        public String getBodyName() {
            return bodyName;
        }

        @Override
        public String toString() {
            return "Body type - " + bodyName;
        }
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        if (carBodyType == null) {
            this.carBodyType = CarBodyType.valueOf(DEFAULT_VALUE);
        } else {
            this.carBodyType = carBodyType;
        }
    }

//    public List<Mechanic> getServiceTeam() {
//        return serviceTeam;
//    }

    @Override
    public void participateInRace(CarDriver driver) {
        if (driver.isDriveLicense()) {
            System.out.println("Driver " + driver.getName() + " is driving car " +
                    this.toString() + " and will be participating in the race.");
        } else {
            System.out.println(driver.getName() + " don't drive, because don't have drive licence!");
        }
    }

    @Override
    public void startMovement() {
        System.out.print("Car ");
        super.startMovement();
    }

    @Override
    public void endMovement() {
        System.out.print("Car ");
        super.endMovement();
    }

    @Override
    public void pitStop() {
        System.out.print("Car ");
        super.pitStop();
    }

    @Override
    public void bestLapTime() {
        System.out.print("Car ");
        super.bestLapTime();
    }

    @Override
    public void maxSpeed() {
        System.out.print("Car ");
        super.maxSpeed();
    }

    @Override
    public void printType() {
        System.out.println("Car " + getMark() + ' ' + getModel() + ' ' + getCarBodyType());
    }

    @Override
    public void doDiagnostic() {
        System.out.println(getMark() + ' ' + getModel() + " - car diagnostics done.");
    }

    @Override
    public void infoAboutTeam() {
        System.out.println("Car " + getMark() + getModel() + " driving " + getDriver().getName() + ", service: " + getTransportMap().get(this));
    }

    @Override
    public void createServiceTeam() {
        if (getTransportMap().get(this) != null) {
            System.out.println("Mechanic " + getMark() + " " + getModel() + " " + getTransportMap().get(this));
            return;
        } else {
            for (Mechanic mechanic : getMechanicSet()) {
                if (mechanic.isFree() && mechanic.iCanServiceThisCar(Car.this)) {
                    getTransportMap().put(this, mechanic);
                    mechanic.setFree(false);
                    System.out.println("New mechanic " + getMark() + " " + getModel() + " " + getTransportMap().get(this));
                    return;
                }
            }
        }
        System.out.println("Service team not ready.");
//        if (serviceTeam.isEmpty()) {
//            for (Mechanic mechanic : mechanicList) {
//                if (mechanic.isFree() && mechanic.iCanServiceThisCar(Car.this) && serviceTeam.size() < COUNT_MECHANIC_SERVICE) {
//                    mechanic.setFree(false);
//                    serviceTeam.add(mechanic);
//                }
//            }
//        }
//        if (serviceTeam.size() == COUNT_MECHANIC_SERVICE) {
//            System.out.println("Car " + getMark() + " " + getModel() + " service team ready " + serviceTeam);
//        } else {
//            System.out.println("Service team not ready.");
//        }

    }


    @Override
    public boolean setDriverForTransport() {
        if (this.getDriver() != null) {
            System.out.println("Driver: " + getDriver());
            return false;
        } else {
            for (Driver driver1 : getDriversList()) {
                if (driver1.isFree() && driver1.getTypeLicense().equals(Driver.TypeLicense.B)) {
                    setDriver(driver1);
                    driver1.setFree(false);
                    return true;
                }
            }
        }
        System.out.println("No driver fo " + getMark() + " car");
        return false;
    }

    @Override
    public boolean carryOutMaintenance() {
//        if (serviceTeam.isEmpty() || serviceTeam.size() != COUNT_MECHANIC_SERVICE) {
//            System.out.println("No team for carry out maintenance.");
//            return false;
//        } else {
//            System.out.println("Car " + getMark() + " to get carry out maintenance");
        return true;
//        }

    }

    @Override
    public boolean fixTheTransport() {
//        if (serviceTeam.isEmpty() || serviceTeam.size() != COUNT_MECHANIC_SERVICE) {
//            System.out.println("No team for fix the " + getMark() + " .");
//            return false;
//        } else {
//            System.out.println("Finish fix the car " + getMark());
        return true;
//        }
    }
}

//    public class Key {
//        private final boolean removeStart;
//        private final boolean keylessAccess;
//
//        @Override
//        public String toString() {
//            return "In car - " + Car.this.getMark() + " " + Car.this.getModel()+ " installed " +
//                    " Remove Start - " + removeStart +
//                    ", keylessAccess - " + keylessAccess +
//                    '.';
//        }
//
//        public Key(boolean removeStart, boolean keylessAccess) {
//            this.keylessAccess = keylessAccess;
//            this.removeStart = removeStart;
//        }
//
//
//        public boolean isRemoveStart() {
//            return removeStart;
//        }
//
//        public boolean isKeylessAccess() {
//            return keylessAccess;
//        }
//    }
//
//
//
//    private double engineVolume;
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final int countSeats;
//    private boolean summerTires;
//    private Key key;
//
//
//    private static final int DEFAULT_COUNT_SEATS = 5;
//
//    public Car(String mark, String model, int year, String country, String bodyColor, int maxSpeed,
//               String transmission, String bodyType, String registrationNumber, int countSeats, boolean summerTires,
//               boolean keylessAccess, boolean removeStart) {
//        super(mark, model, year, country, bodyColor, maxSpeed, engineVolume);
//
//
//        setTransmission(transmission);
//
//        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
//            this.bodyType = "no information";
//        } else {
//            this.bodyType = bodyType;
//        }
//
//        setRegistrationNumber(registrationNumber);
//
//        if (countSeats <= 0) {
//            this.countSeats = DEFAULT_COUNT_SEATS;
//        } else {
//            this.countSeats = countSeats;
//        }
//
//        setSummerTires(summerTires);
//        setKey(keylessAccess, removeStart);
//    }
//
//
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getCountSeats() {
//        return countSeats;
//    }
//
//    public boolean getIsSummerTires() {
//        return summerTires;
//    }
//
//
//
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isBlank()) {
//            this.transmission = DEFAULT_VALUE;
//        } else {
//            this.transmission = transmission;
//        }
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber == null || registrationNumber.isBlank()) {
//            this.registrationNumber = "no information";
//        } else {
//            this.registrationNumber = registrationNumber;
//        }
//    }
//
//    public void setSummerTires(boolean summerTires) {
//        this.summerTires = summerTires;
//    }
//
//    public void setKey(boolean keylessAccess, boolean removeStar) {
//        this.key = new Key(keylessAccess, removeStar);
//    }
//
//    public void tireChange(int month) {
//        if (month >= 1 && month <= 3 || month >= 10 && month <= 12) {
//            System.out.println("In " + getMark() + " " + getModel() + " - installed winter tires!");
//            summerTires = false;
//        } else {
//            System.out.println("In " + getMark() + " " + getModel() + " - installed summer tires!");
//            summerTires = true;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() +
//                ", engine - " + engineVolume +
//                ", transmission - " + transmission +
//                ", body type - " + bodyType +
//                ", registration number - " + registrationNumber +
//                ", count seats - " + countSeats +
//                ", summer tires - " + summerTires +
//                ", remove control: " + key;
//
//    }
//}
