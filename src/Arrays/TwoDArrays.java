package Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        //2D arrays = an array of arrays
 /*
        String[][] cars = new String[3][3];

        cars[0][0] = "Tesla";
        cars[0][1] = "BMW";
        cars[0][2] = "Porsche";
        cars[1][0] = "Mustang";
        cars[1][1] = "Bugatti";
        cars[1][2] = "Peagueot";
        cars[2][0] = "Ferrari";
        cars[2][0] = "Lincoln";
        cars[2][1] = "Range Rover";
        cars[2][2] = "Lamborghini";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

  */
        String[][] cars = {{"Camaro", "Corvette", "Silverado"},
                           {"Mustang", "Range rover", "Ferrari"},
                           {"Lambo", "Bugatti", "Tesla"}};

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");


            }

        }
        System.out.println();
    }
}
