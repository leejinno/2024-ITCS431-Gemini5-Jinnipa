public class Invoice {
    private String invoiceID;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private double tradeInAllowance;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;
    private double totalPrice;
    private String signature;

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }

    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
    }

    public double getNegotiatedPrice() {
        return negotiatedPrice;
    }

    public void setNegotiatedPrice(double negotiatedPrice) {
        this.negotiatedPrice = negotiatedPrice;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getLicenseFees() {
        return licenseFees;
    }

    public void setLicenseFees(double licenseFees) {
        this.licenseFees = licenseFees;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void calculateTotalPrice() {
        this.totalPrice = (negotiatedPrice + taxes + licenseFees) - tradeInAllowance;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceID + "\nCustomer: " + customer.getName() + "\nSalesperson: " + salesperson.getName() +
               "\nVehicle: " + vehicle + "\nTrade-In Vehicle: " + tradeInVehicle + "\nTrade-In Allowance: " + tradeInAllowance +
               "\nNegotiated Price: " + negotiatedPrice + "\nTaxes: " + taxes + "\nLicense Fees: " + licenseFees +
               "\nTotal Price: " + totalPrice + "\nSignature: " + signature;
    }
}
