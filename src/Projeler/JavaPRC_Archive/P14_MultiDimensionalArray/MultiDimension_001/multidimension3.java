package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray.MultiDimension_001;

import java.util.Random;

public class multidimension3 {
    public static void main(String[] args) {
        // 3x3'lük bir multidimension array oluşturun ve tüm elemanları 0 ile 9 arasında rastgele sayılar ile doldurun.
        // Ardından bu array'in en büyük elemanını bulup ekrana yazdırın.

        // Örnek çıktı: En büyük eleman: 8
        int[][] matrix = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        int max = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("En büyük eleman: " + max);
    }
}
