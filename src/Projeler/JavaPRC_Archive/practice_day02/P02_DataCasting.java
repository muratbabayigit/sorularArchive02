package Projeler.JavaPRC_Archive.practice_day02;

import java.util.Scanner;

public class P02_DataCasting {
    /*
      1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
      ipucu: double>float>long>int>short>byte


     */
    public static void main(String[] args) {
       // int a = 8, b = 3, c = 9;
       // int toplam = (a + b + c);
       // System.out.println("Toplam= " + (double) toplam);
       // System.out.println("Toplam= " + (long) toplam);


         /*
        2- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
         */
     Scanner murat=new Scanner(System.in);
     System.out.println("Lütfen iki adet ondalıklı sayı giriniz:");
     double sayi1= murat.nextDouble();
     double sayi2=murat.nextDouble();
     int sonuc=(int)(sayi1/sayi2);
     System.out.println("sonuc = " + sonuc);




    }
}
