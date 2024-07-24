package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ad,soyad,yas,boy,kilo;
        System.out.println("Lütfen adınızı giriniz:");
        ad= scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz:");
        soyad= scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz:");
        yas= scan.nextLine();

        System.out.println("Lütfen boyunuzu giriniz:");
        boy= scan.nextLine();

        System.out.println("Lütfen kilonuzu giriniz:");
        kilo= scan.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);


    }
}
