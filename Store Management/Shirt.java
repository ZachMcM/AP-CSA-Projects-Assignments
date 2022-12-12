public class Shirt extends Product {
    private String shirtSize;
    private boolean shortSleeve;

    public Shirt() {
        super();
        shirtSize = "";
        shortSleeve = false;
    }

    public Shirt(String name, double price, String brand, String color, String shirtSize, boolean shortSleeve) {
        super(name, price, brand, color);
        this.shirtSize = shirtSize;
        this.shortSleeve = shortSleeve;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public boolean getShortSleeveStatus() {
        return shortSleeve;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public void setShortSleeveStatus(boolean shortSleeve) {
        this.shortSleeve = shortSleeve;
    }

    public String toString() {
        String data = "Name: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nColor: " + getColor() + "\nShirtSize: " + shirtSize + "\nShort Sleeve: " + shortSleeve;
        return data;
    }
}