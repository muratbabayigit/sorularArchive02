package Projeler.JavaPRC_Archive.practice_day04;

import java.util.Scanner;

public class P03_ternaryOperators {
    public static void main(String[] args) {
        /*
        Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz üçgenin kenar değerlerini giriniz.");
        System.out.print("Kenar-1: ");
        double kenar1 = scan.nextDouble();
        System.out.print("Kenar-2: ");
        double kenar2 = scan.nextDouble();
        System.out.print("Kenar-3: ");
        double kenar3 = scan.nextDouble();


        System.out.println(kenar1 > 0 && kenar2 > 0 && kenar3 > 0 ? //bir
          kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3 ? //iki
          "Girdiğiniz değerler bir ikizkenar üçgene aittir" ://iki
          "Girdiğiniz üçgen ikizkenar değildir" ://bir
          "Yanlış Değer girdiğiniz ");


    }
}
