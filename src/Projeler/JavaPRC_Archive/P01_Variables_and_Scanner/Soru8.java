package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tane sayı giriniz: ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Girdiğiniz sayilarin yer değiştirmiş hali: "+sayi1+" ve "+sayi2+" dir.");
    }
}
