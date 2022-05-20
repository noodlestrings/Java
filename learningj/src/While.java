import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        scanner.close();

        System.out.println("Your name is "+name);


        int a = 0;

        do{
            a++;
            System.out.println(a);
        } while(a<10);



    }
}