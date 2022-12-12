public class Product {
    private String name;
    private double price;
    private String brand;
    private String color;
  
    public Product() {
        name = "";
        price = 0;
        brand = "";
        color = "";
    }
  
    public Product(String name, double price, String brand, String color) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }
  
    public String getName() {
        return name;
    }
  
    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
    public String toString() {
        String data = "Product Name: " + name + "\nProduct Price: " + price + "\nBrand: " + brand + "\nColor: " + color;
        return data;
    }
}
