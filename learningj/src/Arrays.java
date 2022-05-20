public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Mustang", "MX5", "Corolla"};
        System.out.println(cars[0]);
        cars[0] = "EP3";
        int[] ages = new int[2]; //empty array of 5 places
        ages[0] = 15;
        ages[1] = 534;

        for(int i = 0; i < (ages.length); i++) {
            System.out.println(ages[i]);
        }
    }
}