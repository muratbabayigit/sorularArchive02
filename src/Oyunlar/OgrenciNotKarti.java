package Oyunlar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciNotKarti {
    /*
    Öğrencinin ders adını, ardından o ders için 3 adet notu girip, notları ve ortalama notunu bir HashMap'ta saklar.
    Sonra da tüm derslerin notlarını ve ortalamalarını listeleyerek bir not kartı oluşturur.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, ArrayList<Double>> notKarti = new HashMap<String, ArrayList<Double>>();

        while (true) {
            System.out.print("Ders adı girin (çıkmak için 'q' tuşuna basın): ");
            String ders = input.nextLine();

            if (ders.equals("q")) {
                break;
            }

            ArrayList<Double> notlar = new ArrayList<Double>();
            for (int i = 1; i <= 3; i++) {
                System.out.print(i + ". notu girin: ");
                double not = input.nextDouble();
                notlar.add(not);
            }
            input.nextLine(); // input buffer temizleme

            notKarti.put(ders, notlar);
        }

        System.out.println("\nNot Kartı:");
        for (Map.Entry<String, ArrayList<Double>> entry : notKarti.entrySet()) {
            String ders = entry.getKey();
            ArrayList<Double> notlar = entry.getValue();

            double toplam = 0;
            for (double not : notlar) {
                toplam += not;
            }
            double ortalama = toplam / notlar.size();

            System.out.println(ders + ": " + notlar.get(0) + ", " + notlar.get(1) + ", " + notlar.get(2) + " - Ortalama: " + ortalama);
        }

        input.close();
    }
}

