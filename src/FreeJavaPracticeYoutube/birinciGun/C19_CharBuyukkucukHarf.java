package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C19_CharBuyukkucukHarf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>='A'&& karakter<='Z') System.out.println("Büyük harf");
        else if (karakter>='a'&& karakter<='z') {
            System.out.println("Küçük harf");

        }else System.out.println("Hatalı giriş");
    }
}
