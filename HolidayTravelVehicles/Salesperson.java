public class Salesperson extends Person {
    private int salespersonID;
    private double salary;
    private String position;

    public Salesperson(String name, String address, String phoneNumber, int salespersonID, double salary, String position) {
        super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
        this.salary = salary;
        this.position = position;
    }

    public void negotiateVehicle() {
        System.out.println(name + " is negotiating a vehicle.");
    }

    public void createInvoice() {
        System.out.println(name + " created an invoice.");
    }
}
