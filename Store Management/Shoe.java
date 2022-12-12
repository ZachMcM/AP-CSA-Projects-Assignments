public class Shoe extends Product {
    private double shoeSize;

    public Shoe() {
        shoeSize = 0;
    }

    public Shoe(String name, double price, String brand, String color, double shoeSize) {
        super(name, price, brand, color);
        this.shoeSize = shoeSize;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    } 

    public String toString() {
        String data = "Name: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nColor: " + getColor() + "\nShoe Size: " + shoeSize;
        return data;
    }
}
