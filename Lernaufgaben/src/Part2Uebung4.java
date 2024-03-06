import java.util.Scanner;

public class Part2Uebung4 {

    //Passwortabfrage

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String eingabebenutzer;
        String eingabepassword;

        String benutzer = "user123";
        String passwort = "password123";
        int anzahleingabe = 0;


        do {
            if (anzahleingabe >= 5) {
                System.out.println("Maximalemale Anzahl von Versuchen erreicht. Programm beenden.");
                break;
            } else if (anzahleingabe > 0 && anzahleingabe <= 5) {
                System.out.println("Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut. " + (5 - anzahleingabe) + " Versuche verleiben.");

            }
            System.out.println("Bitte geben Sie Ihren Benutzernamen ein:");
            eingabebenutzer = scanner.next();

            System.out.println("Bitte geben Sie Ihr Passwort ein:");
            eingabepassword = scanner.next();
            anzahleingabe++;
        }
        while ((!eingabebenutzer.equals(benutzer)) || (!eingabepassword.equals(passwort)));


    }


}
