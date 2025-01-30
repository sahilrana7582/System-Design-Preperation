package Structural_Design_Pattern.Adapter_Design.Payment_Gateways;

import java.util.HashSet;
import java.util.Set;

public class RazorPayApi {

    Set<Integer> st = new HashSet<>();


    public String makePaymentByCC(int creditNumber, String cvv, String expiryDate, String expiryMonth,String firstName, String lastName){

        System.out.println("Payment is done by the card " + creditNumber);
        System.out.println("First Name and Last Of Card Owner is " + firstName + lastName);
        st.add(creditNumber);
        return "Done";
    }

    public PaymentStatus checkStatus(int transactionId){
        if(st.contains(transactionId)){
            return PaymentStatus.Success;
        }

        return PaymentStatus.Failed;
    }


}
