package Oyunlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
    public class Tabu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[] anahtarKelimeler = {"köpek", "kedi", "balık", "kuş", "at", "kırmızı", "mavi", "yeşil", "sarı", "kahverengi"};
            String[] tabuKelimeler = {"havlamak", "miyavlamak", "yüzmek", "uçmak", "binmek", "kanlı", "deniz", "ağaç", "güneş", "toprak"};

            ArrayList<String> kelimeListesi = new ArrayList<>(Arrays.asList(anahtarKelimeler));
            String anahtarKelime = kelimeListesi.get((int)(Math.random() * kelimeListesi.size()));
            kelimeListesi.remove(anahtarKelime);

            System.out.println("Anahtar kelime: " + anahtarKelime);
            System.out.println("Tabu kelimeler: " + Arrays.toString(tabuKelimeler));
            System.out.println("Başlamak için ENTER tuşuna basın.");
            input.nextLine();

            for (int i = 1; i <= 3; i++) {
                System.out.println(i + ". tur başlıyor...");
                String[] kelimeListesiArray = kelimeListesi.toArray(new String[kelimeListesi.size()]);
                String kelime = kelimeListesiArray[(int)(Math.random() * kelimeListesiArray.length)];
                kelimeListesi.remove(kelime);
                System.out.println("Kelime: " + kelime);
                System.out.println("Tabu kelimeler: " + Arrays.toString(tabuKelimeler));
                System.out.println("Başlamak için ENTER tuşuna basın.");
                input.nextLine();
            }

            System.out.println("Oyun bitti!");

            input.close();
        }
    }

