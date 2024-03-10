import java.util.Scanner;

public class Part2Uebung3_Turmrechnen {

    //Turmrechnen

    public static void main(String[] args) {

        forschleife();
        whileschleife();

    }

    public static void forschleife() {

        Scanner scanner = new Scanner(System.in);

        int zahl;
        int summealt;
        int summeneu = 0;

        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
        zahl = scanner.nextInt();
        summeneu = summeneu + zahl;

        for (int i = 1; i <= 9; i++) {
            if (i == 1) {                       //beim ersten Durchlauf in der Schleife gibt es noch keine summealt
                System.out.println(summeneu);
            } else {
                summealt = summeneu;
                summeneu = summealt * i;
                System.out.println(summealt + " * " + i + " = " + summeneu);
            }

        }
        for (int i = 2; i <= 9; i++) {
            summealt = summeneu;
            summeneu = summealt / i;
            System.out.println(summealt + " / " + i + " = " + summeneu);
        }

    }

    public static void whileschleife() {

        Scanner scanner = new Scanner(System.in);

        int zahl;
        int summealt;
        int summeneu = 0;

        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
        zahl = scanner.nextInt();
        summeneu = summeneu + zahl;

        int i = 1;

        while (i <= 9) {
            if (i == 1) {                       //beim ersten Durchlauf in der Schleife gibt es noch keine summealt
                System.out.println(summeneu);
            } else {
                summealt = summeneu;
                summeneu = summealt * i;
                System.out.println(summealt + " * " + i + " = " + summeneu);
            }
            i++;

        }
        int j = 2;

        while (j <= 9) {
            summealt = summeneu;
            summeneu = summealt / j;
            System.out.println(summealt + " / " + j + " = " + summeneu);
            j++;
        }
    }

}