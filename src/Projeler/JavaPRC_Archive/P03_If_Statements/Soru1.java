package Projeler.JavaPRC_Archive.P03_If_Statements;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi=scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam katı");
        }
    }
}
