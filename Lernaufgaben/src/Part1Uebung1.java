import java.util.Scanner;

public class Part1Uebung1 {

    //Eingabeaufforderung

    public static void main(String[] args) {


        String name;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Namen eingeben:");
        name = scanner.next();
        System.out.println("Bitte Alter eingeben:");
        int age = scanner.nextInt();
        System.out.println("Hallo " + name + "! Du bist " + age + " Jahre alt.");


    }
}
