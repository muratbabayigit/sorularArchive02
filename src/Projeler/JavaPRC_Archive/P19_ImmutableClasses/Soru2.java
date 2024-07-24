package Projeler.JavaPRC_Archive.P19_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
       // list.add(7);
        for (String s:list
             ) {
            System.out.println(s);

        }
    }
}
