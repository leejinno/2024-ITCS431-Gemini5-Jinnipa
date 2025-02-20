public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("C001", "John Doe", "123 Main St", "555-1234");

        // Create a salesperson
        Salesperson salesperson = new Salesperson("S001", "Jane Smith", "456 Elm St", "555-5678", 10);

        // Create a vehicle
        Vehicle vehicle = new Vehicle("V001", "Toyota", "Camry", "2022", "Toyota", 25000, "Available");

        // Create an invoice
        Invoice invoice = new Invoice();
        invoice.setInvoiceID("INV001");
        invoice.setCustomer(customer);
        invoice.setSalesperson(salesperson);
        invoice.setVehicle(vehicle);
        invoice.setTradeInAllowance(0);
        invoice.setNegotiatedPrice(24000);
        invoice.setTaxes(2000);
        invoice.setLicenseFees(300);
        invoice.calculateTotalPrice();
        invoice.setSignature("John Doe");

        // Print the invoice summary
        System.out.println(invoice.toString());
    }
}