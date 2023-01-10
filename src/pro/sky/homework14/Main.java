package pro.sky.homework14;

import pro.sky.homework14.transport.Bus;
import pro.sky.homework14.transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(
                "Lada",
                "Granta",
                2015,
                "Russia",
                "Yellow",
                160,
                1.7,
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
                2020,
                "Germany",
                "Black",
                240,
                3.0,
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
                2021,
                "Germany",
                "Black",
                260,
                3.0,
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
                2018,
                "Sous Korea",
                "Rad",
                0,
                2.4,
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
                2016,
                "Sous Korea",
                "Orange",
                0,
                1.6,
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

        Bus busVolvo = new Bus(
                "Volvo",
                "Volvo 9500",
                2011,
                "Sweden",
                "silver",
                120
        );
        Bus busScania = new Bus(
                "Scania",
                "Scania CRUIZE",
                2003,
                "Sweden",
                "blue",
                110
        );
        Bus busHyundai = new Bus(
                "Hyundai",
                "Hyundai Universe",
                2011,
                "Sous Korea",
                "",
                120
        );
        System.out.println(busHyundai);
        System.out.println(busVolvo);
        System.out.println(busScania);
    }
}
