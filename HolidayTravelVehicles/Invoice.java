public class Invoice {
    private int invoiceNumber;
    private String date;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFees;
    private String customerSignature;

    public Invoice(int invoiceNumber, String date, double tradeInAllowance, double taxes, double licenseFees, String customerSignature) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customerSignature = customerSignature;
    }

    public void requestDealerInstallOptions() {
        System.out.println("Dealer install options requested.");
    }

    public void sumFinalNegotiatedPrice() {
        System.out.println("Final negotiated price calculated.");
    }
}
