package Stratergy_Pattern.With_Stratergy;

import Stratergy_Pattern.With_Stratergy.Special.DriverCapability;
import Stratergy_Pattern.With_Stratergy.Special.OffRoadCarCapability;

public class SUV extends Drive{

    public SUV( ) {
        super(new OffRoadCarCapability());
    }
}
