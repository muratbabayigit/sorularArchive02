package Projeler.JavaPRC_Archive.P07_Switch_Statements;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();
        int onlarBasamagi=sayi/10;
        int birlerBasamagi=sayi%10;
        String yazi="";

        switch (onlarBasamagi){
            case 1:
                yazi+="on";break;
            case 2:
                yazi+="yirmi";break;
            case 3:
                yazi+="otuz";break;
            case 4:
                yazi+="kırk";break;
            case 5:
                yazi+="elli";break;
            case 6:
                yazi+="altmış";break;
            case 7:
                yazi+="yetmiş";break;
            case 8:
                yazi+="seksen";break;
            case 9:
                yazi+="doksan";break;

        }
        switch (birlerBasamagi){
            case 1:
                yazi+="bir";break;
            case 2:
                yazi+="iki";break;
            case 3:
                yazi+="üç";break;
            case 4:
                yazi+="dört";break;
            case 5:
                yazi+="beş";break;
            case 6:
                yazi+="altı";break;
            case 7:
                yazi+="yedi";break;
            case 8:
                yazi+="sekiz";break;
            case 9:
                yazi+="dokuz";break;
        }
        System.out.println("Girilen değerin yazı karşılığı: "+yazi);
    }
}
