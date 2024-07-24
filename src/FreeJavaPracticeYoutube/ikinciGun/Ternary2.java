package FreeJavaPracticeYoutube.ikinciGun;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char chr = scan.next().charAt(0);

        System.out.println("__________1.YÖNTEM__IF________");
        if (chr >= 'a' && chr<='z'||chr >= 'A' && chr<='Z') {
            if (chr >= 97 && chr<=122) {
                System.out.println("Küçük harf");
            } else {
                System.out.println("Büyük harf");
            }
        } else {
            System.out.println("Harf değil");
        }

        System.out.println("__________2.YÖNTEM__TERNARY________");
        String sonuc = (chr >= 'a' && chr<='z'||chr >= 'A' && chr<='Z') ? (chr >= 97 && chr<=122) ? ("Küçük harf") : ("Büyük harf") : ("Harf değil");
        System.out.println(sonuc);
    }
}
