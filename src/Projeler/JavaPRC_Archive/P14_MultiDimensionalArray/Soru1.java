package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray;

public class Soru1 {
    public static void main(String[] args) {
        int[][] arr={{3,4,5},{2,3,6,7}};
        arraydekiCiftSayilaritopla(arr);



    }

    private static void arraydekiCiftSayilaritopla(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
