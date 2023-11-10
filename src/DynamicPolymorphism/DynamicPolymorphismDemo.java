package DynamicPolymorphism;

import java.util.Scanner;

public class DynamicPolymorphismDemo {
    public static void main(String[] args) {

        /* polymorphism = may shapes/forms
           dynamic      = after compilation (during runtime)

           f.eks: A corvette is a: corvette, and a car, a vehicle and an object
         */

        Scanner in = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println();
        System.out.print("(1=dog) or (2=cat): ");
        int choice = in.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice==2) {
            animal = new Cat();
            animal.speak();

        }else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }


    }
}
