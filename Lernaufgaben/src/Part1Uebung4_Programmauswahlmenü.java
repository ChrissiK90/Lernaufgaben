import java.util.Scanner;

public class Part1Uebung4_Programmauswahlmenü {

    //Programmauswahlmenue

    public static void main(String[] args) {

        //  substring();
        //  geradezahl();
        // vokale();
        // positiv();


        int menu = 0;

        while (menu != 5) {
            System.out.println("\nBitte waehlen Sie eine Option aus, indem Sie die Zahl der Option eingeben:\n1. Umgekehrte Stringeingabe\n2. Pruefen ob eine Zahl gerade oder ungerade ist.\n3. Vokale zaehlen\n4. Fakultaet berechnen\n5. Beenden");
            Scanner scanner = new Scanner(System.in);

            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    substring();
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
                default:
                    System.out.println("Bitte waehlen Sie eine Option von 1-5 aus.");
            }
        }

    }

    public static void substring() {

        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein Wort ein:");
        word = scanner.next();

        int anzahl = word.length();

        for (int i = anzahl; i > 0; i--) {
            System.out.print(word.substring(i - 1, i));
        }
    }

    public static void geradezahl() {

        Scanner scanner = new Scanner(System.in);

        int zahl;
        System.out.println("Bitte geben Sie eine Zahl ein:");
        zahl = scanner.nextInt();

        int rest = zahl % 2; //% = "Modulo" = Berechne den Rest der Division

        if (rest == 1) {
            System.out.println("Zahl ist eine ungerade Zahl");
        } else {
            System.out.println("Zahl ist eine gerade Zahl");
        }
    }

    public static void vokale() {

        Scanner scanner = new Scanner(System.in);

        String satz;

        System.out.println("Bitte geben Sie einen Satz ein (Groß/Kleinschreibung wird berücksichtig):");
        satz = scanner.nextLine();
        satz = satz.toLowerCase();


        int anzahlzeichen = satz.length();
        int anzahlvokale = 0;

        for (int i = 0; i < anzahlzeichen; i++) {
            String aktuelleszeichen = satz.substring(i, i + 1);
            if (aktuelleszeichen.equals("a") || aktuelleszeichen.equals("e") || aktuelleszeichen.equals("i") || aktuelleszeichen.equals("o") || aktuelleszeichen.equals("u"))
                anzahlvokale = anzahlvokale + 1;
            {
            }
        }

        System.out.print("Gesamtanzahl Vokale: " + anzahlvokale);

    }


    public static void positiv() {


        int positivezahl;
        int summe = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        do {
            System.out.println("Bitte geben Sie eine ganze positive Zahl ein:");
            positivezahl = scanner.nextInt();
        }
        while (positivezahl <= 0);

        for (int i = 1; i <= positivezahl; i++) {
            summe = summe * i;
        }
        System.out.println("Das Ergebnis ist: " + summe);

    }

}












