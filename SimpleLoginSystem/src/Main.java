import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 'L' to login to an existing account or 'N' to create a new account: ");
        String decision = sc.nextLine();


        if(decision.toLowerCase().equals("l")){
                System.out.print("\nPlease enter the username of your account: ");
                String username = sc.nextLine();

                String pswdForUser = Read.read(username)[1]; //returns null if user doesn't exist


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






        } else if (decision.toLowerCase().equals("n")){
            System.out.print("Please enter a username for the account: ");
            String newUser = sc.nextLine();
            if (Read.read(newUser)[1] == null){
                System.out.print("Please enter a password for "+newUser+ ": ");
                String newPassword = sc.nextLine();

                Write.write(newUser, newPassword);
            } else System.out.println("Sorry, an account with that username already exists");

        }

        }
    }