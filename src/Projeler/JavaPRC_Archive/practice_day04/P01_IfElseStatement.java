package Projeler.JavaPRC_Archive.practice_day04;

import java.util.Scanner;

public class P01_IfElseStatement {
    public static void main(String[] args) {
        /*
        Soru: kenar değerleri girilen bir üçgenin dik üçgen olup olmadığını kontrol edip dönüt veren kod dizisini yazınız

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol edilecek üçgenin kenarlarının uzunluklarını giriniz: ");
        System.out.print("Birinci kenarın uzunluğu: ");
        int a = scan.nextInt();
        System.out.print("İkinci kenar uzunluğu: ");
        int b = scan.nextInt();
        System.out.print("Üçüncü kenar uzunluğu: ");
        int c = scan.nextInt();
        System.out.println("============================ 1. Çözüm =============================");
        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else if ((b * b) + (c * c) == (a * a)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else {
            System.out.println("Girdiğiniz değerlere sahip üçgen bir dik üçgen değildir");
        }

        System.out.println("============================ 2. Çözüm =============================");
        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
            /*
             ||:OR (VEYA) işareti ile yazılanlardan sadece birinin doğrulanması yeterlidir.
             &&: AND (VE) işareti ile yazılanların tamamı doğru olması gerekir
             */

            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir.");
        } else {
            System.out.println("Girdiğiniz değerlere sahip bir üçgen dik üçgen değildir");
        }
        // CI-CD: Contunie Integration

    }
}
