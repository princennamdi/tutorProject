import java.util.Scanner;

public class inputOutput {

    static Scanner scanner;
    static String name;
    static int age;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        print("Welcome, Please insert your name: ");

        name = scanner.nextLine();

        print("Please insert your age(real age o!): ");

        age = scanner.nextInt();

        int rem = 60 - age;

        print("Welcome to the future " + name + " you have " + rem + " years to go");

    }


    public static void print(String message) {
        System.out.print(message);
    }
}
