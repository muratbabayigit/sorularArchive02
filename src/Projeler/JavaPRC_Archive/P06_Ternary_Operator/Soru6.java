package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi>=0?sayi:-1*sayi);
    }
}
