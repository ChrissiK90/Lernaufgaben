import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part3Uebung1_Arrays {

    public static void main(String[] arc) {

        // array1();
        // array2();
        // array3();
        // array4();
        array5();
        // array6();
        // array7();
        // array8();
        // array9();
        // array10();


       /* int[] meinArray = new int[10];

        meinArray[0] = 1;
        meinArray[1] = 22;

        //System.out.println(Arrays.toString((meinArray))); //Ausgabe gesamtes Array als String
*/

    }

    public static void array1() {

        /*
        1. Schreibe ein Programm, das ein Array von 10 Ganzzahlen erzeugt und diese
           anschließend, Element für Element (nicht alles auf einmal), in der Konsole ausgibt.
         */

        //Deklaration und Initialisierung des Arrays. In der letzeren Klammer wird die Anzahl der Elemente angegeben
        int[] meinArray = new int[10];

        //Objekt random der Klasse random wird erzeugt
        Random random = new Random();

        //for schleife: um alle zahlen auszugeben. zähler i wird auf 0 gesetzt. Abbruchbedingung: wenn i GRÖSSER
        //als die länge vom array ist. Solange i kleiner als die länge vom array ist, läuft die schleife. i zählt hoch.
        for (int i = 0; i < meinArray.length; i++) {

            //das Array wird mit einer Zufallszahl in jeden Index als Element gefüllt
            meinArray[i] = random.nextInt(1, 10);
            System.out.println(meinArray[i]);
        }
    }

    public static void array2() {

        /*
        Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt (Kein
        Einlesen aus der Konsole) und das größte Element im Array findet und ausgibt.
         */

        Random random = new Random();

        //Erstellen eines Arrays mit 5 Elementen
        double[] meinArray = new double[5];

        //für die größte Zahl eine double variable deklarieren und zu beginn mit 0 initialisieren
        double maxzahl = 0;

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < meinArray.length; i++) {
            //auf jeden index wird eine double Zufallszahl geschrieben zwischen 0 und 1
            meinArray[i] = random.nextDouble(0, 1);
            //if-Verzweigung: wenn das Element im Array größer als die maximalzahl ist,
            // dann ist die maximalzahl das Element in dem Array
            if (meinArray[i] > maxzahl) {
                maxzahl = meinArray[i];

            }
            //Ausgabe aller Elemente vom Array
            System.out.println(meinArray[i]);
        }
        System.out.println("Die groesste Zahl ist " + maxzahl);


    }

    public static void array3() {

        /*
        Schreibe ein Programm, das ein Array von 8 Strings erzeugt (Kein Einlesen von
        der Konsole) und die Länge jedes Strings im Array ausgibt
         */

        //Erstellen eines String Arrays mit 8 Elementen
        String[] names = new String[8];

        //Befüllen  von jedem Index mit Strings
        names[0] = "Harry Potter";
        names[1] = "Lord Voldemord";
        names[2] = "Ronald Weasly";
        names[3] = "Hermine Granger";
        names[4] = "Rubeus Hagrid";
        names[5] = "Draco Malfoy";
        names[6] = "Albus Dumbledore";
        names[7] = "Severus Snape";

        //Um die länge jedes einzelnen Strings ausgeben zu können, benötigen wir ein int-Array
        int[] laenge = new int[8];

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        //hier nehmen wir nun das NAMES ARRAY damit das INT ARRAY (laenge) mit der Gesamtanzahl der einzelnen Strings
        //befüllt wird.
        for (int i = 0; i < names.length; i++) {
            //System.out.println(names[i] + "(" + names[i].length() + ")"); gibt jedes einzelne Element aus

            //länge des Strings ermitteln und auf Index in INT ARRAY schreiben mit .LENGTH()!!!
            laenge[i] = names[i].length();
        }

        //Ausgabe des gesamten INT-ARRAYS
        System.out.println(Arrays.toString((laenge)));

    }


    public static void array4() {
        /*
        Schreibe ein Programm, das ein Array von 12 Ganzzahlen erzeugt (Kein Einlesen
        von der Konsole) und eine Summe aller Elemente im Array berechnet.
         */

        Random random = new Random();

        //erstellen eines int arrays mit 12 Elementen
        int[] ganzzahl = new int[12];
        //Deklaration und Initialisierung Variable Summe
        int summe = 0;

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < ganzzahl.length; i++) {
            //eine Zufallszahl wird auf jeden Index des Arrays geschrieben
            ganzzahl[i] = random.nextInt(1, 10);
            //Berechnung der Summe von allen Elementen aus dem Array
            summe = summe + ganzzahl[i];

            //Ausgabe jedes einzelnen Elements aus dem Array
            System.out.println(ganzzahl[i]);
        }
        System.out.println(summe);
    }

    public static void array5() {
        /*
        Schreibe ein Programm, das ein Array von 15 Zufallszahlen zwischen 1 und 100
        erzeugt (Kein Einlesen von der Konsole) und alle Elemente, einzeln (nicht alles
        auf einmal) im Array ausgibt
         */

        Random random = new Random();


        //Erstellen eines int arrays mit 15 elementen
        int[] zahlenarray = new int[15];

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < zahlenarray.length; i++) {

            //auf jeden Index des Arrays wird eine Zufallszahl von 1 bis 100 als Element geschrieben
            zahlenarray[i] = random.nextInt(1, 100);

            //Ausgabe für jedes einzelne Element aus dem Array
            System.out.print(zahlenarray[i] + " ");

        }


    }


    public static void array6() {
        /*
        Schreibe ein Programm, das ein Array von 20 Ganzzahlen erzeugt (Kein Einlesen
        von der Konsole) und nur die geraden Zahlen im Array ausgibt.
         */

        //erstellen eines int Arrays mit 20 Elementen
        int[] ganzzahl = {20, 44, 147, 12, 45, 78, 99, 475, 89, 558, 77, 2, 32, 617, 106, 777, 814, 65, 38, 4};

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < ganzzahl.length; i++) {

            //if-Verzweigung: wenn ein Element aus dem Array "Modulo" durch der Rest 0 ergibt, dann ist es eine gerade Zahl
            if (ganzzahl[i] % 2 == 0) {

                //Ausgabe jeder geraden Zahl aus dem Array
                System.out.print(ganzzahl[i] + " ");
            }


        }

    }

    public static void array7() {
        /*
        Schreibe ein Programm, das ein Array von 10 Strings erzeugt (Kein Einlesen von
        der Konsole) und diejenigen Strings im Array ausgibt, die mit einem bestimmten
        Buchstaben beginnen.
         */

        //Erstellen eines String Arrays mit 10 Elementen
        String[] obstsorten = {"apfel", "banane", "Birne", "Pfirsich", "Marille", "orange", "zitrone", "mandarine", "melone", "ananas"};


        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < obstsorten.length; i++) {
            /*String lowercase = obstsorten[i].toLowerCase();         //aktuelles Obst in Kleinbuchstaben für Array
            String firstletter = lowercase.substring(0,1);            //1. Buchstabe in Kleinbuchstaben
            if (firstletter.equals("m")) {                            //vergleichen
            */

            //if-Verzweigung: wenn ein Element aus dem Array mit einem "m" BEGINN, soll dieses ausgegeben werden.
            //toLowerCase bedeutet, dass es gleich is ob das "m" groß oder klein geschrieben ist.
            //mit substring gibt die angegebenen Zeichen an. Da hier der Anfangsbuchstabe gesucht wird, muss 0 (vor dem ersten
            //Buchstaben und 1 (nach dem ersten Buchstaben eingegeben werden. mit euals wird verglichen.
            if (obstsorten[i].toLowerCase().substring(0, 1).equals("m")) {

                //andere Möglichkeit! mit CharAt den char prüfen! Achtung ' ' verwenden!
                //if (obstsorten[i].toLowerCase().charAt(0)=='m')


                //Ausgabe jedes Elements aus dem Array mit dem Anfangsbuchstaben "m"
                System.out.println(obstsorten[i]);
            }


        }


    }

    public static void array8() {
    /*
    Schreiben Sie ein Programm, das die Elemente eines Arrays mit 10 ganzen Zahlen
    von der Konsole durch den Benutzer einliest und dann das größte Element findet
    und ausgibt
    */


        Scanner scanner = new Scanner(System.in);

        //Erstellen eines int arrays mit 10 Elementen
        int[] ganzezahl = new int[10];

        //Deklaration und initialisierung einer variable für die maximale zahl des benutzers
        int maximalzahl = 0;

        System.out.println("Bitte geben Sie zehn ganze Zahlen ein:");

        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < ganzezahl.length; i++) {

            //jede eingegebene Zahl des Benutzers wird in das Array geschrieben
            ganzezahl[i] = scanner.nextInt();

            //if-Verzweigung: im 1. Durchgang habe ich noch keinen Vergleich (falls jemand Minuszahlen eingibt)
            //Wenn index auf 0, dann ist die maximale zahl das erste element aus dem array
            if (i == 0) {
                maximalzahl = ganzezahl[i];
                //else-if-Verzweigung: wenn das element im Array GRÖSSER als die Maximalzahl ist,
                //dann ist die maximale zahl das element aus dem Array
            } else if (ganzezahl[i] > maximalzahl) {
                maximalzahl = ganzezahl[i];
            }
        }
        System.out.println("Groesste Zahl = " + maximalzahl);

    }

    public static void array9() {
        /*
        Schreibe ein Programm, das ein Array von 6 Ganzzahlen erzeugt (Kein Einlesen
        von der Konsole!) und das kleinste Element im Array findet und ausgibt.
         */

        //Erstellen eines int Arrays mit 6 Elementen
        int[] ganzezahl = {14, 3, 708, 55, 102, 87};

        //Deklaration und Initialisierung einer variable für die kleinste Zahl aus dem Array
        int kleinstezahl = 0;


        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < ganzezahl.length; i++) {

            //if-Verzweigung: im 1. Durchgang habe ich noch keinen Vergleich. In diesem Beispiel ist nun auf i = 14
            //wenn index 0 ist, dann ist die kleinste zahl das element aus dem array
            if (i == 0) {
                kleinstezahl = ganzezahl[i];
                //else-if-Verzweigung: wenn das element im Array KLEINER als die kleinste Zahl ist,
                //dann ist die kleinste zahl das element aus dem Array
            } else if (ganzezahl[i] < kleinstezahl) {
                kleinstezahl = ganzezahl[i];
            }
        }
        System.out.println("Die kleinste Zahl ist " + kleinstezahl);

    }

    public static void array10() {
        /*
        Schreibe ein Programm, das ein Array von 9 Gleitkommazahlen erzeugt (Kein
        Einlesen von der Konsole) und das durchschnittliche Element im Array berechnet
        und ausgibt
         */

        //Erstellen eines double arrays mit 9 elementen
        double[] gleitkomma = {57.40, 22.92, 104.03, 16.11, 96.77, 17.14, 26.03, 8.02, 56.41};

        //Um den durchschnitt berechnen zu können benötigen wir zuerst eine variable summe mit initialisierung auf 0
        double summe = 0;
        //Deklaration einer variable für den durchschnitt
        double durchschnitt;


        //for-schleife: zähler i auf 0, Abbruchbedingung: wenn i GRÖSSER ist als die länge des Arrays,
        //Solange der zähler i kleiner ist als das gesamte Array, läuft die Schleife. zähler i zählt hoch.
        for (int i = 0; i < gleitkomma.length; i++) {

            //Berechnung der Summe: addieren jedes Elements aus dem Array
            summe = summe + gleitkomma[i];
        }

        //der durschnitt wird außerhalb der schleife berechnet. Hier wird die summe aus den elementen vom
        //array durch die länge des Arrays dividiert
        durchschnitt = summe / gleitkomma.length;

        //Ausgabe des Durschnitts
        System.out.println(durchschnitt);


    }

}





