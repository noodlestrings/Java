public class Constructors {
    public static void main(String[] args) {
        // constructor = method called at object instantiation
        Human human1 = new Human(69, "John Stamos", 120.5);
        Human human2 = new Human(13, "edgelored", 36);
        human1.eat();
        human2.eat();
        human2.sleep();
    }
}


class Human{
    String name;
    int age;
    double massKG;

    Human(int age, String name, double massKG){  //constructor [method]
        this.age = age; //same as self
        this.name = name;
        this.massKG = massKG;
    }

    void eat(){
        System.out.printf("You eat some delicious food and your mass is now %.2f Kgs.", this.massKG + 10);
        System.out.println();
    }
    void sleep(){
        System.out.println("You go to sleep");
        System.out.println();
    }
}