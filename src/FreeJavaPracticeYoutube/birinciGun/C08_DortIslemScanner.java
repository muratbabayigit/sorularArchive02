package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C08_DortIslemScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi1= scan.nextInt();

        System.out.println("Lütfen ikinci bir sayi giriniz:");
        int sayi2= scan.nextInt();

        System.out.println(sayi1+" ve "+sayi2+" toplamı: "+ (sayi1+sayi2));

    }
}
