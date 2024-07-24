package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C15_IfTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        double sayi1= scan.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        double sayi2= scan.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n " +
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme");
        int islem=scan.nextInt();

        if (islem==1) System.out.println("Toplam değeri: "+sayi1+sayi2);
        else if (islem==2) System.out.println("Fark değeri: "+(sayi1-sayi2));
        else if (islem==3) System.out.println("Çarpım değeri: "+sayi1*sayi2);
        else if (islem==4) System.out.println("Bölüm değeri: "+(sayi1/sayi2));
    }
}
