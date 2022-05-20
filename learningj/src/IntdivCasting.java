public class IntdivCasting {

    public static void main(String[] args) {
        int age = 10;

        age /= 3; // integer division
        System.out.println(age);


        double age1 = 10;

        age1 /= (double) 3;
        System.out.println(age1);
    }

}
