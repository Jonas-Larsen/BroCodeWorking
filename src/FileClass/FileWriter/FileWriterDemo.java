package FileClass.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {


        FileWriter writer;

        {
            try {
                writer = new FileWriter("poem.txt");
                writer.write("Roses are red \nViolets are blue \n booty booty booty booty \n Rockin everywhere ");
                writer.append("\n (A poem by Jonas)");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}