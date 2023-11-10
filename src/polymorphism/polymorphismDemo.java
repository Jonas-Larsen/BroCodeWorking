package polymorphism;

public class polymorphismDemo {
    public static void main(String[] args) {

        /* polymorphism = greek word for poly-"many", morph-"forms"
                          The ability of an object to identify as more than one datatype.
         */

        polymorphismCar car = new polymorphismCar();
        polymorphismBicycle bicycle = new polymorphismBicycle();
        polymorphismBoat boat = new polymorphismBoat();

       polymorphismVehicle[] racers = {car,bicycle,boat};

       for (polymorphismVehicle x : racers){
           x.go();
       }


    }
}
