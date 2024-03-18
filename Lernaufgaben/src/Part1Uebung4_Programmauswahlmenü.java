import java.util.Scanner;

public class Part1Uebung4_Programmauswahlmenü {


    /*Programmauswahlmenue
    1. Schreiben Sie ein Programm, das den Benutzer auffordert, eine Zeichenfolge
       einzugeben, und dann die Zeichenfolge in umgekehrter Reihenfolge ausgibt.
       Wenn der Benutzer zum Beispiel "Hallo" eingibt, soll das Programm "olleh"
       ausgeben.
    2. Schreibe ein Programm, das den Benutzer auffordert, eine ganze Zahl
       einzugeben, und dann prüft, ob die ganze Zahl gerade oder ungerade ist. Das
       Programm soll eine Meldung ausgeben, die angibt, ob die ganze Zahl gerade oder
       ungerade ist.
    3. Schreiben Sie ein Programm, das den Benutzer auffordert, einen Satz
       einzugeben, und dann die Anzahl der Vokale in diesem Satz zählt. Für die Zwecke
       dieses Programms sind die Vokale 'a', 'e', 'i', 'o' und 'u'.
    4. Schreibe ein Programm, das den Benutzer auffordert, eine positive ganze Zahl
       einzugeben, und dann die Fakultät dieser ganzen Zahl ausgibt. Die Fakultät von n
       ist das Produkt aller positiven ganzen Zahlen bis einschließlich n. Die Fakultät von
       5 ist zum Beispiel 5 * 4 * 3 * 2 * 1 = 120.
     */

    public static void main(String[] args) {



        int menu = 0;

        //while-Schleife: Abbruchbedingung: 5 für Exit. Der Benutzer wird solange in der Schleife gehalten, solage er nicht 5 wählt.
        while (menu != 5) {
            System.out.println("\nBitte waehlen Sie eine Option aus, indem Sie die Zahl der Option eingeben:\n1. Umgekehrte Stringeingabe\n2. Pruefen ob eine Zahl gerade oder ungerade ist.\n3. Vokale zaehlen\n4. Fakultaet berechnen\n5. Beenden");

            Scanner scanner = new Scanner(System.in);

            menu = scanner.nextInt();

            //Switch-Verzweigung für menü-wahl: 1-5  ---> switch ist nur eine true/false abfrage, es kann hier keine spannweite (zB <=5) angegeben werden
            switch (menu) {
            //wenn 1 gewählt wird, wird die erste Methode aufgerufen  usw
                case 1:
                    substring();
            //break bringt das Programm dazu, aus dem switch komplett rauszuspringen
                    break;
                case 2:
                    geradezahl();
                    break;
                case 3:
                    vokale();
                    break;
                case 4:
                    positiv();
                    break;
                case 5:
                    break;
            //default gibt Meldung zurück, dass Eingabe falsch war
                default:
                    System.out.println("Bitte waehlen Sie eine Option von 1-5 aus.");
            }
        }

    }

    //void-Methode gibt keinen Wert zurück
    public static void substring() {

        /*
         1. Schreiben Sie ein Programm, das den Benutzer auffordert, eine Zeichenfolge
            einzugeben, und dann die Zeichenfolge in umgekehrter Reihenfolge ausgibt.
            Wenn der Benutzer zum Beispiel "Hallo" eingibt, soll das Programm "olleh"
            ausgeben.
         */

        String word;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein Wort ein:");
        word = scanner.next();

        int anzahl = word.length();


        //for Schleife: die variable i ist das eingegebene Wort. Abbruchbedingung: i darf nicht KLEINER als 0 sein.
        //solange i größer als 0 ist, geht die schleife. der zähler zählt runter. Es wird von hinten an gezählt (verkehrt herum)
        for (int i = anzahl; i > 0; i--) {

        //.substring gibt die angegebenen Zeichen an. i-1 ist also hinter dem letzten zeichen, i ist vor dem letzten zeichen.
            System.out.print(word.substring(i - 1, i));
        }
    }

