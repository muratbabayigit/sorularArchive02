package Projeler.JavaPRC_Archive.P11_WhileLoop;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;
        while (sayi>0) {
            rakamlarToplami += sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println("rakamlar toplami: "+rakamlarToplami);
    }
}
