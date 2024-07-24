package Projeler.JavaPRC_Archive.P16_ForEachLoop.forEachLoop_01;

import java.util.ArrayList;

public class S1 {
    public static void main(String[] args) {
        // 1 ile 10 arasındaki sayıları bir ArrayList'e ekleyin.
// Ardından bu sayıları for each loop kullanarak ekrana yazdırın.

// Örnek çıktı:
// 1 2 3 4 5 6 7 8 9 10
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
