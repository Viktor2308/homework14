package pro.sky.homework14.transport;

import java.util.Date;

public class Car {
    public class Key {
        private final boolean removeStart;
        private final boolean keylessAccess;

        @Override
        public String toString() {
            return "In car - " + Car.this.brand + " " + Car.this.model + " installed " +
                    " Remove Start - " + removeStart +
                    ", keylessAccess - " + keylessAccess +
                    '.';
        }

        public Key(boolean removeStart, boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
            this.removeStart = removeStart;
        }



        public boolean isRemoveStart() {
            return removeStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int countSeats;
    private boolean summerTires;
    private Key key;

    private static final String DEFAULT_VALUE = "default value";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_COUNT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int countSeats, boolean summerTires,
               boolean keylessAccess, boolean removeStart) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == "" || model == null || model.isBlank() || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
        setColor(color);

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country == "" || country == null || country.isBlank() || country.isEmpty()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }

        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "no information";
        } else {
            this.bodyType = bodyType;
        }

        setRegistrationNumber(registrationNumber);

        if (countSeats <= 0) {
            this.countSeats = DEFAULT_COUNT_SEATS;
        } else {
            this.countSeats = countSeats;
        }

        setSummerTires(summerTires);
        setKey(keylessAccess, removeStart);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public boolean getIsSummerTires() {
        return summerTires;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "no information";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void setKey(boolean keylessAccess, boolean removeStar) {
        this.key = new Key(keylessAccess, removeStar);
    }

    public void tireChange(int month) {
        if (month >= 1 && month <= 3 || month >= 10 && month <= 12) {
            System.out.println("In " + brand + " " + model + " - installed winter tires!");
            summerTires = false;
        } else {
            System.out.println("In " + brand + " " + model + " - installed summer tires!");
            summerTires = true;
        }
    }

    @Override
    public String toString() {
        return "Car: " + brand +
                ", model - " + model +
                ", country - " + country +
                ", color - " + color +
                ", engine - " + engineVolume +
                ", year - " + year +
                ", transmission - " + transmission +
                ", body type - " + bodyType +
                ", registration number - " + registrationNumber +
                ", count seats - " + countSeats +
                ", summer tires - " + summerTires +
                ", remove control: " + key;

    }
}
