package pro.sky.homework14.transport;

import pro.sky.homework14.driver.BusDriver;
import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.mechanic.Mechanic;

import static pro.sky.homework14.driver.ServiceDriver.getDriversSet;
import static pro.sky.homework14.mechanic.Mechanic.getMechanicSet;

public class Bus extends Transport<BusDriver> {
//    private static final int COUNT_MECHANIC_SERVICE = 4;
//    private final List<Mechanic> serviceTeam = new ArrayList<>(COUNT_MECHANIC_SERVICE);
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
    public void doDiagnostic() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Transport Bus - can't pass diagnostics.");
    }

    @Override
    public void infoAboutTeam() {
        System.out.println("Bus " + getMark() + getModel() + " driving " + getDriver().getName() + ", services: " + getTransportMap().get(this));
    }


    @Override
    public void printType() {
        System.out.println("Bus " + getMark() + ' ' + getModel() + ' ' + getPeopleCapacity());
    }

    @Override
    public void createServiceTeam() {
        if (getTransportMap().get(this) != null) {
            System.out.println("Mechanic " + getMark() + " " + getModel() + " " + getTransportMap().get(this));
            return;
        } else {
            for (Mechanic mechanic : getMechanicSet()) {
                if (mechanic.isFree() && mechanic.iCanServiceThisCar(Bus.this)) {
                    getTransportMap().put(this, mechanic);
                    mechanic.setFree(false);
                    System.out.println("New mechanic " + getMark() + " " + getModel() + " " + getTransportMap().get(this));
                    return;
                }
            }
        }
        System.out.println("Service team not ready.");
//        if (serviceTeam.isEmpty()) {
//            for (Mechanic mechanic : mechanicList) {
//                if (mechanic.isFree() && mechanic.iCanServiceThisCar(Bus.this) && serviceTeam.size()<COUNT_MECHANIC_SERVICE) {
//                    mechanic.setFree(false);
//                    serviceTeam.add(mechanic);
//                }
//            }
//        }
//        if (serviceTeam.size() == COUNT_MECHANIC_SERVICE ) {
//            System.out.println("Truck " + getMark()+ " "+getModel()+" service team ready " + serviceTeam);
//        } else {
//            System.out.println("Truck service team not ready.");
//        }

    }


    @Override
    public boolean setDriverForTransport() {
        if (this.getDriver() != null) {
            System.out.println("Driver: " + getDriver());
            return false;
        } else {
            for (Driver driver1 : getDriversSet()) {
                if (driver1.isFree() && driver1.getTypeLicense().equals(Driver.TypeLicense.D)) {
                    setDriver(driver1);
                    driver1.setFree(false);
                    return true;
                }
            }
        }
        System.out.println("No driver fo " + getMark() + " car");
        return false;
    }

    @Override
    public boolean carryOutMaintenance() {
//        if(serviceTeam.isEmpty() || serviceTeam.size()!=COUNT_MECHANIC_SERVICE){
//            System.out.println("No team for carry out maintenance.");
//            return false;
//        } else {
//            System.out.println("Bus " + getMark() + " to get carry out maintenance");
            return true;
//        }

    }

    @Override
    public boolean fixTheTransport() {
//        if(serviceTeam.isEmpty() || serviceTeam.size()!=COUNT_MECHANIC_SERVICE){
//            System.out.println("No team for fix the " + getMark() + " .");
//            return false;
//        } else {
//            System.out.println("Finish fix the bus " + getMark());
            return true;
//        }
    }
}
