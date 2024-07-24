package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scan.nextInt();

        System.out.println((sayi % 5 == 0 ? "girilen sayi 5'in tam kati" : sayi));
    }
}
