package OOP;

public class OverloadedConstructorsPizzaDemo {

    String bread;
    String sauce;
    String cheese;
    String topping;

    OverloadedConstructorsPizzaDemo(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    OverloadedConstructorsPizzaDemo(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    OverloadedConstructorsPizzaDemo(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    OverloadedConstructorsPizzaDemo(String bread){
        this.bread = bread;
    }
}
