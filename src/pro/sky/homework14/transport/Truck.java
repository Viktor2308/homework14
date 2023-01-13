package pro.sky.homework14.transport;

import pro.sky.homework14.driver.TruckDriver;


public class Truck extends Transport<TruckDriver> {

    public Truck(String mark, String model, double engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void participateInRace(TruckDriver driver) {
        if (driver.isDriveLicense()) {
            System.out.println("Driver " + driver.getName() + " is driving truck " +
                    this.toString() + " and will be participating in the race.");
        } else {
            System.out.println(driver.getName() + " don't drive, because don't have drive licence!");
        }
    }

    @Override
    public void startMovement() {
        System.out.print("Truck ");
        super.startMovement();
    }

    @Override
    public void endMovement() {
        System.out.print("Truck ");
        super.endMovement();
    }

    @Override
    public void pitStop() {
        System.out.print("Truck ");
        super.pitStop();
    }

    @Override
    public void bestLapTime() {
        System.out.print("Truck ");
        super.bestLapTime();
    }

    @Override
    public void maxSpeed() {
        System.out.print("Truck ");
        super.maxSpeed();
    }
}

