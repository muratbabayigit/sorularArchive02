package FreeJavaPracticeYoutube.birinciGun;

public class C03_SayiRakamlariYazdir {
    //verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdıralım
    //output: 1
    //        2
    //        3
    //        4
    //        5
    public static void main(String[] args) {


    //Birler basamağını bulmak için
    int sayi=12345;
    int birlerbasamagi=sayi%10;
    sayi=sayi/10; //sayı burada 1234 haline gelir
    int onlarbasamagi=sayi%10;
    sayi=sayi/10;//sayı burada 123 haline gelir
    int yuzlerbasamagi=sayi%10;
    sayi=sayi/10;//sayı burada 12 haline gelir
    int binlerbasamagi=sayi%10;
    sayi=sayi/10;//sayı burada 1 haline gelir
    int onbinlerbasamagi=sayi%10;
    sayi=sayi/10;//sayı burada 0 haline gelir

        System.out.println(onbinlerbasamagi+"\n"+
                           binlerbasamagi+"\n"+
                           yuzlerbasamagi+"\n"+
                         onlarbasamagi+"\n"+
                           birlerbasamagi);
}
}
