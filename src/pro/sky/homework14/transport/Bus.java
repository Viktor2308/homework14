package pro.sky.homework14.transport;

import pro.sky.homework14.driver.BusDriver;

public class Bus<T extends BusDriver> extends Transport {

    public Bus(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

    public void participateInRace(T driver) {
        if (driver.isDriveLicense()) {
            System.out.println("Driver " + driver.getName() + " is driving car " +
                    this.toString() + " and will be participating in the race.");
        } else {
            System.out.println(driver.getName() + " don't drive, because don't have drive licence!");
        }
    }
}
