package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        int[][] arr={{3,4,5},{2,3,6,7}};

        int enKucukIndex=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i].length<enKucukIndex){
                    enKucukIndex=arr[i].length;
                }
            }


        int[] yeniArr=new int[enKucukIndex];
        int toplam=0;
        for (int i = 0; i < yeniArr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam+=arr[j][i];
            }
            yeniArr[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(yeniArr));
    }
}
