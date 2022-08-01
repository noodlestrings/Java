public class overloadedConstructors {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors with same name,
        //                           with different parameters
        //                           name + parameters = signature
        Pizza pizza1 = new Pizza("White", 13, false, "mozzarella");
        Pizza pizza2 = new Pizza(13, true, "mozzarella");

        System.out.println("Here are the ingredients of your pizza");
        System.out.println(pizza1.doughColor);
        System.out.println(pizza1.size);
        System.out.printf("Vegetarian = %b\n", pizza1.vegetarian);
        System.out.println(pizza1.cheeseType);
    }
}







class Pizza{
    String doughColor;
    int size;
    boolean vegetarian;
    String cheeseType;
    Pizza(String doughColor, int size, boolean vegetarian, String cheeseType){
        this.doughColor = doughColor;
        this.size = size;
        this.vegetarian = vegetarian;
        this.cheeseType = cheeseType;

    }
    Pizza(int size, boolean vegetarian, String cheeseType) {
        this.size = size;
        this.vegetarian = vegetarian;
        this.cheeseType = cheeseType;
    }
}
