package Projeler.JavaPRC_Archive.P07_Switch_Statements;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gün numarasını giriniz:");
        int gun= scan.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");break;
            default:
                System.out.println("Yanlış giriş");break;
        }
    }
}
