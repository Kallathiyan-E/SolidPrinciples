package goodImplementation;

public class Aeroplane implements Vehicle, Movable, Flyable {
    int price;
    String color;
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
     this.color=color;
    }

    public void start(){
        System.out.println("Turbine Started Successfully");
    }

    public void stop(){
        System.out.println("Turbine off");
    }

    public void fly(){
        System.out.println("Flaps activated");
        System.out.println("Precondition Checked");
    }
}
