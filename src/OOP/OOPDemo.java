package OOP;

public class OOPDemo {

    // object = an instance of a class that may contain attributes (charectaristics)  and methods (What it can do)
    // example: (phone, desk, computer, water cup)
    public static void main(String[] args) {


        OOPCarDemo myCar1 = new OOPCarDemo();
        OOPCarDemo myCar2 = new OOPCarDemo();

        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println(myCar1.price);
        System.out.println(myCar1.color);
        System.out.println(myCar1.year);

        System.out.println();


        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
        System.out.println(myCar2.price);
        System.out.println(myCar2.color);
        System.out.println(myCar2.year);

       // myCar.drive();

        // myCar.brake();

    }
}