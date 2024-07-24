package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray;

public class Soru4 {
    public static void main(String[] args) {
        int[][] arr={{3,4,5},{2,1}};
        System.out.println(arraydekiElemanlariCarp(arr));
    }

    private static int arraydekiElemanlariCarp(int[][] arr) {
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }
        return carpim;
    }
}
