import java.util.Scanner;

public class Part2Uebung2_PositiveZahl {

    /*Ungerade Zahlenausgabe
    Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine positive ganze Zahl
    einzugeben, und dann alle ungeraden Zahlen von 1 bis zu dieser ganzen Zahl in der
    Konsole ausgibt.
     */

    public static void main(String[] args) {

        //Scanner für Benutzereingabe erstellen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine positive, ganze Zahl ein: ");

        //variable deklarieren und mit scanner.nextint initialisieren (vom Benutzer)
        int ganzezahl = scanner.nextInt();

        //Um ALLE ungerade zahlen der eingegebenen auszugeben wird eine for-schleife verwendet
        //variable i = zähler, wird mit 0 initialisiert. Abbruchbedingung: wenn i GRÖSSER ist als eingegebene Zahl.
        // Solange i kleiner-gleich der eingegebenen Zahl ist, läuft die Schleife. Zähler i wird hochgezählt
        for (int i = 0; i <= ganzezahl; i++) {

            //verzweigung mit modulo: wenn Rest nicht 0 ergibt, dann ist es eine ungerade Zahl
            //alternative: i % 2 == 1
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
