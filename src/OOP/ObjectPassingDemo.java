package OOP;

public class ObjectPassingDemo {

    public static void main(String[] args) {

        ObjectPassingGarageDemo garage = new ObjectPassingGarageDemo();

        ObjectPassingCarDemo car1 = new ObjectPassingCarDemo("Ford");
        ObjectPassingCarDemo car2 = new ObjectPassingCarDemo("Tesla");


        garage.park(car1);
        garage.park(car2);


    }
}
