import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double firstSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second side of the triangle: ");
        double secondSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The hypotenuse is "+ Math.sqrt((firstSide*firstSide) + (secondSide*secondSide)));
        scanner.close();

    }

}
