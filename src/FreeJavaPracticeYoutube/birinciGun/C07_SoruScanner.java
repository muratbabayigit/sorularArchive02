package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C07_SoruScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz:");
        int sayi= scan.nextInt();

        int birlerbasamagi=sayi%10;
        sayi=sayi/10;

        int onlarbasamagi=sayi%10;
        sayi=sayi/10;

        int yuzlerbasamagi=sayi%10;

        System.out.println("birlerbasamagi = " + birlerbasamagi);
        System.out.println("onlarbasamagi = " + onlarbasamagi);
        System.out.println("yuzlerbasamagi = " + yuzlerbasamagi);
    }
}
