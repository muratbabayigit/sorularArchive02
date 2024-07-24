package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz:");
        int yas= scan.nextInt();
        if (yas>=65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olmak için çalışmanız gereken yil: "+(65-yas));
    }
}
