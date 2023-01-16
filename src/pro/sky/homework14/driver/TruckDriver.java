package pro.sky.homework14.driver;

public class TruckDriver extends Driver{
    public TruckDriver(String name, boolean driveLicense, int yearsDriver, TypeLicense typeLicense) throws NoLicenseException {
        super(name, driveLicense, yearsDriver);
        setTypeLicense(typeLicense);
    }

    @Override
    public void setTypeLicense(TypeLicense typeLicense) throws NoLicenseException {
        if(typeLicense!=TypeLicense.C){
            throw new NoLicenseException("This driver track " + this.getName() + " don't have this type licence.");
        }
        this.typeLicense = typeLicense;
    }
}
