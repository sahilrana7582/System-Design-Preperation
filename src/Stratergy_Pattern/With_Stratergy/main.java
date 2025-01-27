package Stratergy_Pattern.With_Stratergy;

public class main {
    public static void main(String[] args) {
        Drive normalCar = new NormalCar();
        Drive sportCar = new SportsCar();
        Drive suvCar = new SUV();


        sportCar.drive();
        normalCar.drive();
        suvCar.drive();
    }
}
