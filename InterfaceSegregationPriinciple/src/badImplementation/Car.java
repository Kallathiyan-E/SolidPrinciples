package badImplementation;

public class Car implements Vehicle {
    int price;
    String color;
   
    public void setPrice(int price) {
        this.price = price;
    }
   
    public void setColor(String color) {
        this.color=color;
    }
    
    public void start(){}
    
    public void stop(){}
   
    public void fly(){}    
}