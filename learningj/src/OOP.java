public class OOP {
    public static void main(String[] args) {
        /*System.out.println(Car.model);
        Car.drive();
        Car.park();


        System.out.printf("You are %d years old\n", OOPboat.age);
        System.out.printf("You are a %s\n", OOPboat.occupation);
        OOPboat.whoAreYou();
         */
        Car mycar = new Car();
        System.out.println(mycar.make);
        mycar.make = "BasedBMW";
        System.out.println(mycar.make);
        mycar.powerHP = 1200;
        mycar.price = 56000;

    }
}






class Car{
   String make = "BMW";
   String model = "e36";
   int powerHP;
   double price;

   void drive(){
       System.out.println("You do a sick skid and drift the car");

   }
   void park(){
       System.out.println("You pull up to the local primary school and do a sick handbrake turn");
   }
}