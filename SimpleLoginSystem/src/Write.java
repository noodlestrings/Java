//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    static void write(String username, String password){
        //File file = new File("C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt");
        try {
            FileWriter fileWriter = new FileWriter("C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt", true);
            fileWriter.write(username + " " + password + "\n");
            System.out.println("User successfully added");
            fileWriter.close();
        } catch (IOException e){
            System.out.print("Sorry, something went wrong: ");
            e.printStackTrace();
        }


    }
}
