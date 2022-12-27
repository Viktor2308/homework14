package pro.sky.homework14.transport;

import java.util.Date;

public class Car {
    public class Key{
        private final boolean removeStart;
        private final boolean keylessAccess;

        @Override
        public String toString() {
            return "In car - " + Car.this.brand + " " + Car.this.model + " installed " +
                    " Remove Start - " + removeStart +
                    ", keylessAccess - " + keylessAccess +
                    '.';
        }

        public Key(boolean removeStart, boolean keylessAccess){
            this.keylessAccess = keylessAccess;
            this.removeStart = removeStart;

        };

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


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int countSeats, boolean summerTires) {
        if (brand == "" || brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "no information";
        } else {
            this.brand = brand;
        }
        if (model == "" || model == null || model.isBlank() || model.isEmpty()) {
            this.model = "no information";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == "" || color == null || color.isEmpty() || color.isBlank()) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == "" || country == null || country.isBlank() || country.isEmpty()) {
            this.country = "no information";
        } else {
            this.country = country;
        }
        if (transmission != "automate" || transmission != "robot" || transmission != "mechanics") {
            this.transmission = "no information";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "no information";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == "" || registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "no information";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (countSeats <= 0) {
            this.countSeats = 5;
        } else {
            this.countSeats = countSeats;
        }
        this.summerTires = summerTires;
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

    public String transmission() {
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

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
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
                ", summer tires - " + summerTires + ".";

    }
}
