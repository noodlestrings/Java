import java.util.ArrayList;

public class Foreach {

    public static void main(String[] args) {
        //for each = iterate through elements in array or collecion; more readable, fewer steps than regualr for loop
        // less flexible than regualr for loop

        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(69);
        ages.add(420);
        ages.add(21);

        String[] animalNames = {"Dog", "Cat", "Hamster", "Tiger"};



        for(int j : ages) {
            System.out.println(j);
        }
        for(String i : animalNames) {
            System.out.println(i);

        }
    }

}


