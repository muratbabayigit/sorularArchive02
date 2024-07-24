package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        String sonuc="Sayi asal";
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                sonuc="Sayi asal değil";
            }
        }
        System.out.println(sonuc);
    }
}
