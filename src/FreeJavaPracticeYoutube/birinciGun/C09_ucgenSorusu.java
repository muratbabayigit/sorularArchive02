package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C09_ucgenSorusu {
    public static void main(String[] args) {
        //bir dikdörtgenin iki dik kenarını alarak hipotenüsünü hesaplayarım
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz:");
        int birinciKenar= scan.nextInt();

        System.out.println("Üçgenin ikinci kenarını giriniz:");
        int ikinciKenar= scan.nextInt();

        double hipotenus=Math.sqrt((birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar));
        System.out.println("hipotenus = " + hipotenus);
    }
}
