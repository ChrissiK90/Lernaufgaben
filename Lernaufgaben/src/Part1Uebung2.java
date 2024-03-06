import java.util.Scanner;

public class Part1Uebung2 {

    //Nummer in Woerter konvertieren

    public static void main(String[] args) {

        int num = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein:");
        num = scanner.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Ungültige Zahl eingegeben. Bitte geben Sie eine Zahl zwischen 1 und 10 (einschließlich) ein");
            num = scanner.nextInt();
        }
        if (num == 1) {
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("two");
        } else if (num == 3) {
            System.out.println("three");
        } else if (num == 4) {
            System.out.println("four");
        } else if (num == 5) {
            System.out.println("five");
        } else if (num == 6) {
            System.out.println("six");
        } else if (num == 7) {
            System.out.println("seven");
        } else if (num == 8) {
            System.out.println("eight");
        } else if (num == 9) {
            System.out.println("nine");
        } else if (num == 10) {
            System.out.println("ten");
        }


    }


}

