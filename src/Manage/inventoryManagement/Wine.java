package Manage.inventoryManagement;

public class Wine {

    private String name;
    private String origin;
    private String wineType;
    private double price;
    private double alcohol;

    public Wine() {
    }

    public Wine(String name, String origin, String wineType, double price, double alcohol) {
        this.name = name;
        this.origin = origin;
        this.wineType = wineType;
        this.price = price;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWineType() {
        return wineType;
    }

    public void setWineType(String wineType) {
        this.wineType = wineType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", wineType='" + wineType + '\'' +
                ", price=" + price +
                ", alcohol=" + alcohol +
                '}';
    }
}


