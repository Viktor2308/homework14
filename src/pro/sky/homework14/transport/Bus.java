package pro.sky.homework14.transport;

import pro.sky.homework14.driver.BusDriver;

public class Bus extends Transport<BusDriver> {

    public Bus(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void participateInRace(BusDriver driver) {
        if (driver.isDriveLicense()) {
            System.out.println("Driver " + driver.getName() + " is driving bus " +
                    this.toString() + " and will be participating in the race.");
        } else {
            System.out.println(driver.getName() + " don't drive, because don't have drive licence!");
        }
    }

    @Override
    public void startMovement() {
        System.out.print("Bus ");
        super.startMovement();
    }

    @Override
    public void endMovement() {
        System.out.print("Bus ");
        super.endMovement();
    }

    @Override
    public void pitStop() {
        System.out.print("Bus ");
        super.pitStop();
    }

    @Override
    public void bestLapTime() {
        System.out.print("Bus ");
        super.bestLapTime();
    }

    @Override
    public void maxSpeed() {
        System.out.print("Bus ");
        super.maxSpeed();
    }

}
