package Projeler.JavaPRC_Archive.P07_Switch_Statements;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ay numarasını giriniz:");
        int ay= scan.nextInt();

        switch (ay) {
            case 11:
            case 12:
            case 1:
                System.out.println("Kış");break;
            case 2:
            case 3:
            case 4:
                System.out.println("İlkbahar");break;
            case 5:
            case 6:
            case 7:
                System.out.println("Yaz");break;
            case 8:
            case 9:
            case 10:
                System.out.println("Sonbahar");break;
            default:
                System.out.println("Yanlış giriş");
        }
    }
}
