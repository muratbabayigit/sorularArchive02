package Projeler.JavaPRC_Archive.P08_String_Manipulations;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyisim=scan.nextLine();

        if(isim.length()>soyisim.length()){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
            soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()).toLowerCase();
            System.out.println(isim+" "+soyisim);
        }
        if (isim.length()<soyisim.length()){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).toLowerCase();
            soyisim=soyisim.toUpperCase();
            System.out.println(isim+" "+soyisim);
        }
    }
}
