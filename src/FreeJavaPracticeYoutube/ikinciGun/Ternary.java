package FreeJavaPracticeYoutube.ikinciGun;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println("__________1.YÖNTEM__IF________");
        if (sayi>=0){
            if (sayi>10){
                System.out.println("Pozitif Sayi");
            }else {
                System.out.println("Rakam");
            }
        }else {
            System.out.println("Negatif Sayi");
        }

        System.out.println("__________2.YÖNTEM__TERNARY________");
        String sonuc=(sayi>=0)? (sayi>9) ? ("Pozitif Sayi"):("Rakam"):("Negatif Sayi");
        System.out.println(sonuc);


    }
}
