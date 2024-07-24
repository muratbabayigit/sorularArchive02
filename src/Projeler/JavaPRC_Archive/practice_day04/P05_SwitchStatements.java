package Projeler.JavaPRC_Archive.practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        // Kulanıcıdan o günün hangi gün olduğunu girmesini isteyip
        //Haftanın kaçıncı günü oldupunu yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.print("Bugün Günlerden Hangi Gün: ");
        String gun= scan.next();
        gun=gun.toLowerCase();
        switch (gun){
            case "pazartesi" :
         //switch case durumunda eğer case sayı ise direk yazılır case metin ise " " arasında yazılır
                System.out.println(gun+" Haftanın 1. günüdür");
                break;
            case "salı":
                System.out.println(gun+" Haftanın 2. günüdür");
                break;
            case "çarşamba":
                System.out.println(gun+" Haftanın 3. günüdür");
                break;
            case "perşembe":
                System.out.println(gun+" Haftanın 4. günüdür");
                break;
            case "cuma":
                System.out.println(gun+" Haftanın 5. günüdür");
                break;
            case "cumartesi":
                System.out.println(gun+" Haftanın 6. günüdür");
                break;
            case "pazar":
                System.out.println(gun+" Haftanın 7. günüdür");
                break;
            default:
                System.out.println("Yanlış gün girdiğiniz");
        }


    }
}
