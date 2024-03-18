import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part3Uebung1_Arrays {

    public static void main(String[] arc) {

         array1();
        // array2();
        // array3();
        // array4();
        // array5();
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

            //
            meinArray[i] = random.nextInt(1,10);
            System.out.println(meinArray[i]);
        }
    }

    public static void array2() {

        double[] meinArray = new double[5];

        meinArray[0] = 2.02;
        meinArray[1] = 89.04;
        meinArray[2] = 17.43;
        meinArray[3] = 184.50;
        meinArray[4] = 40.67;

        double maxzahl = 0;

        for (int i = 0; i < meinArray.length; i++) {
            if (meinArray[i] > maxzahl) {
                maxzahl = meinArray[i];
            }
        }
        System.out.println("Die groesste Zahl ist " + maxzahl);


    }

    public static void array3() {


        String[] names = new String[8];

        names[0] = "Harry Potter";
        names[1] = "Lord Voldemord";
        names[2] = "Ronald Weasly";
        names[3] = "Hermine Granger";
        names[4] = "Rubeus Hagrid";
        names[5] = "Draco Malfoy";
        names[6] = "Albus Dumbledore";
        names[7] = "Severus Snape";

        int[] laenge = new int[8];

        for (int i = 0; i < names.length; i++) {
            //System.out.println(names[i] + "(" + names[i].length() + ")"); einzelne Ausgsabe
            laenge[i] = names[i].length(); //länge ermitteln + in Array schreiben
        }

        System.out.println(Arrays.toString((laenge))); //Ausgabe gesamtes Array als String

    }


    public static void array4() {

        int[] ganzzahl = new int[12];
        int summe = 0;


        for (int i = 0; i < 12; i++) {
            ganzzahl[i] = i;
            summe = summe + ganzzahl[i];
        }
        System.out.println(summe);
    }

    public static void array5() {

        Random zufallsfunktion = new Random();


//int eine Zufallszahl = zufallszahl.nextInt(100);


        int[] zahlenarray = new int[15];

        for (int i = 0; i < zahlenarray.length; i++) {
            zahlenarray[i] = zufallsfunktion.nextInt(101); //keine Ahnung, nexInt liefert eine Ganzzahl >= 0, Wert kann null sein. Finde nix :-)
            System.out.print(zahlenarray[i] + " ");
        }


    }


    public static void array6() {

        int[] ganzzahl = {20, 44, 147, 12, 45, 78, 99, 475, 89, 558, 77, 2, 32, 617, 106, 777, 814, 65, 38, 4};


        for (int i = 0; i < ganzzahl.length; i++) {
            if (ganzzahl[i] % 2 == 0) {
                System.out.print(ganzzahl[i] + " ");
            }


        }

    }

    public static void array7() {

        String[] obstsorten = {"apfel", "banane", "Birne", "Pfirsich", "Marille", "orange", "zitrone", "mandarine", "melone", "ananas"};


        for (int i = 0; i < obstsorten.length; i++) {
            /*String lowercase = obstsorten[i].toLowerCase();         //aktuelles Obst in Kleinbuchstaben für Array
            String firstletter = lowercase.substring(0,1);            //1. Buchstabe in Kleinbuchstaben
            if (firstletter.equals("m")) {                            //vergleichen
            */
            if (obstsorten[i].toLowerCase().substring(0, 1).equals("m")) {
                System.out.println(obstsorten[i]);
            }


        }


    }

    public static void array8() {

        Scanner scanner = new Scanner(System.in);

        int[] ganzezahl = new int[10];

        int maximalzahl = 0;

        System.out.println("Bitte geben Sie zehn ganze Zahlen ein:");

        for (int i = 0; i < ganzezahl.length; i++) {
            ganzezahl[i] = scanner.nextInt();
            if (i == 0) {
                maximalzahl = ganzezahl[i];            //im 1. Durchgang habe ich noch keinen Vergleich (falls jemand Minuszahlen eingibt)
            } else if (ganzezahl[i] > maximalzahl) {
                maximalzahl = ganzezahl[i];
            }
        }
        System.out.println("Groesste Zahl = " + maximalzahl);

    }

    public static void array9() {

        int[] ganzezahl = {14, 3, 708, 55, 102, 87};

        int kleinstezahl = 0;

        for (int i = 0; i < ganzezahl.length; i++) {
            if (i == 0) {
                kleinstezahl = ganzezahl[i];            //im 1. Durchgang habe ich noch keinen Vergleich. In diesem Beispiel ist nun auf i = 14
            } else if (ganzezahl[i] < kleinstezahl) {
                kleinstezahl = ganzezahl[i];
            }
        }
        System.out.println("Die kleinste Zahl ist " + kleinstezahl);

    }

    public static void array10() {

        double[] gleitkomma = {57.40, 22.92, 104.03, 16.11, 96.77};
        double summe = 0;
        double durchschnitt = 0;

        int anzahl = gleitkomma.length;  //anzahl = die Anzahl der Elemente im Array

        for (int i = 0; i < gleitkomma.length; i++) {
            summe = summe + gleitkomma[i];
        }
        durchschnitt = summe / anzahl;

        System.out.println(durchschnitt);


    }

}





