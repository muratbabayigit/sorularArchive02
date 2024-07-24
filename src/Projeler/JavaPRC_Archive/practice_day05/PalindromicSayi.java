package Projeler.JavaPRC_Archive.practice_day05;

public class PalindromicSayi {
    public static void main(String[] args) {
        /*
        palindromik sayı her iki tarafından da okundupunda aynı değeri ifade eden sayıdır.
        ÖRN: 9009 - 12321 - 121
         */

        //3 Basamaklı sayıların çarpımıyla oluşan en büyük palindromik sayıyı bulan kodu yazınız.

        int flag=1; // işlem sayısı
        int maxbas1=100; //3 basamaklı max 1. sayı
        int maxbas2=100; // 3 basmaklı max 2.sayı
        int maxbas3=100; // max1*max2

        for (int i = 1000; i >100 ; i--) {
            for (int j = 1000; j > i ; j--) {
                if(checkpalindromic(i*j)){
                    flag++;
                    if (maxbas3<i*j){  //max sayı < i*j
                        maxbas3=i*j;
                        maxbas1=i;
                        maxbas2=j;
                    }

                }
            }
        }
        System.out.println(flag); //işlem sayısı
        System.out.println("Max. Pal. Sayı= "+maxbas1+" * "+maxbas2+ " ="+maxbas3); //işlem sonucu
    }
    public static boolean checkpalindromic(int i) {
    boolean result=false;

    int sayi=i;
    int digit1=sayi%10;
    sayi/=10;
    int digit2=sayi%10;
    sayi/=10;
    int digit3=sayi%10;
    sayi/=10;
    int digit4=sayi%10;
    sayi/=10;
    int digit5=sayi%10;
    sayi/=10;
    int digit6=sayi%10;
    sayi/=10;
    int digit7=sayi;

    if(i<=1000000){
        if(digit1==digit6&&digit2==digit5&&digit3==digit4){
        result=true;
        }else{

        }
    }
        return result;
    }

}
