package Projeler.JavaPRC_Archive.P15_ArrayList.ArrayList_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
// Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.

// Örnek çıktı:
// Toplam: 23
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Toplam: " + sum);
    }
}
