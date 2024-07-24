package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C17_VucutKitleIndexi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen boyunuzu metre olarak giriniz");
        double boy= scan.nextDouble();

        double vki=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+vki);

        if (vki<=20) System.out.println("oldukca zayifsiniz");
        else if (vki>20 && vki<=25) System.out.println("normal sinirlardasiniz");
        else if (vki>25 && vki<=30) System.out.println("sisman kategoridesiniz");
        else if (vki>30) System.out.println("obezite riskiniz çok yüksek");
    }
}
