public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private String year;

    public TradeInVehicle(String serialNumber, String make, String model, String year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Trade-In Vehicle\nSerial Number: " + serialNumber + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year;
    }
}