package pro.sky.homework14.driver;

public class CarDriver extends Driver{
    public CarDriver(String name, boolean driveLicense, int yearsDriver, TypeLicense typeLicense) throws NoLicenseException {
        super(name, driveLicense, yearsDriver);
        setTypeLicense(typeLicense);
    }


    @Override
    public void setTypeLicense(TypeLicense typeLicense) throws NoLicenseException {
        if(typeLicense!=TypeLicense.B){
            throw new NoLicenseException("This driver car " + this.getName() + " don't have this type licence.");
        }
        this.typeLicense = typeLicense;
    }


}
