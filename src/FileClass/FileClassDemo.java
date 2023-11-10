package FileClass;

import java.io.File;

public class FileClassDemo {
    public static void main(String[] args) {
        // File = An abstract representation of file and directory path-names
        //        If your file is in your project folder you only have to type the name of the file + .txt
        //        Else you need to go to the files "properties/egenskaber" and copy its location

        // I created a tekst/text Document on my desktop and copied it onto the project-Name and that created a txt.file



        File file = new File("C:\\Users\\Jonas\\OneDrive\\Skrivebord\\secret_message.txt");


        if (file.exists()){
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());  // is going to display the name of the file
            System.out.println(file.getAbsolutePath());  // Is going to display where in your computer the file is at
            System.out.println(file.isFile()); // will return "true" or "false" depending on rather your file is a file or not
            file.delete();
        }
        else {
            System.out.println("That file dosen't exist :( ");
        }



    }
}
