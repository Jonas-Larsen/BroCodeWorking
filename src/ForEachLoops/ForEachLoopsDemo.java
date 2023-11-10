package ForEachLoops;

import java.util.ArrayList;

public class ForEachLoopsDemo {

    public static void main(String[] args) {

        // For-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexiable


       // String[] animals = {"Cat", "Dog", "Eagle", "Rabbit"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add("Eagle");

        for(String i : animals) {
            System.out.println(i);

        }
    }

}
