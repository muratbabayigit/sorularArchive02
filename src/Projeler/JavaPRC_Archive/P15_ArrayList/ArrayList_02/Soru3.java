package Projeler.JavaPRC_Archive.P15_ArrayList.ArrayList_02;

import java.util.ArrayList;

public class Soru3 {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine 5 adet kelime ekleyin.
// Ardından bu kelimeleri tek bir cümle olarak birleştirerek ekrana yazdırın.

// Örnek çıktı:
// Cümle: Java çok güçlü bir dildir.
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("çok");
        words.add("güçlü");
        words.add("bir");
        words.add("dildir.");

        String sentence = String.join(" ", words);
        System.out.println("Cümle: " + sentence);
    }
}
