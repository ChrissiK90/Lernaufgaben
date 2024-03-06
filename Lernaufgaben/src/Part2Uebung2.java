import java.util.Scanner;

public class Part2Uebung2 {

    //Ungerade Zahlenausgabe

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ganzezahl = 1;

        System.out.print("Bitte geben Sie eine positive, ganze Zahl ein: ");
        ganzezahl = scanner.nextInt();

        for (int i = 0; i <= ganzezahl; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
