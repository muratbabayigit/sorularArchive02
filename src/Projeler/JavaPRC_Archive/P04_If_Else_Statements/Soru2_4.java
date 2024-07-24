package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru2_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi kilometre olarak giriniz");
        int km= scan.nextInt();
        System.out.println("Lütfen dönüştürmek istediğiniz birimi giriniz: Metre> M ve Santimetre> S");
        char birim=scan.next().charAt(0);
        if (birim=='m'||birim=='M'){
            System.out.println("Girdiğiniz mesafenin metre değeri: "+km*1000);
        } else if (birim=='s'||birim=='S') {
            System.out.println("Girdiğiniz mesafenin santimetre değeri: "+km*1000*1000);
        }else System.out.println("İstediğiniz birim sisteme kayıtlı değil");
    }
}
