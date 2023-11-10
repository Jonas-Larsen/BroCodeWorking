package VariableScope;

import java.util.Random;

public class DiceRollerDemo {

    /* Eksempel 1:
    DiceRollerDemo(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

     */

    // Eksempel 2:
    Random random;
    int number = 0;
    DiceRollerDemo(){
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
