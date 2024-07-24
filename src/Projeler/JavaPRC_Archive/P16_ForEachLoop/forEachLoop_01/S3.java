package Projeler.JavaPRC_Archive.P16_ForEachLoop.forEachLoop_01;

import java.util.ArrayList;

public class S3 {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine 3 adet meyve ekleyin.
// Daha sonra bu meyveleri büyük harflerle ekrana yazdırın.

// Örnek çıktı:
// Meyveler: ELMA ARMUT ÇİLEK
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Elma");
        fruits.add("Armut");
        fruits.add("Çilek");

        for (String fruit : fruits) {
            System.out.print(fruit.toUpperCase() + " ");
        }
    }
}
