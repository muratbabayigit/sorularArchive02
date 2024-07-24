package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Başlangıç değeri giriniz:");
        int baslangic= scan.nextInt();
        System.out.println("Bitiş değeri giriniz:");
        int bitis=scan.nextInt();
        int toplam=0;
        if (baslangic<bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
            System.out.println("Sayilarin toplami: " + toplam);
        }else {
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;
            }
            System.out.println("Sayilarin toplami: " + toplam);
        }
    }
}
