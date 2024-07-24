package FreeJavaPracticeYoutube.ikinciGun;

import java.util.Scanner;

public class AyGun {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay sayısı giriniz");
        int ay= scan.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gün sürüyor");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gün sürüyoe");
            case 2:
                System.out.println("Yıl giriniz");
                int yil= scan.nextInt();
                if (yil%4==0){
                    System.out.println("Girdiğiniz ay 29 gün sürer");
                }else System.out.println("Girdiğiniz ay 28 gün sürer");
        }
    }
}
