package Stratergy_Pattern.With_Stratergy;

import Stratergy_Pattern.With_Stratergy.Special.DriverCapability;
import Stratergy_Pattern.With_Stratergy.Special.NormalDrive;

public class NormalCar extends Drive{
    public NormalCar() {
        super(new NormalDrive());
    }
}
