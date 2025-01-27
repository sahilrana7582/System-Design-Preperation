package Stratergy_Pattern.With_Stratergy.Special;

public class NormalDrive implements DriverCapability{
    @Override
    public void driveCapability() {
        System.out.println("This car has only normal Drive Capability");
    }
}
