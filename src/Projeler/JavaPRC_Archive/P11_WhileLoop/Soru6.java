package Projeler.JavaPRC_Archive.P11_WhileLoop;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Toplamak üzere sayi giriniz:");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }while (!(toplam>=500));
        System.out.println("Girilen sayilar toplam: "+toplam);
    }
}
