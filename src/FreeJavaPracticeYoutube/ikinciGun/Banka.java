package FreeJavaPracticeYoutube.ikinciGun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {
        int bakiye=1000;
        Scanner scan=new Scanner(System.in);
        System.out.println("KAPTÜS BANKASINA HOŞGELDİNİZ\n" +
                "MENÜ\n" +
                "1-BAKİYE ÖĞRENME\n" +
                "2-PARA YATIRMA\n" +
                "3-PARA ÇEKME\n" +
                "Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ:");
        String secim=scan.nextLine();
        try {
            switch (secim){
                case "1":{
                    System.out.println("Bakiyeniz "+bakiye+" TL'dir");break;
                }
                case "2":{
                    System.out.println("Yatirilacak tutar giriniz:");
                    int tutar=scan.nextInt();
                    bakiye+=tutar;
                    System.out.println("Hesabınıza "+tutar+ "TL yatırdınız, bakiyeniz "+bakiye+" TL'dir");break;
                }
                case "3":{
                    System.out.println("Çekilecek tutar giriniz:");
                    int miktar=scan.nextInt();
                    bakiye-=miktar;
                    System.out.println("Hesabınızdan "+bakiye+ "TL çektiniz, bakiyeniz "+bakiye+" TL'dir");break;

                }

            }
        } catch (InputMismatchException e) {
            if (secim.equalsIgnoreCase("q")){
                System.out.println("Hoşçakalın");
                System.exit(0);
            }else System.out.println("Yanlış seçim yaptınız");
        }
    }
}
