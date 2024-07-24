package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        harfler.add("a");
        harfler.add("mea");
        harfler.add("culpa");
        harfler.add("enigma");
        harfler.add("voice");

        System.out.println(istenmeyenHarfliElementiSil(harfler,"e"));
    }

    private static List<String> istenmeyenHarfliElementiSil(List<String> harfler,String str) {
        List<String> yeniList=new ArrayList<>();
        for (int i = 0; i < harfler.size(); i++) {
            if (!harfler.get(i).contains(str)){
               yeniList.add(harfler.get(i));
            }
        }
        return yeniList;
    }
}
