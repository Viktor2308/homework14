package pro.sky.homework14.driver;

import java.util.HashSet;
import java.util.Iterator;

public class ServiceDriver {
    private static final HashSet<Driver> driversHashSet = new HashSet<>();

    public static HashSet<Driver> getDriversHashSet() {
        return driversHashSet;
    }

    public static void addDriver(Driver driver) {
        if (driver != null) {
            driversHashSet.add(driver);
        }
    }

    public static void allDriverInfo() {
        Iterator<Driver> driverIterator = driversHashSet.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }
    }

}
