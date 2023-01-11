package pro.sky.homework14.driver;

public abstract class Driver {
    private final String name;
    private boolean driveLicense;
    private int yearsDriver;

    private static final String DEFAULT_VALUE = "default value";

    public Driver(String name, boolean driveLicense, int yearsDriver) {
        if (name == null || name.isBlank()) {
            this.name = DEFAULT_VALUE;
        } else {
            this.name = name;
        }
        this.driveLicense = driveLicense;
        setYearsDriver(yearsDriver);
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
        return "Driver{" +
                "name='" + name + '\'' +
                ", driveLicense=" + driveLicense +
                ", yearsDriver=" + yearsDriver +
                '}';
    }
}
