package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        /* abstract = abstract classes cannot be instantiated, but they can have a subclass
                      abstract methods are declared without an implementation
         */

        // AbstractionVehicleDemo vehicle = new AbstractionVehicleDemo(); Since the Vehicle class is abstract we cant instantiate a vehicle


        AbstractionCarDemo car = new AbstractionCarDemo();

        car.go();



    }
}
