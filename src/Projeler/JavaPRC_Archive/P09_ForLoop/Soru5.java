package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("20 den küçük bir sayi giriniz:");
        int girilenSayi= scan.nextInt();
        int faktoryel=1;
        if (girilenSayi<20){
            for (int i = 1; i <=girilenSayi ; i++) {
                faktoryel*=i;
            }
            System.out.println("Girilen sayinin faktöryel değeri: "+faktoryel);
        }else System.out.println("Yanlış giriş yaptınız");
    }
}
