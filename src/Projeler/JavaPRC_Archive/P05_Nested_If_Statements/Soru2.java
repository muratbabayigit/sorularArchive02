package Projeler.JavaPRC_Archive.P05_Nested_If_Statements;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adetini ve liste fiyatını giriniz: ");
        int adet=scan.nextInt();
        double fiyat= scan.nextDouble();
        System.out.println("Müşteri kartınız var mı: E/H");
        char kart=scan.next().charAt(0);
        if (kart=='E'||kart=='e'){
            if (adet>10){
                System.out.println("%20 indirimli ödemeniz gereken tutar: "+fiyat*adet*0.8);
            }
            else System.out.println("%15 indirimli ödemeniz gereken tutar: "+fiyat*adet*0.85);
        }
        else if (kart=='H'||kart=='h') {
            if (adet>10){
                System.out.println("%15 indirimli ödemeniz gereken tutar: "+fiyat*adet*0.85);
            }
            else System.out.println("%10 indirimli ödemeniz gereken tutar: "+fiyat*adet*0.90);
        }else System.out.println("Yanlış giriş yaptınız");
    }
}

