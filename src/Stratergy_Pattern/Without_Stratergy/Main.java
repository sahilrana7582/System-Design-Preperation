package Stratergy_Pattern.Without_Stratergy;

import Stratergy_Pattern.Without_Stratergy.Special_Cars.NormalCar;
import Stratergy_Pattern.Without_Stratergy.Special_Cars.OffRoadCar;
import Stratergy_Pattern.Without_Stratergy.Special_Cars.SportsCar;

public class Main {
    public static void main(String[] args) {

        Drive normalCar = new NormalCar();
        Drive offroadCar = new OffRoadCar();
        Drive sportCar = new SportsCar();


        //Here, We can see the offroad car and the sports car have the same capibility of special
        //So, if there will be more class if they wil have the same capibility. Then, there will be code duplication
        //This is not scalable code
        offroadCar.driveCapability();
        normalCar.driveCapability();
        sportCar.driveCapability();

    }
}
