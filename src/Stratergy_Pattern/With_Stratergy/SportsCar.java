package Stratergy_Pattern.With_Stratergy;

import Stratergy_Pattern.With_Stratergy.Special.DriverCapability;
import Stratergy_Pattern.With_Stratergy.Special.SportCarCapability;

public class SportsCar extends Drive{

    public SportsCar() {
        super(new SportCarCapability());
    }
}
