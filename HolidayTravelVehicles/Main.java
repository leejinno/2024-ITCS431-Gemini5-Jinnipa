public class Main {
    public static void main(String[] args) {
        // Customer customer = new Customer("C-029", "Jui", "Mahidol University", "09X-XXX-XXXX");
        // SalesPerson salesperson = new SalesPerson("S-101", "Francis", 1042, 69000.00, "Nakhon Pathom", "08X-XXX-XXXX");

        Vehicle vehicle1 = new Vehicle("V12345", "Range Rover", "P400 SE", 2023, "Land Rover", 10000000.00f);
        
        System.out.println("Vehicle Details:");
        System.out.println("Serial Number: " + vehicle1.getVehicleSerialNumber());
        System.out.println("Name: " + vehicle1.getName());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println("Manufacturer: " + vehicle1.getManufacturer());
        System.out.println("Base Cost: $" + vehicle1.getBaseCost());
    }

}