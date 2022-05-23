import java.util.Random;

public class DiceRoller {

    Random rand;
    int number;
    DiceRoller(){
        rand = new Random();
        RollDice();
    }

    void RollDice(){
        number = rand.nextInt(6)+1;
        System.out.println(number);

    }
}


