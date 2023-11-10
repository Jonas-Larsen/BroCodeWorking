package NestedLoops;

import java.util.Scanner;

public class NestedLoopsDemo {
    public static void main(String[] args) {
        // Nested loops = a loop inside of another  loop this also works in while loops


        Scanner in = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter a # of rows: ");
        rows = in.nextInt();
        System.out.println("Emter a # of columns: ");
        columns = in.nextInt();
        System.out.println("Enter the symbol you would like to use: ");
        symbol = in.next();

        for (int i = 1; i<=rows; i++){
            System.out.println();
            for (int j=1; j<= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
