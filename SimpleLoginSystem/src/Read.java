import java.io.File;
import java.util.Scanner;

public class Read {
    static void read() throws Exception { // static means no object needs to be instantiated
        File file = new File("C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt");                  // to access this method
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
