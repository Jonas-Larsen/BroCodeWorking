package Arrays;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {

        //2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during the runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("Pasta");
        bakerylist.add("Donuts");
        bakerylist.add("Garlic bread");


        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("peppers");
        produceList.add("Ketchup");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Milk");
        drinksList.add("Soda");
        drinksList.add("Vodka");

        groceryList.add(bakerylist);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(1));

    }
}
