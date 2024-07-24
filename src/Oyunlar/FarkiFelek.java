package Oyunlar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class FarkiFelek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] deyimler = {"Meraklısı için yolun yarısı demektir.", "El el üstündür.", "Akıllı işine gücü bakar.", "Acele işe şeytan karışır."};
                Random random = new Random();
        String deyim = deyimler[random.nextInt(deyimler.length)];
        char[] harfler = deyim.toCharArray();
        char[] tahminler = new char[harfler.length];
        Arrays.fill(tahminler, '_');
        int maxPuan = 10 * harfler.length;
        boolean tamamlandi = false;
        int oyuncu = 1;
        while (!tamamlandi) {
            System.out.println("Deyim: " + String.valueOf(tahminler));
            System.out.print("Oyuncu " + oyuncu + ", harf tahmin et: ");
            char harf = scanner.nextLine().charAt(0);
            boolean dogruTahmin = false;
            for (int i = 0; i < harfler.length; i++) {
                if (harfler[i] == harf) {
                    tahminler[i] = harf;
                    dogruTahmin = true;
                }
            }
            if (!dogruTahmin) {
                if (oyuncu == 1) {
                    oyuncu = 2;
                } else {
                    oyuncu = 1;
                }
            }
            if (Arrays.equals(harfler, tahminler)) {
                tamamlandi = true;
                System.out.println("Tebrikler, deyimi doğru tahmin ettiniz!");
                System.out.println("Oyuncu " + oyuncu + " kazandı!");
            } else {
                System.out.println("Daha fazla harf tahmin edin.");
            }
        }
  }
    }
