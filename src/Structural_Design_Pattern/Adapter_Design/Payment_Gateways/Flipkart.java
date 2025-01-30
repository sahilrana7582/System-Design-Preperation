package Structural_Design_Pattern.Adapter_Design.Payment_Gateways;

public class Flipkart implements PaymentGatewayInterface{
    RazorPayApi razorPayApi;
    String firstName;
    String lastName;

    public Flipkart(RazorPayApi razorPayApi, String firstName, String lastName){
        this.razorPayApi = razorPayApi;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String makePayment(int creditNumber, String cvv, String expiryDate, String expiryMonth) {
        return razorPayApi.makePaymentByCC(creditNumber, cvv, expiryDate, expiryMonth, this.firstName, this.lastName);
    }

    @Override
    public PaymentStatus checkStatus(int transactionId) {
        return razorPayApi.checkStatus(transactionId);
    }

}
