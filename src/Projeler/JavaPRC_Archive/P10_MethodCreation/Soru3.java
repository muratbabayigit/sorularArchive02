package Projeler.JavaPRC_Archive.P10_MethodCreation;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edilmek üzere bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));
    }

    private static String asalSayiKontrolEt(int sayi) {
        String sonuc="sayi asal";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc= "asal değil";
            }
        }
        return sonuc;
    }
}
