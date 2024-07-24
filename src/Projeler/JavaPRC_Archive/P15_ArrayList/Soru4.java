package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hesaplanacak fibonacci sayısı adedini giriniz");
        int sayi= scan.nextInt();
        System.out.println(fibonacciSayisiHesapla(sayi));
    }

    private static List<Integer> fibonacciSayisiHesapla(int sayi) {
        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int toplam=0;

        toplam=fibonacci.get(0)+fibonacci.get(1);
        for (int i = 0; i < sayi-2; i++) {
            toplam=fibonacci.get(i)+fibonacci.get(i+1);
            fibonacci.add(toplam);
        }
        return fibonacci;
    }
}
