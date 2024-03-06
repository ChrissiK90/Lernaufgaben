import java.util.Scanner;

public class Part1Uebung3 {

    //Bankomatbedienung

    public static void main(String[] args) {

        double balance;
        int choice = 0;
        double transaction = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your account balance:");
        balance = scanner.nextDouble();


        while (choice != 4) {
            System.out.printf("Menue:\n1. Deposit\n2.Withdraw\n3. Check balance\n4. Exit\nEnter your choice:");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Select transaction amount:");
                transaction = scanner.nextDouble();
                balance = balance + transaction;
                System.out.println("Your transaction was successful. Your current account balance is " + balance + " Euro.");
            } else if (choice == 2) {
                System.out.println("Select transaction amount:");
                transaction = scanner.nextDouble();
                balance = balance - transaction;
                System.out.println("Your transaction was successful. Your current account balance is " + balance + " Euro.");
            } else if (choice == 3) {
                System.out.println("Your current account balance is " + balance + " Euro.");
            }

        }
    }
}




