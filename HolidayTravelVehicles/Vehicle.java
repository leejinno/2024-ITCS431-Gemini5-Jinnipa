public class Vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getVehicleSerialNumber() { return vehicleSerialNumber; }
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getManufacturer() { return manufacturer; }
    public double getBaseCost() { return baseCost; }
}