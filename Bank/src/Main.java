import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\IntellijProjects\\Bank\\src\\users.txt";

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


    /*static void Read(String fileName) throws Exception { // static means no object needs to be instantiated
        File file = new File(fileName);                  // to access this method
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }*/
}