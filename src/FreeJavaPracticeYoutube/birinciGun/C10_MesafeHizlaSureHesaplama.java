package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C10_MesafeHizlaSureHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafe giriniz:");
        int mesafe= scan.nextInt();

        System.out.println("Lütfen ortalama hiz giriniz");
        int hiz=scan.nextInt();

        System.out.println("Tahmini varış süreniz:" +(double)mesafe/hiz);
    }
}
