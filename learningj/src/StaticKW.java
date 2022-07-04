public class StaticKW {
    public static void main(String[] args){
        // a single copy of the variable/method is created and shared.
        // the class owns the static member
        // all instances of a class share the same static value
        System.out.println(Friend.friendNumber); // don't have to instantiate to access var

        Friend friend1 = new Friend("Micah");
        Friend friend2 = new Friend("Dutch");

        System.out.println(Friend.friendNumber);
        Friend.howManyFriends(); // the same but using a static method
        


    }
}

class Friend{
    String name;
    static int friendNumber;

    Friend(String name){
        this.name=name;
        friendNumber++; // every time a new object is instantiated, no of friends increments
    }
    static void howManyFriends(){
        System.out.println("You have "+friendNumber+" friends.");
    }
}