import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testcommit
        StringBuilder password = new StringBuilder();
        Random selectArray = new Random();
        Random selectValue = new Random();
        Random upper = new Random();

        int alphabetLen = characters.alphabet.length - 1;
        int numbersLen = characters.numbers.length - 1;
        int specialCharsLen = characters.specialChars.length - 1;


        int pswdLen = 0;
        Scanner scanner = new Scanner(System.in);
        boolean validLength = false;
        while (!validLength) {
            System.out.println("The password must between 8 and 25 characters long.");
            System.out.print("Please enter the length of the password: ");
            pswdLen = scanner.nextInt();
            if(pswdLen<26 && pswdLen>7){
                validLength = true;
            }

        }
        System.out.println();



        for(int i=0;i< pswdLen;i++){
            int n1 = selectArray.nextInt(3);
            if (n1 == 0){ // letters
                int n2 = selectValue.nextInt(alphabetLen);
                boolean n3 = upper.nextBoolean();
                if (n3)
                    password.append(characters.alphabet[n2].toUpperCase());
                else{
                    password.append(characters.alphabet[n2]);
                }
            }
            else if (n1 == 1){ // numbers
                int n2 = selectValue.nextInt(numbersLen);
                password.append(characters.numbers[n2]);
            }
            else{ // chars
                int n2 = selectValue.nextInt(specialCharsLen);
                password.append(characters.specialChars[n2]);
            }
        }

        System.out.println("Your randomly generated password is "+password);

    }

}