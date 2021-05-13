package goodImplementation;

public class VehicleBuilder {
    public static void main(String[] args){
        Car car = new Car();
        car.setPrice(15);
        car.setColor("green");
        car.start();
  
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setPrice(25);
        aeroplane.setColor("red");
        aeroplane.start();
        aeroplane.fly();
        
    }
}