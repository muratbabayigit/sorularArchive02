package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C18_KanBagisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= scan.nextInt();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo=scan.nextDouble();

        if (yas<18) System.out.println("18 yaşından küçükler kan bağışı yapamaz.");
        else if (yas>18 && kilo<50) System.out.println("Kan vermek için kilonuzun en az 50 olması gerekir");
        else System.out.println("Kilo verebilirsiniz");
    }
}
