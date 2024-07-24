package Projeler.JavaPRC_Archive.P13_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrayeIkiEkle(arr)));


    }

    private static int[] arrayeIkiEkle(int[] arr) {
       int[] yeniArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i]+2;

        } arr=yeniArr;
        return arr;
    }
}
