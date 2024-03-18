import java.util.Scanner;

public class Part1Uebung1_Eingabeaufforderung {

    /*Eingabeaufforderung
    Schreiben Sie ein Java-Programm, das den Benutzer auffordert, seinen Namen und sein
    Alter einzugeben, und dann eine Meldung ausgibt, die lautet: "Hallo, [Name]! Du bist
    [Alter] Jahre alt."
    */

    public static void main(String[] args) {

        //Variable String für den Namen erstellen
        String name;

        //das Objekt Scanner wird für die Benutzereingabe erstellt
        Scanner scanner = new Scanner(System.in);

        //Abfrage über System out um den Benutzer zu bitten seinen Namen einzugeben
        System.out.println("Bitte Namen eingeben:");

        //Variable name wird mit dem scanner initialisiert
        name = scanner.next();

        //Abfrage über System out um den Benutzer zu bitten seinen Namen einzugeben
        System.out.println("Bitte Alter eingeben:");

        //Variable age wird mit dem scanner initialisiert
        int age = scanner.nextInt();

        //Ausgabe mit den vom Benutzer eingegeben Variablen
        System.out.println("Hallo " + name + "! Du bist " + age + " Jahre alt.");


    }
}
