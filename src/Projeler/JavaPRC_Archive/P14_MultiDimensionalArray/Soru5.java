package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray;

public class Soru5 {
    public static void main(String[] args) {
        int[][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}; //output [28]
        sonElementlerToplaminiYazdir(arr);
    }

    private static void sonElementlerToplaminiYazdir(int[][] arr) {


        int toplam=0;

            for (int j = 0; j < arr.length; j++) {
                toplam+=arr[j][arr[j].length-1];
            }

        System.out.println("toplam = " + toplam);
    }
}
