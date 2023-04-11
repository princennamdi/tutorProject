import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileIO {

    static String Line;
    public static void main(String[] args) {

        File fl;
        Scanner sc;

        fl =  new File("C:\\edb\\textfile.txt");

        try {
            sc = new Scanner(fl);

            while(sc.hasNextLine()){
                Line = sc.nextLine();
                System.out.println(Line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }
}
