public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St", "555-1234");

        Salesperson salesperson = new Salesperson("S001", "Jane Smith", "456 Main St", "555-5678", 10);

        Vehicle vehicle = new Vehicle("V001", "Toyota", "Camry", "2022", "Toyota", 25000, "Available");

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

        System.out.println(invoice.toString());
    }
}