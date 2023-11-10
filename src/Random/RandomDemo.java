package Random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println("\n" +x);
        System.out.println("\n"+ y);
        System.out.println("\n"+z);
    }
}
