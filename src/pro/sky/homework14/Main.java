package pro.sky.homework14;

import pro.sky.homework14.transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(
                "Lada",
                "Granta",
                1.7,
                "Yellow",
                2015,
                "Russia",
                "automate",
                "sedan",
                "",
                5,
                false,
                false,
                false);
        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Black",
                2020,
                "Germany",
                "robot",
                "universal",
                "",
                5,
                true,
                false,
                false);
        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "Black",
                2021,
                "Germany",
                "",
                "cope",
                "",
                2,
                true,
                true,
                true);
        Car kiaSportage = new Car(
                "KIA",
                "Sportage 4-th generation",
                2.4,
                "Rad",
                2018,
                "Sous Korea",
                "",
                "universal",
                "",
                5,
                true,
                false,
                false);
        Car huendaiAvante = new Car(
                "Huendai",
                "Avante",
                1.6,
                "Orange",
                2016,
                "Sous Korea",
                "",
                "",
                "",
                5,
                true,
                true,
                false);


        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(huendaiAvante);
        System.out.println();
        kiaSportage.tireChange(11);
        ladaGranta.tireChange(6);
        System.out.println();


//        Car ladaGranta = new Car();
//        ladaGranta.brand = "Lada";
//        ladaGranta.model = "Granta";
//        ladaGranta.engineVolume = 1.7;
//        ladaGranta.color = "Yellow";
//        ladaGranta.year = 2015;
//        ladaGranta.country = "Russia";
//
//        Car audiA8 = new Car();
//        audiA8.brand = "Audi";
//        audiA8.model = "A8 50 L TDI quattro";
//        audiA8.engineVolume = 3.0;
//        audiA8.color = "Black";
//        audiA8.year = 2020;
//        audiA8.country = "Germany";
//
//        Car bmwZ8 = new Car();
//        bmwZ8.brand = "BMW";
//        bmwZ8.model = "Z8";
//        bmwZ8.engineVolume = 3.0;
//        bmwZ8.color = "Black";
//        bmwZ8.year = 2021;
//        bmwZ8.country = "Germany";
//
//        Car kiaSportage = new Car();
//        kiaSportage.brand = "KIA";
//        kiaSportage.model = "Sportage 4-th generation";
//        kiaSportage.engineVolume = 2.4;
//        kiaSportage.color = "Rad";
//        kiaSportage.year = 2018;
//        kiaSportage.country = "Sous Korea";
//
//        Car huendaiAvante = new Car();
//        huendaiAvante.brand = "Huendai";
//        huendaiAvante.model = "Avante";
//        huendaiAvante.engineVolume = 1.6;
//        huendaiAvante.color = "Orange";
//        huendaiAvante.year = 2016;
//        huendaiAvante.country = "Sous Korea";


    }
}
