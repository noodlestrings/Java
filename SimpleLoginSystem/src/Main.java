import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt";
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the username of your account: ");
        String username = sc.nextLine();

        String pswdForUser = Read.read(username); //returns null if user doesn't exist

        //sc.nextLine(); // to clear sc

        if (pswdForUser != null){
            int counter = 3;
            while(counter != 0) {
                System.out.printf("You have %d tries remaining to enter the password for the account " + username + ": ", counter);
                String enteredPswd = sc.nextLine();
                if (enteredPswd.equals(pswdForUser)) {
                    System.out.println("\nWelcome " + username + "! You have successfully logged into your account.");
                    break;
                } else counter--;
            }
            if (counter == 0) {
                System.out.println("Sorry, you entered the incorrect password too many times.");
            }
        } else System.out.println("Sorry, that username is not registered with us.");
        
        }
    }