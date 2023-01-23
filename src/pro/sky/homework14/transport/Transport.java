package pro.sky.homework14.transport;

import pro.sky.homework14.Competitor;
import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.mechanic.Mechanic;

import java.util.*;

public abstract class Transport<T extends Driver> implements Competitor {
    private final String mark;
    private final String model;
    private double engineVolume;
    private Driver driver;
    private static final HashMap<Transport, Mechanic> transportMap = new HashMap<>();

    protected static final String DEFAULT_VALUE = "default value";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public Transport(String mark, String model, double engineVolume) {
        if (mark == null || mark.isBlank()) {
            this.mark = DEFAULT_VALUE;
        } else {
            this.mark = mark;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        transportMap.put(Transport.this, null);
    }

    public static HashMap<Transport,Mechanic> getTransportMap() {
        return transportMap;
    }

    protected void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void startMovement() {
        System.out.println(getMark() + ' ' + getModel() + " start race.");
    }

    public void endMovement() {
        System.out.println(getMark() + ' ' + getModel() + " end race.");
    }

    @Override
    public void pitStop() {
        System.out.println(this.getMark() + " " + this.getModel() + " in the Pit Stop.");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this.getMark() + " " + this.getModel() + " have a best lap.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.getMark() + " " + this.getModel() + " have a maximum speed.");
    }

    public abstract void participateInRace(T driver);

    public abstract void printType();

    public abstract void doDiagnostic();

    public abstract void infoAboutTeam();

    public abstract void createServiceTeam();

    @Override
    public String toString() {
        return mark + ' ' + model + ' ' + " engine volume " + engineVolume + "l.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(mark, transport.mark) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, engineVolume);
    }
}
