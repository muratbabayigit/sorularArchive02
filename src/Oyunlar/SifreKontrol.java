package Oyunlar;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("şifre giriniz");
        String sifre = scanner.nextLine();
        sifreKontrol(sifre);
    }

    public static void sifreKontrol(String sifre) {
        boolean flag = true;
        int sayac = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (!(Character.isLetterOrDigit(sifre.charAt(i)))) {
                System.out.println("Bir parola yalnızca harf ve rakamlardan oluşur.");
                flag = false;
                break;
            }
            if (Character.isDigit(sifre.charAt(i))) {
                sayac++;
            }
        }
        if (sifre.length() < 10) {
            flag = false;
            System.out.println("Bir parola en az on karakterden oluşmalıdır");
        }
        if (sayac < 2) {
            flag = false;
            System.out.println("Parola en az iki rakam içermelidir.");
        }
        if (flag) {
            System.out.println("başarılı");
        }
    }
}
