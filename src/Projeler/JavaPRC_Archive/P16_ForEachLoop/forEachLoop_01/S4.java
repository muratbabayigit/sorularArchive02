package Projeler.JavaPRC_Archive.P16_ForEachLoop.forEachLoop_01;

import java.util.ArrayList;

public class S4 {
    public static void main(String[] args) {
        // Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.

// Örnek çıktı:
// Toplam fiyat: 236.5
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(50.5);
        prices.add(30.0);
        prices.add(100.0);
        prices.add(56.0);

        double sum = 0;
        for (double price : prices) {
            sum += price;
        }

        System.out.println("Toplam fiyat: " + sum);
    }
}
