package FreeJavaPracticeYoutube.ucuncuGun.StringManuplation;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ad soyad girişi yapınız");
        String adsoyad=scan.nextLine();

        String isim=adsoyad.substring(0, adsoyad.indexOf(" "));
        System.out.println("isim = " + isim);
        String soyisim=adsoyad.substring(adsoyad.indexOf(" ")+1);
        System.out.println("soyisim = " + soyisim);

    }
}
