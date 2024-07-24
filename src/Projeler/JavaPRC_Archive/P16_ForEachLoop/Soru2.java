package Projeler.JavaPRC_Archive.P16_ForEachLoop;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        int[] arr={4,2,3};
        arrayElemanlarininKaresiniAl(arr);
    }

    private static void arrayElemanlarininKaresiniAl(int[] arr) {
        int toplam=0;
        for (Integer each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println(toplam);
    }
}
