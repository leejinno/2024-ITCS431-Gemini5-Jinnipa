public class Customer extends Person {
    private int customerID;
    private String membershipLevel;

    public Customer(String name, String address, String phoneNumber, int customerID, String membershipLevel) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
        this.membershipLevel = membershipLevel;
    }

    public void negotiateVehicle() {
        System.out.println(name + " is negotiating a vehicle.");
    }

    public void getInvoice() {
        System.out.println(name + " requested an invoice.");
    }

    public void requestTradeIn() {
        System.out.println(name + " requested a trade-in.");
    }
}
