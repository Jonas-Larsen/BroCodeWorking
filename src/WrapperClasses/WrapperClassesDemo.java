package WrapperClasses;

public class WrapperClassesDemo {
    public static void main(String[] args) {
         // Wrapper class = provides a way to use primitive data types as reference data types
        //                  reference data types contain useful methods
        //                  can be used with collections (ex.ArrayList)



        // Primitive        // Wrapper
        //-----------       //----------
        //boolean           //Boolean
        //char              // Character
        //int               //Integer
        //double            //Double


        //AutoBoxing = the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
        //Unboxing = the revers of autoboxing. Automatic conversion of wrapper class to primitive


        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e ="Jonas";

        // try to type in the name of your variable f.eks. "a" then put a . afterwards to see the methods that are commenly used on this type of data


        if (a==true){
            System.out.println("This is true ");

            // so you can still treat these reference data types as if they were primitive
        }





    }
}
