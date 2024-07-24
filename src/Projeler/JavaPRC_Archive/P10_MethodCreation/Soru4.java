package Projeler.JavaPRC_Archive.P10_MethodCreation;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bölenleri bulunacak sayi giriniz:");
        int sayi= scan.nextInt();
        System.out.println(pozitifBolenleriBul(sayi));
    }

    private static int pozitifBolenleriBul(int sayi) {
        int sayac=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }
        return sayac;
    }
}
