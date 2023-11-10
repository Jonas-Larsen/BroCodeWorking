package printF;

public class PrintFDemo {
    public static void main(String[] args) {

        // printf() = an optional method toi control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [Width] [conversation-character]
        //            The [conversation-characters] are listed below:
        //            After the "%" you can use "d" to display an integer/numbers
        //            After the "%" you can use "b" to display a boolean
        //            After the "%" you can use "c" to display a character
        //            After the "%" you can use "s" to display a String
        //            After the "%" you can use "f" to display a double



       //  System.out.printf("% This is a format string ", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Jonas";
        int myInt = 50;
        double myDouble = 1000;

        // [conversation-character]
        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble);

        // [Width]
        // Minimum number of characters to be written as output
        //System.out.printf("Hello %10s", myString);


        //[Precision]
        // sets number of digits of precision when outputtng floating-point values
        // System.out.printf("You have this much money %.5f", myDouble);

        //[Flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        // left justify below:
        // System.out.printf("You have this much money %-20f", myDouble);

        // + below:
        //System.out.printf("You have this much money %+f", myDouble);

        // 0 below:
        //System.out.printf("You have this much money %020f", myDouble);

        // , below:
        // System.out.printf("You have this much money %,f", myDouble);


    }
}
