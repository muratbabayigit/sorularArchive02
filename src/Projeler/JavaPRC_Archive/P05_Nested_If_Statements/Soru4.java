package Projeler.JavaPRC_Archive.P05_Nested_If_Statements;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz:");
        String gun = scan.next();

        if (gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Şimdi çalışma zamani, tatile 4 gün var");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Şimdi çalışma zamani, tatile 3 gün var");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Şimdi çalışma zamanı, tatile 2 gün var");
        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Şimdi çalışma zamanı tatile 1 gün var");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("Şimdi çalışma zamani, tatil yarın");
        } else if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")) {
            System.out.println("Şimdi dinlenme zamani");
        }else System.out.println("Yanlış giriş yaptınız");

    }
}