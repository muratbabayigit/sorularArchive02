package Projeler.JavaPRC_Archive.P16_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {
        int[] arr1={4,2,3,7,2,8,3,6};
        int[] arr2={4,12,3,6,7,5};
        List<Integer> ortakList=new ArrayList<>();
        for (Integer each:arr1
             ) {
            for (Integer each2:arr2
                 ) {
                if (each==each2 && !ortakList.contains(each)){
                    ortakList.add(each);
                }
            }

        }
        System.out.println(ortakList);
    }
}
