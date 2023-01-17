package pro.sky.homework14.driver;

public class BusDriver extends Driver {
    public BusDriver(String name, boolean driveLicense, int yearsDriver, TypeLicense typeLicense) throws NoLicenseException {
        super(name, driveLicense, yearsDriver);
        setTypeLicense(typeLicense);
    }

    @Override
    public void setTypeLicense(TypeLicense typeLicense) throws NoLicenseException {
        if(typeLicense!=TypeLicense.D){
            throw new NoLicenseException("This driver bus " + this.getName() + " don't have this type licence.");
        }
        this.typeLicense = typeLicense;
    }
}
