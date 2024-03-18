import java.util.Scanner;

public class Part2Uebung4_Passwortabfrage {


    /*Passwortabfrage
    Schreiben Sie ein Java-Programm, das den Benutzer auffordert, einen Benutzernamen
    und ein Kennwort einzugeben. Das Programm sollte den Benutzer wiederholt zur
    Eingabe eines Benutzernamens und eines Passworts aufzufordern, bis ein korrekter
    Benutzername und ein korrektes Passwort eingegeben werden oder die maximale
    Anzahl der Versuche erreicht ist.
    Der richtige Benutzername ist "user123" und das richtige Passwort ist "password123".
    Wenn der Benutzer falsche Anmeldedaten eingibt, sollte das Programm die Meldung
    "Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut." Wenn
    die maximale Anzahl von Versuchen erreicht ist, sollte das Programm die Meldung
    "Maximale Anzahl von Versuchen erreicht. Programm beenden." und das Programm
    beenden.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //für die Eingabe vom benutzer und vom passwort wird eine String Variable benötigt
        String eingabebenutzer;
        String eingabepassword;

        //Da wir den richtigen Use und das Kennwort kennen, müssen die beiden Variablen auch
        //initialisiert werden
        String benutzer = "user123";
        String passwort = "password123";

        //der Benutzer hat eine maximalanzahl vom Versuchen vorgebenen. Dafür benötigt man
        // eine int Variable und initialisiert sie zu beginn mit 0, da er ja noch keinen Versuch
        //getätigt hat
        int anzahleingabe = 0;


        //do-while-schleife: die schleife muss mindestens einmal durchlaufen (fußgesteuerte Schleife)
        do {
            //if-verzweigung: wenn der Benutzer die maximalen EIngabeversuche von GRÖSSER GLEICH 5 erreicht hat, dann wird er aus
            //der Schleife geschmissen. hierfür wird ein break gesetzt um die Schleife zu beenden.
            if (anzahleingabe >= 5) {
                System.out.println("Maximalemale Anzahl von Versuchen erreicht. Programm beenden.");
                break;

              //else-if-Verzweigung: oder wenn die anzahl der eingabe größer als 0 ist und kleiner als 5 wird der benutzer aufgefordert
              //die eingabe erneut zu starten
            } else if (anzahleingabe > 0 && anzahleingabe < 5) {
                //Ausgabe: die Anzahl der versuche werden durch die maximaleingabe minus der bereits falschen eingaben abgezogen und angezeigt
                System.out.println("Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut. " + (5 - anzahleingabe) + " Versuche verleiben.");

            }
            //zu Beginn als auch bei Fehlversuchen wird der Benutzer in der Do-while schleife aufgefordert Benutzer und Passwort einzugeben
            System.out.println("Bitte geben Sie Ihren Benutzernamen ein:");
            eingabebenutzer = scanner.next();

            System.out.println("Bitte geben Sie Ihr Passwort ein:");
            eingabepassword = scanner.next();
            anzahleingabe++;
        }
        //while: Abbruchbedingung: wenn der User den Benutzernamen und das Passwort richtig eingegeben haben.
        //solange der User den Benutzernamen und das Passwort falsch eingegeben haben läuft die Schleife.
        while ((!eingabebenutzer.equals(benutzer)) || (!eingabepassword.equals(passwort)));


    }


}
