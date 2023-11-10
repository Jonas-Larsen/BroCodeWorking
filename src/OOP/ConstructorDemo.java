package OOP;

public class ConstructorDemo {
    public static void main(String[] args) {

        // Constructor = special method that is called when an object is instantiated (created)

        ConstructorHumanDemo human1 = new ConstructorHumanDemo("Rick", 65, 75.5);
        ConstructorHumanDemo human2 = new ConstructorHumanDemo("Morty", 16, 55.5);

        //System.out.println(human1.name);
        //System.out.println(human2.name);

        human1.eat();
        human2.drink();


    }
}
