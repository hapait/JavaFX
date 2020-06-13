package javafxlearning;

public class Product {
    private String name;
    private double price;
    private int qty;
    
    public Product(){
        this.name = "";
        this.price = 0;
        this.qty = 0;
    }
    
    public Product(String name, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
