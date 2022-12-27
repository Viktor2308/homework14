package pro.sky.homework14;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == "" || brand == null) {
            this.brand = "unknown brand";
        } else {
            this.brand = brand;
        }
        if (model == "" || model == null) {
            this.model = "unknown model";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == "" || color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == "" || country == null) {
            this.country = "unknown country";
        } else {
            this.country = country;
        }

    }

    @Override
    public String toString() {
        return "Car: " + brand +
                ", model - " + model +
                ", country - " + country +
                ", color - " + color +
                ", engine - " + engineVolume + 'l' +
                ", year - " + year + '.';
    }
}
