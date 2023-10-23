package kiosk;

public class Product extends Menu {
    private double price;
    private int count = 1;


    public Product(String name, double price, String description) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return super.getName() + " | W " + price + " | " + super.getDescription();
    }
    public String toString_cnt() {
        return super.getName() + " | W " + price + " | " + count +"개 | " + super.getDescription();
    }
}
