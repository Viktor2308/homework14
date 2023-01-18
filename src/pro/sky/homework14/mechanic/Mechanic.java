package pro.sky.homework14.mechanic;

import pro.sky.homework14.driver.Driver;
import pro.sky.homework14.transport.Bus;
import pro.sky.homework14.transport.Car;
import pro.sky.homework14.transport.Transport;
import pro.sky.homework14.transport.Truck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mechanic {
    private String name;
    private String company;
    private List<Driver.TypeLicense> typeTransportMechanic;
    private boolean isFree;
    private static final LinkedList<Mechanic> mechanicList = new LinkedList<>();


    private static final String DEFAULT_VALUE = "default value";

    public Mechanic(String name, String company, Driver.TypeLicense typeLicense) {
        setName(name);
        setCompany(company);
        if (typeTransportMechanic == null) {
            typeTransportMechanic = new ArrayList<Driver.TypeLicense>();
        }
        typeTransportMechanic.add(typeLicense);
        mechanicList.add(Mechanic.this);
        isFree = true;
    }

    public static LinkedList<Mechanic> getMechanicList() {
        return mechanicList;
    }


    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null) {
            this.name = DEFAULT_VALUE;
        }
        this.name = name;
    }

    public void setCompany(String company) {
        if (company.isBlank() || company == null) {
            this.company = DEFAULT_VALUE;
        }
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public List<Driver.TypeLicense> getTypeTransportMechanic() {
        return typeTransportMechanic;
    }

    public void setTypeTransportMechanic(Driver.TypeLicense typeLicense) {
        if (!typeTransportMechanic.contains(typeLicense)) {
            typeTransportMechanic.add(typeLicense);
        }

    }

    public boolean iCanServiceThisCar(Transport transport) {
        if (transport.getClass() == Car.class && typeTransportMechanic.contains(Driver.TypeLicense.B)) {
            return true;
        } else if (transport.getClass() == Truck.class && typeTransportMechanic.contains(Driver.TypeLicense.C)) {
            return true;
        } else if (transport.getClass() == Bus.class && typeTransportMechanic.contains(Driver.TypeLicense.D)) {
            return true;
        } else {
            return false;
        }

    }




    @Override
    public String toString() {
        return name + ' ' + company + ' ' + typeTransportMechanic + " is free:" +isFree;
    }
}
