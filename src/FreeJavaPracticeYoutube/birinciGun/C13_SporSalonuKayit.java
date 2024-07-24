package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C13_SporSalonuKayit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ad,soyad,yas,kilo,boy;
        int sure;
        System.out.println("Lütfen adınızı giriniz: ");
        ad=scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz: ");
        soyad=scan.nextLine();
        System.out.println("Lütfen yasınızı giriniz: ");
        yas=scan.nextLine();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo=scan.nextLine();
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy=scan.nextLine();
        System.out.println("Salona ne kadar devam edeceğinizi ay olarak giriniz");
        sure=scan.nextInt();

        int toplamUcret=sure*20;
        System.out.println("Sn. "+ad+" bey ödemeniz gereken tutar "+toplamUcret+" $'dir");
    }
}
