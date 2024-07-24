package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray;

import java.util.Arrays;

public class Soru3 {    public static void main(String[] args) {
    int[][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

    int yeniArrayLength=arr.length;

    int[] yeniArr=new int[yeniArrayLength];
    int toplam=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            toplam+=arr[i][j];
        }
        yeniArr[i]=toplam;
        toplam=0;
    }

    System.out.println(Arrays.toString(yeniArr));
}
}
