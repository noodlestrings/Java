import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        Read("C:\\IntellijProjects\\Bank\\src\\users.txt");

        try {
            FileWriter out = new FileWriter("C:\\IntellijProjects\\Bank\\src\\users.txt", true);
            out.write("This is a test from FileWriter");
            out.close();

            System.out.println("\nLine successfully written\n");


            Read("C:\\IntellijProjects\\Bank\\src\\users.txt");


        } catch (IOException e){ //any exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    static void Read(String fileName) throws Exception { // static means no object needs to be instantiated
        File file = new File(fileName);                  // to access this method
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}