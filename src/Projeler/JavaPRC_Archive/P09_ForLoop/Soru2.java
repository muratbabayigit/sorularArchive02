package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int girilenSayi= scan.nextInt();
        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
