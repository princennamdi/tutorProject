import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileIO {
    public static void main(String[] args) {

        File fl;
        Scanner sc;
        String line;

        fl = new File("c:\\del\\textfile.exe"  );

        try {
            sc = new Scanner(fl);

            while (sc.hasNextLine()) {

                line = sc.nextLine( );
                System.out.println(line);

            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
