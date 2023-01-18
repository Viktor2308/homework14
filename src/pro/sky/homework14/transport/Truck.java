package pro.sky.homework14.transport;

import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.driver.TruckDriver;
import pro.sky.homework14.mechanic.Mechanic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Truck extends Transport<TruckDriver> {
    private static final int COUNT_MECHANIC_SERVICE = 3;
    private final List<Mechanic> serviceTeam = new ArrayList<>(COUNT_MECHANIC_SERVICE);
    private LoadCapacity loadCapacity;

    public Truck(String mark, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(mark, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null),
        NO_INFORMATION(null, null);


        final Float minCapacity;
        final Float maxCapacity;

        public Float getMinCapacity() {
            return minCapacity;
        }

        public Float getMaxCapacity() {
            return maxCapacity;
        }

        LoadCapacity(Float minCapacity, Float maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;

        }

        @Override
        public String toString() {
            if (minCapacity == null && maxCapacity == null) {
                return "No information about capacity";
            }
            if (minCapacity == null) {
                return "Carrying capacity with a gross weight of up to " + maxCapacity + " tons.";
            } else if (maxCapacity == null) {
                return "Carrying capacity with a gross weight over " + minCapacity + " tons.";
            } else {
                return "Carrying capacity with a gross weight of over " + minCapacity + " to " + maxCapacity + " tons.";
            }
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        System.out.println("Truck " + getMark() + ' ' + getModel() + ' ' + getLoadCapacity());
    }

    @Override
    public void doDiagnostic() {
        System.out.println(getMark() + ' ' + getModel() + " - truck diagnostics done.");
    }

    @Override
    public void infoAboutTeam() {

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

    @Override
    public void createServiceTeam(LinkedList<Mechanic> mechanicList) {
        if (serviceTeam.isEmpty()) {
            for (Mechanic mechanic : mechanicList) {
                if (mechanic.isFree() && mechanic.iCanServiceThisCar(Truck.this) && serviceTeam.size()<COUNT_MECHANIC_SERVICE) {
                    mechanic.setFree(false);
                    serviceTeam.add(mechanic);
                }
            }
        }
        if (serviceTeam.size() == COUNT_MECHANIC_SERVICE ) {
            System.out.println("Truck " + getMark()+ " "+getModel()+" service team ready " + serviceTeam);
        } else {
            System.out.println("Truck service team not ready.");
        }

    }


    @Override
    public boolean setDriverForTransport(LinkedList<Driver> driver) {
        for (int i = 0; i < driver.size(); i++) {
            if(driver.get(i).isFree() && driver.get(i).getTypeLicense().equals(Driver.TypeLicense.C)){
                setDriver(driver.get(i));
                driver.get(i).setFree(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean carryOutMaintenance() {
        if(serviceTeam.isEmpty() || serviceTeam.size()!=COUNT_MECHANIC_SERVICE){
            System.out.println("No team for carry out maintenance.");
            return false;
        } else {
            System.out.println("Truck " + getMark() + " to get carry out maintenance");
            return true;
        }

    }

    @Override
    public boolean fixTheTransport() {
        if(serviceTeam.isEmpty() || serviceTeam.size()!=COUNT_MECHANIC_SERVICE){
            System.out.println("No team for fix the " + getMark() + " .");
            return false;
        } else {
            System.out.println("Finish fix the truck " + getMark());
            return true;
        }
    }

}

