package pro.sky.homework14.transport;

import pro.sky.homework14.driver.CarDriver;

public class Car extends Transport<CarDriver> {

    public Car(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

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
