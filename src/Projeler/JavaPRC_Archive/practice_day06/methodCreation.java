package Projeler.JavaPRC_Archive.practice_day06;

import java.util.Scanner;

public class methodCreation {
     /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.
     */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
         int sayi= scan.nextInt();
         System.out.println(asalSayiKontrol(sayi));
     }

    private static String asalSayiKontrol(int sayi) {
       String sonuc="sayı asal sayıdır";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="sayı asal sayı değildir";
            }
        }
        return sonuc;

    }

}
