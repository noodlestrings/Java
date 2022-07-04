public class ObjectsAsArgs {
    public static void main(String[] args){
    Cars car1 = new Cars("Chevrolet", "Camaro", 1982);
    Cars car2 = new Cars("Tesla", "Model Y", 2020);
    Garage garage = new Garage();
    garage.park(car1);
    garage.park(car2);
    }
}

class Cars{
    String make;
    String model;
    int year;
    Cars(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
class Garage{
    void park(Cars car){
        System.out.println("You have parked your "+car.year+" "+car.make+" "+car.model);
    }

}