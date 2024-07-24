package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı giriniz:");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;

        do {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }while (!(sayi==0));

        System.out.println(rakamlarToplami);
    }
}
