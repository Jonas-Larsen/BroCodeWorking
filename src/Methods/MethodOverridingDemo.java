package Methods;

public class MethodOverridingDemo {
    public static void main(String[] args) {


    /* Method overriding = Declaring a method in a subclass,
                           which is already present in parent class.
                           done so that a child class can give its own implementation of that method.
     */
MethodOverridingAnimalDemo animal = new MethodOverridingAnimalDemo();
        MethodOverrindingDogDemo dog = new MethodOverrindingDogDemo();

        animal.speak();
        dog.speak();


    }
}