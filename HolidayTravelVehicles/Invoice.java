import java.util.Date;
import java.util.ArrayList;

public class Invoice {
    private String invoiceID;
    private Vehicle vehicle;
    private String customerID;
    private String salesPersonID;
    private ArrayList<AdditionalInstallationOption> options;
    private double negotiatedPrice;
    private double tradeInValue;
    private double taxes;
    private double licenseFees;
    private double totalPrice;
    private Date dateIssued;
    private TradeInVehicle tradeInVehicle;

    public Invoice( String invoiceID, 
                    Vehicle vehicle, 
                    String customerID, 
                    String salesPersonID, 
                    ArrayList<AdditionalInstallationOption> options, 
                    double negotiatedPrice, 
                    double tradeInValue, 
                    double taxes, 
                    double licenseFees, 
                    double totalPrice, 
                    Date dateIssued, 
                    TradeInVehicle tradeInVehicle) 
    {
        this.invoiceID = invoiceID;
        this.vehicle = vehicle;
        this.customerID = customerID;
        this.salesPersonID = salesPersonID;
        this.options = options;
        this.negotiatedPrice = negotiatedPrice;
        this.tradeInValue = tradeInValue;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.totalPrice = totalPrice;
        this.dateIssued = dateIssued;
        this.tradeInVehicle = tradeInVehicle;
    }

}