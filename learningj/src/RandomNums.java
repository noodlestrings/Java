import java.util.Random;

public class RandomNums {

    public static void main(String[] args) {

        Random randomGen = new Random();

        int x = randomGen.nextInt(7);
        System.out.println(x);

        double y = randomGen.nextDouble();
        System.out.println(y);

        boolean z = randomGen.nextBoolean();
        System.out.println(z);
    }

}
