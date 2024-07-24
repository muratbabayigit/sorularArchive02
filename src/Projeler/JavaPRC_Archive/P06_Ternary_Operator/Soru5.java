package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İki sayi giriniz:");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println(sayi1<sayi2 ? sayi1 :sayi2);
    }
}
