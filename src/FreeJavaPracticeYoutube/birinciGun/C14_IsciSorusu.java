package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C14_IsciSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir işçi bu işi kaç günde bitirir");
        int birIscininBitirmeSuresi=scan.nextInt();

        System.out.println("Toplam kaç işçi çalışacak");
        int isciSayisi=scan.nextInt();

        int toplamSure=birIscininBitirmeSuresi/isciSayisi;
        System.out.println("İşin tahmini bitiş süresi "+toplamSure+" gündür.");
    }
}
