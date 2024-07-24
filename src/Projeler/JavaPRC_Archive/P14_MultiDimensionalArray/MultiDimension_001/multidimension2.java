package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray.MultiDimension_001;

import java.util.Scanner;

public class multidimension2 {
    public static void main(String[] args) {
        // 3x4'lük bir multidimension array oluşturun ve içine kullanıcıdan sayılar alın.
// Sonra bu array'in her satırının ortalamasını hesaplayarak ekrana yazdırın.

// Örnek girdi ve çıktı:
// Girilen sayılar: 1 2 3 4
//                  5 6 7 8
//                  9 10 11 12
// Ortalamalar: 2.5 6.5 10.5
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.print("Girilen sayılar: ");
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
            double average = sum / 4;
            System.out.print(average + " ");
        }
    }
}
