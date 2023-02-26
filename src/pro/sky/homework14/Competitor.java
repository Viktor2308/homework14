package pro.sky.homework14;

import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.mechanic.Mechanic;

import java.util.HashSet;
import java.util.LinkedList;

public interface Competitor {
    void pitStop();

    void bestLapTime();

    void maxSpeed();

    boolean setDriverForTransport();

    boolean carryOutMaintenance();

    boolean fixTheTransport();



}

