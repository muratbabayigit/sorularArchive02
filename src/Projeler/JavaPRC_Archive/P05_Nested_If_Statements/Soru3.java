package Projeler.JavaPRC_Archive.P05_Nested_If_Statements;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            if (sayi%10==0){
                System.out.println("ÇİFT Sayi 10'un tam katı.");
            }else System.out.println("ÇİFT sayi 10'un tam katı değil.");
        }else if (sayi>=0){
            System.out.println("TEK sayi pozitif");
        }else System.out.println("TEK sayi negatif");
    }
}
