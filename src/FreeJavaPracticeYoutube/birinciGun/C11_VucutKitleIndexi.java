package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C11_VucutKitleIndexi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen boyunuzu metre olarak giriniz");
        double boy= scan.nextDouble();

        double vki=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+vki);
    }
}
