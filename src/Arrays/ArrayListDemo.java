package Arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList = a resizeable array
        //             Elements can be added and removed after compilation phase (Which is normally impossible in normal arrays)
        //             Store reference data types
        //             If you need to store reference data types then use their "Wrapper class within the" <> instead
        ArrayList<String> food = new ArrayList<String>();

        food.add("Burger");
        food.add("Durum");
        food.add("Pizza");

        food.set(0, "Sushi"); // with the .set method you can replace stored data within the ArrayList by typing the index number the value you wanna change is at and the type the thing you want instead

        food.remove(2); // This can be used to remove something at a certain index  from your ArrayList

        food.clear(); // can be used to clear the whole ArrayList
        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
