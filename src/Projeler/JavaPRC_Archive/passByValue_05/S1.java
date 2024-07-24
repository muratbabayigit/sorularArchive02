package Projeler.JavaPRC_Archive.passByValue_05;

// Soru: Pass By Value konseptini anlamak için bir primitive veri tipinin bir metoda nasıl
// geçirileceğini açıklayan bir örnek yapınız.

public class S1 {
    public static void main(String[] args) {
        int num = 5; // Başlangıç değeri atanıyor.
        System.out.println("Başlangıç Değeri: " + num);
        modifyValue(num); // Metoda num değişkeninin değeri geçiriliyor.
        System.out.println("Son Değer: " + num);
    }

    static void modifyValue(int value) {
        value = 10; // Değer metot içinde değiştirilse de orijinal num etkilenmez.
        System.out.println("Metot İçinde: " + value);
    }
}
