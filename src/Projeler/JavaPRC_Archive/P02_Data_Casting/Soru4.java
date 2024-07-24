package Projeler.JavaPRC_Archive.P02_Data_Casting;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki adet double sayi giriniz: ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double bolum=sayi1/sayi2;
        System.out.println("Girilen sayilarin bölümü: "+(int)bolum);
    }
}
