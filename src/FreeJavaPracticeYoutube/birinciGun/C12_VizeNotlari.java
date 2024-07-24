package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C12_VizeNotlari {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci vize notunu giriniz: ");
        double vize1= scan.nextDouble();
        System.out.println("İkinci vize notunu giriniz: ");
        double vize2= scan.nextDouble();
        System.out.println("Final notunu giriniz: ");

        double finalNotu= scan.nextDouble();
        double vizeOrt=(vize1+vize2)/2;
        double sonuc=(finalNotu*70/100)+(vizeOrt*30/100);
        System.out.println("sonuc = " + sonuc);

    }

}
