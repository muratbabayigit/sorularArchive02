package Oyunlar;

import java.util.Scanner;

public class KagitOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int computerScore = 0;
        boolean isGameOver = false;

        System.out.println("21 oyununa hoş geldiniz!");

        while (!isGameOver) {
            System.out.printf("Toplam puanınız:\n", score);
            System.out.print("Kart çekmek istiyor musunuz? (E/H): ");
            String answer = input.next();

            if (answer.equalsIgnoreCase("E")) {
                int card = (int)(Math.random() * 10) + 1;
                score += card;
                System.out.printf("Çekilen kart: %d\n", card);

                if (score > 21) {
                    System.out.println("Oyunu kaybettiniz!");
                    isGameOver = true;
                }
            } else {
                while (computerScore < score && computerScore < 21) {
                    int computerCard = (int)(Math.random() * 10) + 1;
                    computerScore += computerCard;
                    System.out.printf("Bilgisayarın çektiği kart: %d\n", computerCard);
                }

                System.out.printf("Toplam puanınız: %d\n", score);
                System.out.printf("Bilgisayarın toplam puanı: %d\n", computerScore);

                if (computerScore > 21 || score > computerScore) {
                    System.out.println("Tebrikler, oyunu kazandınız!");
                } else if (score == computerScore) {
                    System.out.println("Berabere!");
                } else {
                    System.out.println("Oyunu kaybettiniz!");
                }

                isGameOver = true;
            }
        }
    }
}

