import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Read {
    static String read(String userName) throws Exception { // return the password if usr exists
        File file = new File("C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt");
        Scanner sc = new Scanner(file);
        String password = null;

        while(sc.hasNextLine()){
            String[] splitted = (sc.nextLine()).split("\\s+"); //add words from users to array separated by
            // whitespace regex "\\s+"
            if (splitted[0].equals(userName)){
                password = splitted[1];
                break;
            }

        }
        sc.close();
        return password;
    }
}
