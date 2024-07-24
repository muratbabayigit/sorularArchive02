package Oyunlar;

import java.util.Scanner;

public class ATM {
    private String accountNumber;
    private String pin;
    private double balance;

    public ATM(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void displayMenu() {
        Scanner input = new Scanner(System.in);
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("Lütfen hesap numaranızı girin:");
            String account = input.nextLine();

            System.out.println("Lütfen şifrenizi girin:");
            String password = input.nextLine();

            if (account.equals(this.accountNumber) && password.equals(this.pin)) {
                System.out.println("Giriş başarılı!");
                isLoggedIn = true;
            } else {
                System.out.println("Hesap numarası veya şifre yanlış. Lütfen tekrar deneyin.");
            }
        }

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Bakiye sorgulama");
            System.out.println("2. Para çekme");
            System.out.println("3. Para yatırma");
            System.out.println("4. Çıkış");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Bakiyeniz: %.2f TL\n", balance);
                    break;
                case 2:
                    System.out.println("Lütfen çekmek istediğiniz tutarı girin:");
                    double withdrawAmount = input.nextDouble();

                    if (withdrawAmount > balance) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("%.2f TL çekildi. Yeni bakiyeniz: %.2f TL\n", withdrawAmount, balance);
                    }

                    break;
                case 3:
                    System.out.println("Lütfen yatırmak istediğiniz tutarı girin:");
                    double depositAmount = input.nextDouble();

                    balance += depositAmount;
                    System.out.printf("%.2f TL yatırıldı. Yeni bakiyeniz: %.2f TL\n", depositAmount, balance);

                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
            }
        }

        System.out.println("Güle güle!");
    }
}
