import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while(running) {

            System.out.println("Enter an operation:");
            System.out.println("'+'          '-'          '/'          '*'\n'sqrt'       'square'\n'sin(x)'     'cos(x)'     'tan(x)'");
            System.out.println("'log10(x)'   'ln(x)'      'logY(x)'");
            System.out.println("Enter 'q' to quit");
            System.out.println();
            String operation = scanner.nextLine();

            switch(operation){
                case "q":
                    running = false;
                    break;
                case "+":
                    System.out.print("Enter the number of numbers that you would like to add:");
                    int additionLen = scanner.nextInt();
                    for (int i=0;i<additionLen+1;i++) { //WAIT TO LEARN FUNCTIONS FOR ORGANISATIONS SAKE

                    }
                case "-":
                case "/":
                case "sqrt":
                case "square":



            }


        }

    }
}