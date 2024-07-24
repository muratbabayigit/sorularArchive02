package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C21_VizeFinalNotlar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci vize notunu giriniz: ");
        double vize1= scan.nextDouble();
        System.out.println("İkinci vize notunu giriniz: ");
        double vize2= scan.nextDouble();
        System.out.println("Final notunu giriniz: ");


        double finalNotu= scan.nextDouble();
        double vizeOrt=(vize1+vize2)/2;
        System.out.println("Lütfen vizenin yüzdesini giriniz: ");
        double vizeyuzde= scan.nextDouble();
        System.out.println("Lütfen final yüzdesini giriniz");
        double finalyuzde= scan.nextDouble();
        double sonuc=(finalNotu*finalyuzde/100)+(vizeOrt*vizeyuzde/100);
        System.out.println("sonuc = " + sonuc);

        if (sonuc>=50) System.out.println("Tebrikler dersi geçtiniz");
        else System.out.println("Maalesef kaldınız");
    }
}
