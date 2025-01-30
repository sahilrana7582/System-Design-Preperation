package Structural_Design_Pattern.Adapter_Design;

import Structural_Design_Pattern.Adapter_Design.Payment_Gateways.Flipkart;
import Structural_Design_Pattern.Adapter_Design.Payment_Gateways.RazorPayApi;

public class Client {
    public static void main(String[] args) {
        Flipkart fl = new Flipkart(new RazorPayApi(), "Sahil", "Rana");
        fl.makePayment(12345678, "511", "12", "12");
        System.out.println(fl.checkStatus(1234678));
    }

}
