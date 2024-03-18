import java.util.Scanner;

public class Part1Uebung3_Bankomatbedienung {


    /*Bankomatbedienung
    Schreiben Sie ein Java-Programm, das Bankkontotransaktionen simuliert. Das
    Programm sollte den Benutzer auffordern, seinen Kontostand einzugeben, und ihm dann
    ein Menü mit Optionen für die Durchführung von Transaktionen präsentieren.

    Wenn der Benutzer die Option 1 oder 2 wählt, sollte das Programm den Benutzer
    auffordern, den Betrag der Transaktion einzugeben. Wenn der Benutzer die Option 3
    wählt, sollte das Programm den aktuellen Kontostand anzeigen. Wenn der Benutzer die
    Option 4 wählt, sollte das Programm beendet werden.
    Ihr Programm sollte das folgende Verhalten aufweisen:
    1. Wenn das Programm startet, sollte es den Benutzer auffordern, seinen Kontostand
       einzugeben.
    2. Das Programm sollte den Benutzer so lange auffordern, eine Option auszuwählen
       und Transaktionen durchzuführen, bis der Benutzer den Vorgang mit der Option
       (4) Exit, beendet.
    3. Wenn der Benutzer die Option 1 oder 2 wählt, sollte das Programm den Benutzer
       auffordern, den Betrag der Transaktion einzugeben. Das Programm sollte dann
       den Kontostand entsprechend aktualisieren und eine Meldung über den Erfolg der
       Transaktion anzeigen.
    4. Wenn der Benutzer die Option 3 wählt, sollte das Programm den aktuellen
       Kontostand anzeigen.
    5. Wenn der Benutzer die Option 4 wählt, sollte das Programm beendet werden.
     */


    public static void main(String[] args) {

        //Deklarieren und teilw. initialiseren der Variablen
        double balance;
        int choice = 0;
        double transaction;

        //Objekt Scanner setzen für Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        //Aufforderung der Eingabe vom Kontostand
        System.out.println("Enter your account balance:");

        //Deklaration und initialisierung der variable über scanner
        balance = scanner.nextDouble();



        //While-Schleife: Der Benutzer wird solange in der Schleife gehalten bis er 4 für exit wählt
        while (choice != 4) {

            //Das Menü wird aufgerufen und der Benutzer wird aufgefordert eine ganze Zahl einzugeben um eine Funktion zu wählen
            System.out.printf("Menue:\n1. Deposit\n2.Withdraw\n3. Check balance\n4. Exit\nEnter your choice:");
            choice = scanner.nextInt();

            //if-Verzweigung: Wenn der Benutzer 1 wählt, dann wird er gebeten die einzulegende Summe einzugeben
            if (choice == 1) {
                System.out.println("Select transaction amount:");
                transaction = scanner.nextDouble();

                //Berechnung: der Kontostand wird dann mit der eingegbenen Summe addiert
                balance = balance + transaction;

                //Ausgabe, dass die Transaktion erfolgreich war und der aktuelle Kontostand wird angezeigt
                System.out.println("Your transaction was successful. Your current account balance is " + balance + " Euro.");

                //else-if-Verzweigung: oder Wenn der Benutzer 2 wählt, dann wird er gebeten die abzuhebende Summe einzugeben
            } else if (choice == 2) {
                System.out.println("Select transaction amount:");
                transaction = scanner.nextDouble();

                //Berechnung: vom Kontostand wird die eingegebene Summe abgezogen
                balance = balance - transaction;

                //Ausgabe, dass die Transaktion erfolgreich war und der aktuelle Kontostand wird angezeigt
                System.out.println("Your transaction was successful. Your current account balance is " + balance + " Euro.");

                //else-if-Verzweigung: oder der aktuelle Kontostand soll angezeigt werden
            } else if (choice == 3) {
                System.out.println("Your current account balance is " + balance + " Euro.");
            }

        }
    }
}




