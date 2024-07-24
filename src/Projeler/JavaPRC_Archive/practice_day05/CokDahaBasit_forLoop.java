package Projeler.JavaPRC_Archive.practice_day05;

import java.util.Scanner;

public class CokDahaBasit_forLoop {
    /*
  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
  dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
  baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
   */

    public static void main(String[] args) {
        Scanner wise = new Scanner(System.in);
        System.out.print("Başlangıç Değerini Giriniz: ");
        int basDeger = wise.nextInt();
        System.out.print("Bitiş Değerini Giriniz: ");
        int bitDeger = wise.nextInt();

        int toplam = 0;
        if (basDeger > bitDeger) {
            System.out.println("Başlangıç değeri Bitiş Değerinden büyük olamaz");
        } else {
            for (int i = basDeger; i <= bitDeger; i++) {
                toplam += i;

            }
            System.out.println("Girilen degeler arasındaki sayıların toplamı = "+toplam);
        }



    }
}
