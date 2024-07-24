package Projeler.JavaPRC_Archive.P08_String_Manipulations;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        String sifre=scan.nextLine();

        int sayac=0;
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmalı");
            sayac++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            sayac++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("uzunluğu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac==0){
            System.out.println("şifreniz başarıyla kaydedildi");
        }


    }
}
