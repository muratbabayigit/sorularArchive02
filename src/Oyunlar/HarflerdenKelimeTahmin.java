package Oyunlar;

import java.util.Scanner;

public class HarflerdenKelimeTahmin {
    /*
     Bu kod, bir kelime seçer ve oyuncuların harfleri tahmin etmelerine olanak tanır.
     Yanlış tahminler için belirli bir sayıda hakkı vardır ve doğru tahminlerde
     bulunan her harf, kelimenin doğru bir şekilde tahmin edilmesine yardımcı olur.
     Oyun, kelime doğru bir şekilde tahmin edildiğinde veya oyuncuların hakları tükendiğinde sona erer.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kelimeler = {"elma", "armut", "çilek", "portakal", "muz"};
        String secilenKelime = kelimeler[(int) (Math.random() * kelimeler.length)];
        int yanlisTahminSayisi = 0;
        boolean[] harfler = new boolean[secilenKelime.length()];

        System.out.println("Kelime tahmin oyununa hoş geldiniz!");
        while (true) {
            System.out.println("Tahmininiz: ");
            String tahmin = input.nextLine();

            if (tahmin.length() != 1) {
                System.out.println("Lütfen sadece bir harf girin.");
                continue;
            }

            boolean dogruTahmin = false;
            for (int i = 0; i < secilenKelime.length(); i++) {
                if (secilenKelime.charAt(i) == tahmin.charAt(0)) {
                    harfler[i] = true;
                    dogruTahmin = true;
                }
            }

            if (dogruTahmin) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                if (kelimeTahminEdildiMi(harfler)) {
                    System.out.println("Tebrikler, kelimeyi doğru tahmin ettiniz! Kelime: " + secilenKelime);
                    break;
                }
            } else {
                System.out.println("Maalesef yanlış tahmin ettiniz.");
                yanlisTahminSayisi++;
                if (yanlisTahminSayisi == 6) {
                    System.out.println("Maalesef, hakkınız kalmadı. Doğru kelime: " + secilenKelime);
                    break;
                }
            }
        }

        input.close();
    }

    public static boolean kelimeTahminEdildiMi(boolean[] harfler) {
        for (boolean harf : harfler) {
            if (!harf) {
                return false;
            }
        }
        return true;
    }
}

