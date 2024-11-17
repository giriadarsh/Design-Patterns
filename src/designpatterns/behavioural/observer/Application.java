package designpatterns.behavioural.observer;

public class Application {
    public static void main(String[] args) {
        // Initialize InvoiceManagementService
        // This can be done in multiple ways like using static block, making it a singleton class and so on
        InvoiceManagementService invoiceService = new InvoiceManagementService();

        // Initialize OnlineKart and place an order
        OnlineKart onlineKart = new OnlineKart();
        Order order = new Order(); // Assume Order is defined elsewhere
        onlineKart.placeOrder(order);
    }
}
