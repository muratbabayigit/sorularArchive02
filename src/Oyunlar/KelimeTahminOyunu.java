package Oyunlar;

import java.util.Scanner;

public class KelimeTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kelimeListesi = {"elma", "armut", "çilek", "karpuz", "kiraz", "üzüm", "mandalina"};
        String kelime = kelimeListesi[(int)(Math.random() * kelimeListesi.length)];
        int canSayisi = 6;
        boolean[] tahminHarfleri = new boolean[kelime.length()];
        boolean oyunBitti = false;

        System.out.println("Kelimeyi tahmin etmek için harf girmeniz gerekiyor. Her yanlış tahminde bir can kaybedeceksiniz. Toplam can sayınız: " + canSayisi);

        while (!oyunBitti) {
            System.out.print("Tahmininiz: ");
            String tahmin = input.next().toLowerCase();
            if (tahmin.length() == 1) {
                boolean dogruTahmin = false;
                for (int i = 0; i < kelime.length(); i++) {
                    if (kelime.charAt(i) == tahmin.charAt(0)) {
                        tahminHarfleri[i] = true;
                        dogruTahmin = true;
                    }
                }
                if (dogruTahmin) {
                    System.out.println("Doğru tahmin!");
                } else {
                    canSayisi--;
                    System.out.println("Yanlış tahmin! Kalan can sayısı: " + canSayisi);
                    if (canSayisi == 0) {
                        System.out.println("Canınız bitti! Oyunu kaybettiniz.");
                        oyunBitti = true;
                    }
                }
            } else if (tahmin.equals(kelime)) {
                System.out.println("Doğru tahmin! Kelime: " + kelime);
                oyunBitti = true;
            } else {
                System.out.println("Geçersiz tahmin!");
            }

            if (!oyunBitti) {
                System.out.print("Kelime: ");
                for (int i = 0; i < kelime.length(); i++) {
                    if (tahminHarfleri[i]) {
                        System.out.print(kelime.charAt(i));
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}
