package Projeler.JavaPRC_Archive.P02_Data_Casting;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki adet sayi giriniz: ");
        double sayi1 = scan.nextDouble();
        int sayi2 = scan.nextInt();
        double bolum = sayi1 / sayi2;
        System.out.println("Girilen sayilarin bölümü: " + (int) bolum);
    }
}