    public static void geradezahl() {

        /*
       2. Schreibe ein Programm, das den Benutzer auffordert, eine ganze Zahl
       einzugeben, und dann prüft, ob die ganze Zahl gerade oder ungerade ist. Das
       Programm soll eine Meldung ausgeben, die angibt, ob die ganze Zahl gerade oder
       ungerade ist.
         */

        Scanner scanner = new Scanner(System.in);

        int zahl;
        System.out.println("Bitte geben Sie eine Zahl ein:");
        zahl = scanner.nextInt();

        //% = "Modulo" = Berechne den Rest der Division
        int rest = zahl % 2;

        //wenn der rest 1 ergibt, dann ist es eine ungerade zahl, bei 0 ist es eine gerade zahl
        if (rest == 1) {
            System.out.println("Zahl ist eine ungerade Zahl");
        } else {
            System.out.println("Zahl ist eine gerade Zahl");
        }
    }

    public static void vokale() {

       /*
       3. Schreiben Sie ein Programm, das den Benutzer auffordert, einen Satz
       einzugeben, und dann die Anzahl der Vokale in diesem Satz zählt. Für die Zwecke
       dieses Programms sind die Vokale 'a', 'e', 'i', 'o' und 'u'.
       */

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bitte geben Sie einen Satz ein (Groß/Kleinschreibung wird berücksichtig):");

        //scanner.nextLine weil hier ein Satz eingegeben wird und nicht nur ein wort
        String satz = scanner.nextLine();

        //toLowerCase bedeutet, es ist egal ob der Benutzer groß oder kleinschreibung benutzt
        //je nachdem ob man toLower oder toUpperCase verwendet muss jedoch dann in der bedingung Groß- oder Kleinschreibung
        //berücksichtigt werden
        satz = satz.toLowerCase();

        //.length gibt an wie viele Zeichen ein String hat.
        //die variable int anzahlzeichen ist dann hier dann die länge des eingegebenen Satzes
        int anzahlzeichen = satz.length();

        //diese Variable wird benötigt um die gesamten vokale zu zählen
        int anzahlvokale = 0;

        //for-schleife: zähler i ist 0, Abbruchbedingung: wenn i größer als die anzahl der zeichen ist.
        // die schleife geht solange i kleiner als anzahlzeichen ist. zähler i wird hochgezählt
        for (int i = 0; i < anzahlzeichen; i++) {

            //eine Variable vom Datentyp String wird angelegt um die Zeichen zu zählen. i steht vor dem ersten zeichen,
            //i+1 nach dem ersten zeichen
            String aktuelleszeichen = satz.substring(i, i + 1);

            //if-Verzweigung: es wird kontrolliert ob sich im Satz die gesuchten Umlaute befinden
            //hierbei wird boolean mittels equals verwendet, da es sich um einen String Datentyp handelt (NICHT ==  !!!)
            if (aktuelleszeichen.equals("a") || aktuelleszeichen.equals("e") || aktuelleszeichen.equals("i") || aktuelleszeichen.equals("o") || aktuelleszeichen.equals("u"))

                //die anzahl der Vokale werden werden gezählt
                anzahlvokale++;
            {
            }
        }

        //Ausgabe der Anzahl der vohrandenen Vokale im eingegeben Satz
        System.out.print("Gesamtanzahl Vokale: " + anzahlvokale);

    }


    public static void positiv() {

        /*Fakultät
       4. Schreibe ein Programm, das den Benutzer auffordert, eine positive ganze Zahl
          einzugeben, und dann die Fakultät dieser ganzen Zahl ausgibt. Die Fakultät von n
          ist das Produkt aller positiven ganzen Zahlen bis einschließlich n. Die Fakultät von
          5 ist zum Beispiel 5 * 4 * 3 * 2 * 1 = 120.
         */


        //Deklarierung und Initialisierung für die einzugebene Zahl
        int positivezahl;

        //Deklarierung und Initialisierung der Summe. Summe muss in diesem Fall 1 sein, da in der Schleife
        //nicht mit 0 multipliziert werden kann
        int summe = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        //Do-While-Schleife: die Schleife MUSS mindestens einmal durchlaufen
        do {
            System.out.println("Bitte geben Sie eine ganze positive Zahl ein:");
            positivezahl = scanner.nextInt();
        }
        while (positivezahl <= 0);

        //For-schleife: zähler i = auf 1 gesetzt, da nicht mit 0 multipliziert wird.
        // Abbruchbedingung: wenn i GRÖSSER al die eingegebene Zahl ist. Zähler i wird hochgezählt.
        for (int i = 1; i <= positivezahl; i++) {

        //Berechnung: die summe wird mit dem zähler multipliziert
            summe = summe * i;
        }
        System.out.println("Das Ergebnis ist: " + summe);

    }

}












