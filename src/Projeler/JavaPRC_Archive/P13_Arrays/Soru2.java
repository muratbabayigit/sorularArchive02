package Projeler.JavaPRC_Archive.P13_Arrays;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        int[] arr={-2,3,4,-5,5,-3,-6,-7};
        System.out.println(arraydekiPozitifSayilariTopla(arr));
    }

    private static int arraydekiPozitifSayilariTopla(int[] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
            toplam+=arr[i];
            }
        }
        return toplam;

    }
}
