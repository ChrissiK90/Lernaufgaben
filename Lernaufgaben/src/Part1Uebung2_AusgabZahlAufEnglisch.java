import java.util.Scanner;

public class Part1Uebung2_AusgabZahlAufEnglisch {

    /*Nummer in Woerter konvertieren
    Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine Zahl zwischen 1
    und 10 (einschließlich) einzugeben, und dann das englische Wort für diese Zahl ausgibt.
    Wenn der Benutzer eine ungültige Zahl eingibt, sollte das Programm eine Fehlermeldung
    ausgeben und den Benutzer auffordern, erneut eine gültige Zahl einzugeben.

    1. Wenn das Programm startet, soll es den Benutzer auffordern, eine Zahl zwischen
       1 und 10 (einschließlich) einzugeben.
    2. Wenn der Benutzer eine ungültige Zahl eingibt, sollte das Programm die folgende
       Fehlermeldung ausgeben: "Ungültige Zahl eingegeben. Bitte geben Sie eine Zahl
       zwischen 1 und 10 (einschließlich) ein".
    3. Das Programm sollte den Benutzer so lange auffordern, eine gültige Zahl
       einzugeben, bis der Benutzer eine Zahl zwischen 1 und 10 (einschließlich) eingibt.
    4. Sobald der Benutzer eine gültige Zahl eingibt, sollte das Programm das englische
       Wort für diese Zahl ausgeben. Das englische Wort sollte in Kleinbuchstaben
       ausgegeben werden
    5. Nachdem das englische Wort für die Zahl ausgegeben wurde, sollte das
       Programm beendet werden
    */

    public static void main(String[] args) {


        //Variable num deklarieren
        int num;

        //Scanner für Benutzereingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein:");

        //Initialisieren der Variable vom Benutzer
        num = scanner.nextInt();


        //While-schleife setzen: solange die eingegebene Zahl kleiner als 1 und größer als 10 ist.
        //Der Benutzer bleibt solange in der Schleife stecken, bis er eine Zahl von 1 bis 10 eingegeben hat.
        while (num < 1 || num > 10) {
            System.out.println("Ungültige Zahl eingegeben. Bitte geben Sie eine Zahl zwischen 1 und 10 (einschließlich) ein");
            num = scanner.nextInt();


            //if-else-Verzweigung: wenn die eingegebene Zahl 1 ist, dann soll das englische wort "one" ausgegeben werden, usw.
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

}

