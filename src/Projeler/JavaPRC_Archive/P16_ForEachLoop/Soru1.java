package Projeler.JavaPRC_Archive.P16_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
        int[] arr={2,7,3,9,5,3,2,8,8,5,4,2,8,9,6,4,3};
        List<Integer> yeniArr=new ArrayList<>();
        for (Integer each:arr) {
            if (!yeniArr.contains(each)){
                yeniArr.add(each);
            }
        }
        System.out.println(yeniArr);
    }
}
