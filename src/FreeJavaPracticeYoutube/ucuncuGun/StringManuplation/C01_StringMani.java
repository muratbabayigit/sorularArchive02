package FreeJavaPracticeYoutube.ucuncuGun.StringManuplation;

public class C01_StringMani {
    public static void main(String[] args) {
        String str= "Good";

        System.out.println("str.indexOf(\"G\") = " + str.indexOf("G"));//0
        System.out.println("str.indexOf(\"od\") = " + str.indexOf("od"));//2

        System.out.println("str.indexOf(\"H\") = " + str.indexOf("H"));//-1
        System.out.println("========================================");

        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o"));//1

        //lastIndexOf harfi sondan başlayarak arar ama index standart şekilde baştan sayar
        System.out.println("str.lastIndexOf(\"o\") = " + str.lastIndexOf("o"));//2

        //charAt()
        System.out.println("str.charAt(3) = " + str.charAt(3));//d
        System.out.println("str.charAt(2) = " + str.charAt(2));//o
        System.out.println("str.charAt(1) = " + str.charAt(1));//o
        System.out.println("str.charAt(0) = " + str.charAt(0));//G

        //subString()
        String text="WiseQuarter ile java cok guzel";
        System.out.println("text.substring(5) = " + text.substring(5));//uarter ile java çok guzel
        System.out.println("text.substring(5,7) = " + text.substring(5, 7));//ua
       // System.out.println("text.substring(40) = " + text.substring(40));//StringIndexOutOfBoundsException

        //replaceAll()
        System.out.println(text.replaceAll("\\w", "*"));

        //trim(): önceki ve arkadaki boşlukları siler, ortada varsa karışmaz
        String txt2="         Rize         ";
        System.out.println(txt2.trim());

        //replace
        String txt3="WiseQuarter";
        System.out.println(txt3.replace("W", "L"));//LiseQuarter
        String txt31="WiseWuarter";
        System.out.println(txt31.replace("W", "L"));//LiseLuarter

        System.out.println(txt31.replaceFirst("W", "L"));//LiseWuarter

        //contains()
        String merhaba="Merhaba";

        System.out.println(merhaba.contains("aba"));//true
        System.out.println(merhaba.contains("abab"));//false

        //equals()
        String text5="Hello";
        String text6="Hellow";
        System.out.println(text5.equals(text6));//false

        //valueOf()  parseInt()
        String sayi1="5";
        System.out.println(sayi1+1);//51
        Integer sayi2=5;
        System.out.println(sayi2+1);//6

        Integer ornekSayi=Integer.valueOf(sayi1);
        System.out.println(ornekSayi+1);//6

    }
}
