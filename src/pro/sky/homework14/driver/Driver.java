package pro.sky.homework14.driver;

import pro.sky.homework14.mechanic.Mechanic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public abstract class Driver {
    private final String name;
    private boolean driveLicense;
    private int yearsDriver;
    private boolean isFree;
    protected TypeLicense typeLicense;
    private static final HashSet<Driver> driversList = new HashSet<>();

    private static final String DEFAULT_VALUE = "default value";

    public Driver(String name, boolean driveLicense, int yearsDriver) throws NoLicenseException {
        if (name == null || name.isBlank()) {
            this.name = DEFAULT_VALUE;
        } else {
            this.name = name;
        }
        this.driveLicense = driveLicense;
        setYearsDriver(yearsDriver);
        driversList.add(Driver.this);
        isFree = true;

    }

    public enum TypeLicense {
        A, B, C, D;
    }

    public static HashSet<Driver> getDriversList() {
        return driversList;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public abstract void setTypeLicense(TypeLicense typeLicense) throws NoLicenseException;

    public TypeLicense getTypeLicense() throws NullPointerException{
        if (typeLicense != null) {
            return typeLicense;
        }
        throw new NullPointerException("No type licence " + this);
    }

    public String getName() {
        return name;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getYearsDriver() {
        return yearsDriver;
    }

    public void setYearsDriver(int yearsDriver) {
        if (yearsDriver < 0 || yearsDriver > 100) {
            this.yearsDriver = 0;
        } else {
            this.yearsDriver = yearsDriver;
        }
    }

    public void startDrive() {
        if (isDriveLicense()) {
            System.out.println(getName() + " is starting drive.");
        } else {
            System.out.println(getName() + " don't have drive license");
        }
    }

    public void stopDrive() {
        if (isDriveLicense()) {
            System.out.println(getName() + " stopped.");
        } else {
            System.out.println(getName() + " don't have drive license");
        }
    }


    public void refuelTransport() {
        System.out.println(getName() + " fills up the transport.");
    }

    @Override
    public String toString() {
        return "Driver " + name  +
                ", years driver " + yearsDriver +
                ", type license " + typeLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driveLicense == driver.driveLicense && yearsDriver == driver.yearsDriver && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driveLicense, yearsDriver);
    }
}
