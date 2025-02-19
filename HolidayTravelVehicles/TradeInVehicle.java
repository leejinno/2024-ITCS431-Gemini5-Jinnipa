public class TradeInVehicle {
    private String vehicleSerialNumber;
    private String manufacturer;
    private String model;
    private int year;
    private double tradeInValue;

    public TradeInVehicle(String vehicleSerialNumber, String manufacturer, String model, int year, double tradeInValue) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.tradeInValue = tradeInValue;
    }

}