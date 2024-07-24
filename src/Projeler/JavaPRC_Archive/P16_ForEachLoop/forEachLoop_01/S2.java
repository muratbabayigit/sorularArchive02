package Projeler.JavaPRC_Archive.P16_ForEachLoop.forEachLoop_01;

import java.util.ArrayList;
import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
// Bu notların ortalamasını hesaplayarak ekrana yazdırın.

// Örnek çıktı:
// Notların ortalaması: 78.5

        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Not " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / grades.size();
        System.out.println("Notların ortalaması: " + average);
    }
}
