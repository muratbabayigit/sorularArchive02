package Projeler.JavaPRC_Archive.P03_If_Statements;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi=scan.nextInt();
        if (sayi%5==0) {
            System.out.println("Bes ile bölünebilen sayi");
            if (sayi % 3 == 0) {
                System.out.println("Üç ile bölünebilen sayi");
            }
        }
    }
}
