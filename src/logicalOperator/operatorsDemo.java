package logicalOperator;

import java.util.Scanner;

public class operatorsDemo {
    public static void main(String[] args) {


        // logical operators = used to connect two or more expressions
        //
        // && = (AND) both conditions must be true
        // || (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

       /* int temp = 18;
        // && eksempel
        if (temp> 30) {
            System.out.println("It is damn hot outside");

        } else if (temp >= 20 && temp <=30) {
            System.out.println("It is warm outside ");
        }else {
            System.out.println("it is cold outside");
        }

        */

       /*

       // || eksempel
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game, press q or Q to quit the game");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")){
            System.out.println("You chose to quit the game ");
        }else {
            System.out.println("You chose to continue the game *pew pew *");
        }

        */

        // ! eksempel
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game, press q or Q to quit the game");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You chose to continue the game *pew pew *");

        } else {
            System.out.println("You chose to quit the game ");

        }
    }
}
