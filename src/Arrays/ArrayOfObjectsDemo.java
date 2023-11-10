package Arrays;

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {

       // ArrayOfObjectsFoodDemo[] refrigerator = new ArrayOfObjectsFoodDemo[3];

        ArrayOfObjectsFoodDemo food1 = new ArrayOfObjectsFoodDemo("Pizza");
        ArrayOfObjectsFoodDemo food2 = new ArrayOfObjectsFoodDemo("Rye bread");
        ArrayOfObjectsFoodDemo food3 = new ArrayOfObjectsFoodDemo("Hotdog");

        ArrayOfObjectsFoodDemo[] refrigerator = {food1, food2, food3};

       // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
