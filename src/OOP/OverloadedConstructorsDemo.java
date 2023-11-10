package OOP;

public class OverloadedConstructorsDemo {
    public static void main(String[] args) {
        // Overloaded constructors = multiple constructors within a class with the same name
        //                           but have different parameters
        //                           name + parameters = signature

        OverloadedConstructorsPizzaDemo pizza = new OverloadedConstructorsPizzaDemo("Thicc crust", "Tomato", "Mozzerella", "Pepperoni");

        System.out.println("Here are the ingredients of your first pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println();

        OverloadedConstructorsPizzaDemo pizza1 = new OverloadedConstructorsPizzaDemo("Thicc crust", "Tomato", "Mozzerella");
        System.out.println("Here are the ingredients of your second pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println();

        OverloadedConstructorsPizzaDemo pizza2 = new OverloadedConstructorsPizzaDemo("Thicc crust", "Tomato");
        System.out.println("Here are the ingredients of your third pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println();

        OverloadedConstructorsPizzaDemo pizza3 = new OverloadedConstructorsPizzaDemo("Thicc crust");
        System.out.println("Here are the ingredients of your forth pizza");
        System.out.println(pizza3.bread);
        System.out.println();
    }


}
