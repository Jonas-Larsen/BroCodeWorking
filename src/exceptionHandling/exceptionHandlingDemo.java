package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandlingDemo {
    public static void main(String[] args) {


        /* exception = an event that occurs during the execution of a program that,
                       disrupts the normal flow of instructions
           Finally   = Something most people use to close their scanners.
         */
        Scanner in = new Scanner(System.in);
        try {




            System.out.println("Enter a whole number to divide: ");
            int x = in.nextInt();

            System.out.println("Enter another whole number to divide by: ");
            int y = in.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);

        } catch (ArithmeticException e) {
            System.out.println("You cant divide by 0! you IDIOT!!");
        } catch (InputMismatchException e) {
            System.out.println("I said please enter a number!!!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            in.close();
        }

    }
}

