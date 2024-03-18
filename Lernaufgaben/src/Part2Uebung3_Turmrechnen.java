import java.util.Scanner;

public class Part2Uebung3_Turmrechnen {

    /*Turmrechnen
    Bestimmt kennen Sie noch das gute alte Turmrechnen, erstellen Sie eine Turmrechnung,
    welche den nachfolgenden Output hat
     */

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

        //for-Schleife: zähle i wird auf 1 gesetzt (da multipliziert wird) Abbruchbedingung: wenn zähler i GRÖSSER als 9 ist.
        //solange zähler i KLEINER GLEICH 9 ist läuft die schleife. i zählt hoch.
        for (int i = 1; i <= 9; i++) {

            //if-Verzweigung: Wenn zähler i = 1 ist, dann soll er die summeneu ausgeben.
            //in diesem fall die ist dies dann die eingegebene zahl zB Eingabe: 123 * 1 = 123
            if (i == 1) {
                //beim ersten Durchlauf in der Schleife gibt es noch keine summealt
                System.out.println(summeneu);

            //else-Verzweigung: sonst soll er die Berechnung durchführen. Die summealt wird auf die variable
            //summeneu geschrieben. Die summeneu ist dann die summealt multipliziert mit dem zähler i, der in der
            //schleife bis 9 hochzählt
            } else {
                summealt = summeneu;
                summeneu = summealt * i;

                //ausgabe: die vorherige summe steht auf der linken seite und die neue summe auf der rechten
                //um einen Turm anzeigen zu können
                System.out.println(summealt + " * " + i + " = " + summeneu);
            }

        }

        //for-Schleife: das gleiche wird nun mit der Division gemacht.
        //unterschied: zähler i wird auf 2 gesetzt für die Division
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

        //für die while-schleife wird ein zähler deklariert und initialisiert
        int i = 1;

        //while-Schleife: Abbruchbedingung: wenn zähler i GRÖSSER als 9 ist. Solange i KLEINER GLEICH 9 ist,
        //läuft die Schleife.
        while (i <= 9) {

            //gleiche if-else-Verzweigung wie bei der for-schleife
            //beim ersten Durchlauf in der Schleife gibt es noch keine summealt
            if (i == 1) {
                System.out.println(summeneu);
            } else {
                summealt = summeneu;
                summeneu = summealt * i;
                System.out.println(summealt + " * " + i + " = " + summeneu);
            }
            //unterschied zur for-schleife: der Zähler i wird erst am Ende hochgezählt und nicht im Kopf
            i++;

        }

        //zähler wird deklariert mit j und initialisiert mit 2 für die division.
        int j = 2;

        while (j <= 9) {
            summealt = summeneu;
            summeneu = summealt / j;
            System.out.println(summealt + " / " + j + " = " + summeneu);
            j++;
        }
    }

}