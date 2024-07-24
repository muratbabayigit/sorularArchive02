package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir double bir int sayi giriniz: ");
        double sayi1= scan.nextDouble();
        int sayi2= scan.nextInt();
        double toplam, carpim;
        toplam=sayi1+sayi2;
        carpim=sayi1*sayi2;
        System.out.println("Girdiginiz degerlerin toplami: "+toplam+" ve carpimi: "+carpim+" dir.");
    }
}
