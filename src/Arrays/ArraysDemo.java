package Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // Arrays = used to store multiple values in a single variable
        // Make sure the dataType matches the data you want to store in the Array

        /*
        String[] cars = {"Tesla", "BMW", "Rams", "Porsche"};

        cars[0] = "Mustang";
        System.out.println(cars[3]);

         */

        String[] cars = new String[3];

        cars[0] = "porsche";
        cars[1] = "BMW";
        cars[2] = "Tesla";

        for (int i = 0; i <cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
