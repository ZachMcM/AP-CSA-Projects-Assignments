public class Shoe extends Product {
    private double shoeSize;
    private String shoeCategory;
  
    public Shoe() {
      shoeSize = 0;
      shoeCategory = "";
    }
  
    public Shoe(String name, double price, String brand, String color, double shoeSize, String shoeCategory) {
      super(name, price, brand, color);
      this.shoeSize = shoeSize;
      this.shoeCategory = shoeCategory;
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
  