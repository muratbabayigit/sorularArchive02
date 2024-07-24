package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray.MultiDimension_001;

public class multidimension_1 {
    // 2x3'lük bir multidimension array oluşturun ve içine rastgele sayılar atayın.
// Sonra bu array'i iki boyutlu matris olarak ekrana yazdırın.

// Örnek çıktı:
// 1 2 3
// 4 5 6
public static void main(String[] args) {
    int[][] matrix = new int[2][3];
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            matrix[i][j] = (i * 3) + (j + 1);
        }
    }

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
}
