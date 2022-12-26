package pro.sky.homework14;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada",  "Granta",1.7, "Yellow", 2015, "Russia");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany");
        Car kiaSportage = new Car("KIA", "Sportage 4-th generation", 2.4, "Rad", 2018, "Sous Korea");
        Car huendaiAvante = new Car("Huendai", "Avante", 1.6, "Orange", 2016, "Sous Korea");


        Car testExeption1 = new Car("","",-28, "", -201, null);
        Car testExeption2 = new Car(null,null,-28, null, -201, "");

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

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(huendaiAvante);

        System.out.println(testExeption1);
        System.out.println(testExeption2);
    }
}
