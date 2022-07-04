public class Inheritance {
    public static void main(String[] args){
        // when a class acquires the methods and attributes of another
        Motorcycle motorbike = new Motorcycle();
        Bicycle bike = new Bicycle();
        motorbike.go();
        bike.stop();
        }
    }

class Vehicle {
    double topSpeed;
    String brand;
    boolean isElectric;
    String color;

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle has stopped moving");
    }

}
class Motorcycle extends Vehicle{ // "extends" makes it a child class of Vehicle (Super/parent class)
    int cubicCentemetres = 500;
}
class Bicycle extends Vehicle{
    int pedals = 2;

}
