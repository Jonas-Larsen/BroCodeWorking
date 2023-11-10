package scanners;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("And how old are you? ");
        int age = in.nextInt();
        System.out.println("What is your favorite food? ");
        in.nextLine();
        String food = in.nextLine();


        System.out.println("Hello " + name + " and you are " + age + " years old" + " And your facorite food is: " + food);



    }
}
