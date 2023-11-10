package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        /* inheritance = the process where one class acquires,
                      the attributes and methods of another class
         */

        InheritanceCarDemo car = new InheritanceCarDemo();
        car.go();
        System.out.println(car.speed);

        System.out.println(car.doors);


        InheritanceBicycleDemo bike = new InheritanceBicycleDemo();
        bike.stop();
        System.out.println(bike.speed);
        System.out.println(bike.pedels);
    }
}
