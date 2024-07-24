package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,1,2,3,4,5,10,2,7};
        System.out.println("tekrarlariSil(arr) = " + tekrarlariSil(arr));

    }

    private static List<Integer> tekrarlariSil(int[] arr) {
        List<Integer> duzenli=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(duzenli.contains(arr[i]))){
                duzenli.add(arr[i]);
            }
        }

        return duzenli;
    }
}
