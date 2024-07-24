package Projeler.JavaPRC_Archive.practice_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {         /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
     Scanner scan=new Scanner(System.in);
     //System.out.println("Lütfen aşğıdaki bilgileri giriniz!");
     //System.out.print("Adınız: ");
     //String name=scan.nextLine();
     //System.out.println();
     //System.out.print("Soyadınız: ");
     //String surname=scan.nextLine();
     //System.out.println();
     //System.out.println("Yaşınız: ");
     //int yas = scan.nextInt();
     //System.out.println();
     //System.out.print("Mail Adresiniz: ");
     //String mail=scan.next();
     //System.out.println();
     //System.out.print("Şifreniz: ");
     //String pass= scan.next();
     //System.out.println();
     //System.out.println(" ****       KAYIT BAŞARILI      *****");
     //System.out.println("Adınız: "+name);
     //System.out.println("Soyadınız: "+surname);
     //System.out.println("Yaşınız: "+yas);
     //System.out.println("Mail Adresiniz: "+mail);
     //System.out.println("Şifreniz: "+pass);
     //System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");

     //     /*
     //  2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
     //  üçgenin alanını hesaplayıp yazdırın
     //              */

     //ystem.out.println("Lütfen alanı hesaplanacak olan üçgenin ilgili ayrıt değerlerini giriniz");
     //ystem.out.print("Üçgenin bir kenarının uzunluğunu giriniz: ");
     //ouble kenar= scan.nextDouble();
     //ystem.out.print("O kenara ait yüksekliği giriniz: ");
     //ouble yukseklik= scan.nextDouble();
     //ystem.out.println("============ Bilgileri Girilen Üçgenin Alan Hesabı Sonucu ============ ");
     //ystem.out.println("Üçgenin alanı : "+((kenar*yukseklik)/2));

        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
         */

        System.out.println("Lütfen iki adet sayı giriniz");
        System.out.print("Birinci Sayı: ");
        double sayi1= scan.nextDouble();
        System.out.print("İkinci Sayı: ");
        double sayi2= scan.nextDouble();
        System.out.println("Girdiğiniz 1. Sayı:"+sayi1+"'dir\n" +
                "Girdiğiniz 2. sayı: "+sayi2+"'dir");
        System.out.println("------- Hokus Pokus -------");
        //sayi1=10 sayi2=15
        sayi1=sayi1+sayi2;   //sayi1=25
        sayi2=sayi1-sayi2;  //sayi2=10
        sayi1=sayi1-sayi2;  //sayi1=15

        System.out.println("Girdiğiniz değerler yer değiştirdi\n"+"1. Sayı: "+sayi1+" oldu\n"
        +"2. Sayı: "+sayi2+" oldu");
    }
}
