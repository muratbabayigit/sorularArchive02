package Projeler.JavaPRC_Archive.P15_ArrayList.ArrayList_02;

import java.util.ArrayList;

public class Soru1 {
    // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
// Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.

// Örnek çıktı:
// Son isim: Ahmet
// Son ikinci isim: Mehmet
// ...

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ayşe");
        names.add("Fatma");
        names.add("Mehmet");

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println("Son " + (names.size() - i) + " isim: " + names.get(i));
        }
    }
}
