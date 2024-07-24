package Projeler.JavaPRC_Archive.P16_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
        String[] str={"Ali","Duru", "Kemal","Demez","Söylemez"};
        List<String> yeniStr=new ArrayList<>();
        for (String each:str
             ) {
            if (each.length()%2==0){
                yeniStr.add(each.substring(0,each.length()/2));
            }else
                yeniStr.add(each.substring((each.length()-1)/2));
        }
        System.out.println(yeniStr);
    }
}
