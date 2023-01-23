package pro.sky.homework14.driver;

import java.util.HashSet;

public class ServiceDriver {
    private static final HashSet<Driver> driversSet = new HashSet<>();

    public static HashSet<Driver> getDriversSet() {
        return driversSet;
    }

    public static void addDriver(Driver driver) {
        if (driver != null) {
            driversSet.add(driver);
        }
    }
    public static void allDriverInfo(){
        for (Driver driver : driversSet) {
            System.out.println(driver);
        }
    }


}
