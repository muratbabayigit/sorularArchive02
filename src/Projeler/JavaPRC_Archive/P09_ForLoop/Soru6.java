package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("20 den küçük bir sayi giriniz:");
        int girilenSayi= scan.nextInt();
        int faktoryel=1;
        String aradakiler="";
        if (girilenSayi<20){
            for (int i = girilenSayi; i >=1 ; i--) {
                faktoryel*=i;
                aradakiler+=i;

                if (i != 1) {
                    aradakiler += " * ";
                }
            }
            System.out.print(girilenSayi+"!="+aradakiler+"= " +faktoryel);

        }else System.out.println("Yanlış giriş yaptınız");

    }
}
