import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        /*
         * ArrayList = resizeable array
         * 			   Elements can be added or removed after compilation
         * 			   stores reference data types
         */

        ArrayList<String> food = new ArrayList<String>();// inside <> must be reference type

        food.add("Pizza");
        food.add("Hamburger");
        food.add("BurgerHamHam");

        food.set(0, "Chinese");
        food.remove(2);

        for(int i=0;i<food.size();i++) { // ArrayLists use .size() instead of .length()
            System.out.println(food.get(i)); // Access elements with .get()
        }

        food.clear();
    }

}
