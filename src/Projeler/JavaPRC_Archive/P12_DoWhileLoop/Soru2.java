package Projeler.JavaPRC_Archive.P12_DoWhileLoop;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        String sifre="";

        do {
            System.out.println("Lütfen şifre giriniz");
            sifre=scan.nextLine();

            for (int i = 0; i < sifre.length(); i++) {
                if (!(sifre.charAt(i)>=32 && sifre.charAt(i)<=64)){
                    System.out.println("Şifre özel karakter içermelidir");
                    sayac++;


                }  if (!(sifre.charAt(i)>=65 && sifre.charAt(i)<=90)) {
                    System.out.println("Şifre büyük harf içermelidir");
                    sayac++;


                }  if (!(sifre.charAt(i)>=97 && sifre.charAt(i)<=122)) {
                    System.out.println("Şifre küçük harf içermelidir");
                    sayac++;


                }  if (sifre.length()<8) {
                    System.out.println("Şifre en az 8 karakter olmalıdır");
                    sayac++;

                }
                break;
            }
            if (sayac==0){
            System.out.println("ŞİFRENİZ KABUL EDİLMİŞTİR");}

        }while (sayac!=0);
    }
}
