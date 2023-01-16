package pro.sky.homework14.transport;

import pro.sky.homework14.driver.BusDriver;

public class Bus extends Transport<BusDriver> {

    private PeopleCapacity peopleCapacity;


    public Bus(String mark, String model, double engineVolume, PeopleCapacity peopleCapacity) {
        super(mark, model, engineVolume);
        this.peopleCapacity = peopleCapacity;
    }

    public enum PeopleCapacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        ESPECIALLY_LARGE(100, 120),
        NO_INFORMATION(null, null);

        final Integer minCapacity;
        final Integer maxCapacity;

        public Integer getMinCapacity() {
            return minCapacity;
        }

        public Integer getMaxCapacity() {
            return maxCapacity;
        }

        PeopleCapacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;

        }

        @Override
        public String toString() {
            if (minCapacity == null && maxCapacity == null) {
                return "No information about capasity.";
            } else if (minCapacity == null) {
                return "People capacity up to " + maxCapacity + " seats.";
            } else {
                return "People capacity " + minCapacity + " - " + maxCapacity + " seats.";
            }
        }
    }

    public PeopleCapacity getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(PeopleCapacity peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
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

    @Override
    public void printType() {
        System.out.println("Bus " + getMark() + ' ' + getModel() + ' ' + getPeopleCapacity());
    }
}
