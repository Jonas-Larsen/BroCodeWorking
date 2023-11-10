package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        /* Interface = a template that can be applied to a class.
                       similar to inheritance, but specifies what a class has/must do.
                       classes can apply more than one interface, whereas inheritance is limited to 1 super
         */

        InterfaceHawk hawk = new InterfaceHawk();

        hawk.hunt();

        System.out.println();

        InterfaceRabbit rabbit = new InterfaceRabbit();

        rabbit.flee();

        System.out.println();

        InterfaceFish fish1 = new InterfaceFish();
        InterfaceFish fish2 = new InterfaceFish();

        System.out.println();

        fish1.hunt();

        System.out.println();


        fish2.flee();

    }
}
