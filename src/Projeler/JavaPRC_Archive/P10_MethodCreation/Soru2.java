package Projeler.JavaPRC_Archive.P10_MethodCreation;

import java.util.Scanner;

public class Soru2 {
    static String duzenliStr="";
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyisim=scan.nextLine();

        System.out.println(isimSoyisimDuzenle(isim, soyisim));
    }

    private static String isimSoyisimDuzenle(String isim, String soyisim) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();
        duzenliStr=isim+" "+soyisim;
        return duzenliStr;
    }
}
