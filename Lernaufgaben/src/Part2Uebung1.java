import java.util.Scanner;

public class Part2Uebung1 {

    //fibonacci

    public static void main(String[] args) {


        int fibonacci = 19;
        int summealt = 0;
        int summeneu = 1;
        int ausgabe;


        for (int i = 0; i <= fibonacci; i++) {
            if (i == 0) {                               //Beim ersten Durchlauf habe ich noch keine summealt
                System.out.print(summeneu + " ");
            } else {
                ausgabe = summealt + summeneu;
                summealt = summeneu;
                summeneu = ausgabe;
                System.out.print(ausgabe + " ");
            }


        }


    }
}
