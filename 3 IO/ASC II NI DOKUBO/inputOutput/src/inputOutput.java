import java.util.Scanner;

public class inputOutput {

    static Scanner scanner;
    static String name;
    static int age;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        print("Hi, Please enter your name");
        name = scanner.nextLine();

        print("Please enter your age");
        age = scanner.nextInt();

        int rem = 60 - age;
        print("Your name is " + name + ". You are " + age + " years old.\nYou have " + rem+ " years remaining in this service.");


    }

    public static void print(String text){
        System.out.println(text);
    }

}
