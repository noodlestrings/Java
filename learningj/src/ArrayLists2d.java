import java.util.*;

public class ArrayLists2d {

        public static void main(String[] args) {

                ArrayList<ArrayList<String>> totalGroceryList = new ArrayList<ArrayList<String>>();

                ArrayList<String> baseIngredients = new ArrayList<String>();
                baseIngredients.add("Pasta");
                baseIngredients.add("Sardines");
                baseIngredients.add("Sauce");


                ArrayList<String> fruitVeg = new ArrayList<String>();
                fruitVeg.add("Tomatoes");
                fruitVeg.add("Apples");
                fruitVeg.add("Squashes");

                ArrayList<String> drinks = new ArrayList<String>();
                drinks.add("Coke");
                drinks.add("vodka");
                drinks.add("Stella");
                drinks.add("Wheyyyyyy");

                totalGroceryList.add(baseIngredients);
                totalGroceryList.add(fruitVeg);
                totalGroceryList.add(drinks);

                System.out.println(totalGroceryList.get(0).get(2));
        }

}
