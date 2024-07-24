package Projeler.JavaPRC_Archive.P11_WhileLoop;

import java.util.Scanner;

public class Soru7 {
    static char ilkKarakter;
    static char sonKarakter;
    public static void main(String[] args) {
      do {
          String sifre="";
          Scanner scan=new Scanner(System.in);
          System.out.println("Lütfen şifre giriniz:");
          String girilenSifre= scan.nextLine();
          sonKarakter=girilenSifre.charAt(girilenSifre.length()-1);
          ilkKarakter=girilenSifre.charAt(0);
          if (!(ilkKarakter>='a'&& ilkKarakter<='z')) System.out.println("İlk karakter küçük harf olmalı");
          if (!(sonKarakter>='0' &&sonKarakter<='9')) System.out.println("Son karakter sayi olmalı");
      }while (!((ilkKarakter>='a'&& ilkKarakter<='z')&&(sonKarakter>='0' &&sonKarakter<='9')));

        System.out.println("Şifreniz başarıyla kaydedildi");
    }
}
