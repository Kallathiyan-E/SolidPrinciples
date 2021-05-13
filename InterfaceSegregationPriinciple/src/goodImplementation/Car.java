package goodImplementation;

public class Car implements Vehicle, Movable {
    int price;
    String color;
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void start(){
    	 System.out.println("Engine Started Successfully");
    }

    public void stop(){
       System.out.println("Engine Off");
    }
}