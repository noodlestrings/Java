import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String notAllowed = "garlic";

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // .nextInt does not clear the \n char when you press enter
        scanner.nextLine(); // call .nextLine to clear the \n to get the next input

        System.out.print("Enter a food: ");
        String food = scanner.nextLine();
        if(food.equals(notAllowed)) { // comparing strings needs .equals methods
            System.out.println("disgusting");
            scanner.close();
            return;
        }

        System.out.println("Hello " + name + ". You are " + age);
        System.out.println(". Wow that is right, "+food+" is a food.");
        scanner.close(); //closes scanner to prevent 'resource leak'
    }

}
