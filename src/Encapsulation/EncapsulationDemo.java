package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

        /* Encapsulation = attributes of a class will be hidden or private,
                           Can be accessed only through methods (Getters & Setters)
                           You should make attributes private if you don't have a reason to make them public/protected.
         */

        EncapsulationCarDemo car = new EncapsulationCarDemo("Lamborghini", "Aventador", 2021);



        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
