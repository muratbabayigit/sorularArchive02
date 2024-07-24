package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(girilenSayidanKucukFibonacciSayilarinihesapla(sayi));
    }

    private static List<Integer> girilenSayidanKucukFibonacciSayilarinihesapla(int sayi) {
        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int toplam=0;
         for (int i = 1; i <sayi; i++) {
            if (fibonacci.get(fibonacci.size()-1)<sayi){
            toplam+=fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2);
            fibonacci.add(toplam);
            toplam=0;
            }
        }
        return fibonacci;
    }

}
