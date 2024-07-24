package Projeler.JavaPRC_Archive.P02_Data_Casting;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi=scan.nextInt();
        System.out.println((byte)sayi);
    }
}
