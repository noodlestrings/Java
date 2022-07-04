import java.io.File;
import java.util.Scanner;

public class Read {
    static String[] read(String userName) throws Exception { // return the password if usr exists
        File file = new File("C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt");
        Scanner sc = new Scanner(file);
        String password = null;
        boolean passwordFound = false;

        String[] splitted = new String[0];
        while (sc.hasNextLine()) {
            splitted = (sc.nextLine()).split("\\s+");
            // whitespace regex "\\s+"
            if (splitted[0].equals(userName)) {
                //String[] usrPswd = splitted;
                passwordFound= true;
                break;
            }

        }
        String[] nullEvent = {userName, null};
        sc.close();
        if(passwordFound) {
            return splitted;
        }else return nullEvent;
    }
}
