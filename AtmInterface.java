//AtmInterface

import java.util.Scanner;

public class AtmInterface {
    static int balance = 100000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Please insert your card");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit(sc.nextInt());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Please remove your card!! ");
                    System.out.println("*************");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static boolean CheckPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin:");
        int pin = sc.nextInt();
        return pin == 1234;
    }

    public static void withdraw(int amount) {
        if (CheckPin()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Please collect your money");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Incorrect PIN");
            System.out.println("Remove your card");
        }
        System.out.println("*************");
    }

    public static void deposit(int amount) {
        if (CheckPin()) {
            balance += amount;
            System.out.println("Your Money has been successfully deposited");
        } else {
            System.out.println("Incorrect PIN");
            System.out.println("Remove your card");
            System.out.println("*************");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*************");
    }

    public static void checkBalance() {
        if (CheckPin()) {
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Incorrect PIN");
            System.out.println("Remove your card");
            System.out.println("*************");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*************");
    }
}
