package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgen için iki kenar uzunlugu giriniz:");
        double kenar1=scan.nextDouble();
        double kenar2= scan.nextDouble();
        double alan;
        alan=kenar1*kenar2;
        System.out.println("Dikdörtgenin alanı: "+alan);
    }
}
