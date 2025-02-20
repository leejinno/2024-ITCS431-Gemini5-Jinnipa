public class Salesperson {
    private String salespersonID;
    private String name;
    private String address;
    private String phone;
    private int sales;

    public Salesperson(String salespersonID, String name, String address, String phone, int sales) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sales = sales;
    }

    public String getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Salesperson ID: " + salespersonID + "\nName: " + name + "\nAddress: " + address + "\nPhone: " + phone + "\nSales: " + sales;
    }
}
