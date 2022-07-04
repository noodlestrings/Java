import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\IntellijProjects\\SimpleLoginSystem\\src\\users.txt";

        Read.read();

        try {
            FileWriter out = new FileWriter(fileName, true);
            out.write("This is a test from FileWriter\n");
            out.close();

            System.out.println("\nLine successfully written\n");


            Read.read();


        } catch (IOException e){ //any exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}