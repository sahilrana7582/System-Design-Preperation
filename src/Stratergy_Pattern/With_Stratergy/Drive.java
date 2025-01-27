package Stratergy_Pattern.With_Stratergy;

import Stratergy_Pattern.With_Stratergy.Special.DriverCapability;

public class Drive {
    DriverCapability driverObj;

    public Drive(DriverCapability driverObj){
        this.driverObj = driverObj;
    }

    public void drive(){
        this.driverObj.driveCapability();
    }
}
