package Methods;

public class OverloadedMethodsDemo {
    public static void main(String[] args) {

        // Overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature


        int x = add(1,2);
        System.out.println(x +"\n");

        int y = add(1,2,3);
        System.out.println(y + "\n");

        int z = add(1,2,3,4);
        System.out.println(z + "\n");

        double q = add(2.7, 4.5);
        System.out.println(q + "\n");

        double w = add(9.3,5.4,9.7);
        System.out.println(w + "\n");

        double p = add(7.2,8.3,10.4,15.3);
        System.out.println(p + "\n");
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
    return a + b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method #4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}
