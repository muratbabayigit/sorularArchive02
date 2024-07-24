package Projeler.JavaPRC_Archive.P15_ArrayList.ArrayList_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
// Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
// Daha sonra kullanıcıdan bir renk adı alın ve bu rengin ArrayList'te olup olmadığını ekrana yazdırın.

// Örnek çıktı:
// Aranan renk: Mavi
// Sonuç: Renk bulunamadı.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Kırmızı");
        colors.add("Yeşil");
        colors.add("Sarı");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranan renk: ");
        String searchedColor = scanner.nextLine();

        if (colors.contains(searchedColor)) {
            System.out.println("Sonuç: Renk bulundu.");
        } else {
            System.out.println("Sonuç: Renk bulunamadı.");
        }
    }
}
