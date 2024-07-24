package Projeler.JavaPRC_Archive.P11_WhileLoop;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üssü alınacak bir sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println("üs miktarını giriniz:");
        int us= scan.nextInt();

        usAl(sayi,us);
    }

    private static void usAl(int sayi, int us) {

        int sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
