package Structural_Design_Pattern.Adapter_Design.Payment_Gateways;

public interface PaymentGatewayInterface {

    String makePayment(int creditNumber, String cvv, String expiryDate, String expiryMonth);

    PaymentStatus checkStatus(int transactionId);
}
