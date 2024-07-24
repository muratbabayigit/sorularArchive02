package Projeler.JavaPRC_Archive.P05_Nested_If_Statements;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyet E/K ve yas giriniz: ");
        char cinsiyet=scan.next().charAt(0);
        int yas=scan.nextInt();

        if (cinsiyet=='E'||cinsiyet=='e'){
            if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak için "+(65-yas)+" yıl çalışmalısın");
        } else if (cinsiyet=='K'||cinsiyet=='k') {
            if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak için "+(60-yas)+" yıl çalışmalısın");
        }else System.out.println("Yanlış giriş yaptiniz");
    }
}
