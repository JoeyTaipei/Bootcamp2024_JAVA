package HW5.HW5_Extention;

public abstract class Pen {
    private String brand;
    private double price;
    // no parameter constructor
    public Pen(){
    }
    // constructor with parameter
    public Pen(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    // getter and setter
    public String getBrand(){
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public abstract void write();

}




