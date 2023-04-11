import java.util.Scanner;

public class inputOutput {

    static String name;
    static int age;

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        print("what is your name");
        name = scan.nextLine();

        print("what is your age");
        age = scan.nextInt();

        print("your name is " + name);
        print("your age is " + age);



    }

    public static void print(String message){
        System.out.println(message);
    }
}
