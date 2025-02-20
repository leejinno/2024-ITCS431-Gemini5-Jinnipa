public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private String year;
    private String menufacturer;
    private double baseCost;
    private String status;

    public Vehicle(String serialNumber, String name, String model, String year, String menufacturer, double baseCost, String status) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.menufacturer = menufacturer;
        this.baseCost = baseCost;
        this.status = status;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMenufacturer() {
        return menufacturer;
    }

    public void setMenufacturer(String menufacturer) {
        this.menufacturer = menufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Serial Number: " + serialNumber + "\nName: " + name + "\nModel: " + model + "\nYear: " + year + "\nMenufacturer: " + menufacturer + "\nBase Cost: " + baseCost + "\nStatus: " + status;
    }
}
