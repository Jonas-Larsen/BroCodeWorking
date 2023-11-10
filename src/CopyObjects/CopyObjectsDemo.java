package CopyObjects;

import Encapsulation.EncapsulationCarDemo;

public class CopyObjectsDemo {
    public static void main(String[] args) {

        CopyObjectsCarDemo car1 = new CopyObjectsCarDemo("Lamborghini", "Aventador", 2021);
        // CopyObjectsCarDemo car2 = new CopyObjectsCarDemo("Ferrari", "Spider", 2022);
        //car2.copy(car1);

        CopyObjectsCarDemo car2 = new CopyObjectsCarDemo(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
