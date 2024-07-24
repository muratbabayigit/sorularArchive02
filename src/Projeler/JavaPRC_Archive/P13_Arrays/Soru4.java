package Projeler.JavaPRC_Archive.P13_Arrays;

public class Soru4 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,5,8,3,5,7,5,2,5};
        istenenElemaniAra(arr,7);
    }

    private static void istenenElemaniAra(int[] arr, int istenen) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenen){
                sayac++;
            }
        }
        if (sayac!=0){
            System.out.println("Array'de aradığınız "+istenen+" toplam "+sayac+" adet var");
        }else System.out.println("Array'de aradığınız eleman yok");
    }
}
