package Projeler.JavaPRC_Archive.P13_Arrays;

import java.util.Arrays;

public class Soru7 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrayeElemanEkle(arr, 8)));
    }

    private static int[] arrayeElemanEkle(int[] arr, int add) {
        int[] yeniArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[arr.length]=add;
        return yeniArr;
    }
}
