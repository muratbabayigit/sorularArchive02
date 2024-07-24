package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);
        if (karakter>=65 && karakter<=90) System.out.println("Buyuk harf");
        else System.out.println("Buyuk harf degil");
    }
}
