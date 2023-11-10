package WhileLoops;

import java.util.Scanner;

public class WhileLoopsDemo {
    public static void main(String[] args) {

        // while loops ? executes a block of code as long as its condition remains true
/*
        Scanner in = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter your name please: ");
            name = in.nextLine();

        }

        System.out.println("Hello "+ name);
    }

 */

        Scanner in = new Scanner(System.in);
        String name = "";


        do {


            System.out.println("Enter your name ");
            name = in.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
    }


