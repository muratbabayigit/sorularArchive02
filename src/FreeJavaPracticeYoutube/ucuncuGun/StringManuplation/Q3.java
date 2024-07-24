package FreeJavaPracticeYoutube.ucuncuGun.StringManuplation;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
            //Kullanıcıdan alınan Ahmet Emin Yılmaz gibi ismi A.E.Y. formatda yazdır
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ad soyad girişi yapınız");
        String adsoyad=scan.nextLine();

        System.out.println(adsoyad.substring(0, 1)+"."
                +adsoyad.substring(adsoyad.indexOf(" ")+1,adsoyad.indexOf(" ")+2)+"."+
                adsoyad.charAt(adsoyad.lastIndexOf(" ")+1)+".");

    }
}
