public class toString {
        // toString() = special method inherited by all objects,
        //            returns string textually representing the object.
        //            can be used implicitly and explicitly
    public static void main(String[] args){
    Truck fordTruck = new Truck();
    System.out.println(fordTruck.toString());
    }
}


class Truck {
    String make = "Ford";
    String model = "F150";
    int age = 15;
    String color = "red";

    public String toString() {
        //overriding the tostring method
        return make + " " + model + " in " + color;
    }

}