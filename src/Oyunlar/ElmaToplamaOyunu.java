package Oyunlar;

import java.util.Random;
import java.util.Scanner;

    public class ElmaToplamaOyunu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int skor = 0;

            System.out.println("Elma Toplama Oyununa Hoş Geldiniz!");

            while (true) {
                int x = rand.nextInt(10);
                int y = rand.nextInt(10);

                System.out.println("Elma (" + x + ", " + y + ") konumunda görüldü! Toplamak için 'E' tuşuna basın.");
                String cevap = input.nextLine();

                if (cevap.equalsIgnoreCase("E")) {
                    skor++;
                    System.out.println("Elma toplandı! Skorunuz: " + skor);
                } else {
                    System.out.println("Elma toplanmadı. Skorunuz: " + skor);
                    break;
                }
            }

            System.out.println("Oyun bitti! Toplam skorunuz: " + skor);
            input.close();
        }
    }


