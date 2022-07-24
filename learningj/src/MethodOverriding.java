public class MethodOverriding {
    public static void main(String[] args){
        /*
        Method overriding = declaring a method in a subclass which is already in parent class. child class
        can therefore get its own implementation of the method
         */
        animal animal = new animal();
        animal.speak();
        dog dog = new dog();
        dog.speak();
    }
}
class animal{
    void speak() {
        System.out.println("I am an animal");
    }
}

class dog extends animal{
    @Override // doesn't add functionality, just a useful practice
    void speak(){
        System.out.println("This is a dog");
    }
}
