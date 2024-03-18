public class Part2Uebung1_Fibonacci {

    /*fibonacci
    1.1 Übung 1 – Fibonacci Zahlen
    Ein sehr beliebtes Beispiel für Programmieranfänger ist es die Fibonacci-Sequenz zu
    programmieren. Dabei handelt es sich um eine nicht endende Zahlenreihenfolge, die bei
    0 und 1 startet und die nächste Zahl ab dann immer die Summe der beiden vorherigen
    Zahlen ergibt.
    Beispiel für die Zahlenfolge: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
    Erklärung: 0 und 1 = 1 | 1 und 1 = 2 | 2 und 1 = 3 | 3 und 2 = 5 | 5 und 3 = 8 | …
    Ihre Aufgabe in diesem Übungsbeispiel ist es, die ersten 20 Zahlen, der FibonacciReihenfolge in die Konsole auszugeben.
     */

    public static void main(String[] args) {

        //Variable fibonacci wird weil 20 zahlen ausgegeben werden sollen, mit 19 initialisiert
        int fibonacci = 19;

        //summealt wird benötigt, um eine ursprungssumme zu erhalten
        int summealt = 0;

        //summeneu wird benötigt, um eine aktuelle summe berechnen zu können und nicht summealt zu überschreiben
        //die neue summe wird mit 1 intialisiert für den ersten durchlauf
        int summeneu = 1;

        //ausgabe ist dann das endergebnis um die fibonacci ausgeben zu können
        int ausgabe;


        //for-schleife: zähler i wird auf 0 gesetzt. Abbruchbedingung: wenn i größer als die 20 fibonacci zahlen ist.
        //solange i KLEINER GLEICH fibonacci ist, durchläuft die schleife. i zählt hoch.
        for (int i = 0; i <= fibonacci; i++) {

            //if-Verzweigung: wenn der zähler 0 ist, dann soll die summeneu (in dem fall 1) ausgegeben werden.
            //Beim ersten Durchlauf habe ich noch keine summealt.
            if (i == 0) {
                System.out.print(summeneu + " ");

                //else-Verzweigung: sonst soll alles andere ausgegeben werden
            } else {

                //Berechnung: die ausgabe soll die summealt (0) mit summeneu (1) addieren
                ausgabe = summealt + summeneu;
                //summealt (1) ist dann die summeneu (1)
                summealt = summeneu;
                //summeneu (1) ist dann die ausgabe. --->das geht dann solange weiter bis die 20 zahlen
                //erreicht wurden und die schleife durch die Abbruchbedinung beendet wurde.
                summeneu = ausgabe;

                //Ausgabe der 20 fibonaccizahlen
                System.out.print(ausgabe + " ");
            }


        }


    }
}
