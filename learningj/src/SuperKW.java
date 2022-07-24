public class SuperKW {
    public static void main(String[] args){
        Person me = new Person("sam", 16);
        Hero superman = new Hero("superman", 40, "Can fly");

        System.out.println(superman.name+superman.age+superman.power);
        System.out.println(superman.toString());

        System.out.println(me.name+me.age);
        System.out.println(me.toString());

    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " is " + age + " years old";
    }
}
class Hero extends Person{
    String power;
    Hero(String name, int age, String power) {
        super(name, age); // sends these to the super constructor
        this.power = power;
    }
    public String toString(){
        return super.toString() + " " + power; // we want the overridden tostring from the super, and will add to it
    }
}
