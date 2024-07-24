package Projeler.JavaPRC_Archive.P19_ImmutableClasses;

public class Soru1 {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;
       String b="2cfalse";
        if (a=="2cfalse") System.out.println("==");
        if (b=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
    }
}
