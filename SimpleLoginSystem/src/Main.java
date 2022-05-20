import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        create_user(users, passwords);

        System.out.println("Enter 'N' to create a new user, \nor 'L' to log in to an existing account: ");
        String loginOrNew = scanner.nextLine();

        if((loginOrNew.toLowerCase()).equals("n")) {
            create_user(users, passwords);
            login(users, passwords);
        }else if((loginOrNew.toLowerCase()).equals("l")) {
            login(users, passwords);

        }





    }

    static void create_user(ArrayList<String> users, ArrayList<String> passwords) {
        Scanner scanner = new Scanner(System.in);

        String username = get_username();

        System.out.printf("Please enter a password for the username %s \nor type 'C' to change your username: ", username);
        String qOrPassword = scanner.nextLine();
        System.out.println();

        if((qOrPassword.toLowerCase()).equals("c")) {
            username = get_username();
            System.out.println("Username updated to "+username);
            System.out.println("Please enter your password: ");
            qOrPassword = scanner.nextLine();

        }

        users.add(username);
        passwords.add(qOrPassword);

        System.out.println("\n\n\n\n\n\n\n\n");
    }


    static void login(ArrayList<String> users, ArrayList<String> passwords) {
        Scanner login_scanner = new Scanner(System.in);
        System.out.println("Please enter the username of the account you would like to log in to: ");
        String enteredUsr = login_scanner.nextLine();
        if(users.contains(enteredUsr)) {
            int usrIndex = users.indexOf(enteredUsr);
            System.out.println("Please enter the password of the account you would like to log in to: ");
            String enteredPswd = login_scanner.nextLine();
            if(passwords.get(usrIndex).equals(enteredPswd)) {
                System.out.printf("Hello %s, you have successfully logged in!", enteredUsr);
            }else System.out.println("Yikes that was the wrong password. I cba to set up a loop for this so better luck next time ig");
        }
    }





    static String get_username() {
        Scanner username_scanner = new Scanner(System.in);
        System.out.print("Please enter a new username for your account: ");
        String username = username_scanner.nextLine();
        System.out.println();
        return username;
    }

}
		
	

