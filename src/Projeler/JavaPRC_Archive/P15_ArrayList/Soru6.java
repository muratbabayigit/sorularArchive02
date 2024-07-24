package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Litfen pozitif böleni aranacak tam sayı giriniz");
        int sayi= scan.nextInt();

        System.out.println(pozitifBolerleriBul(sayi));
    }
    public static List<Integer> pozitifBolerleriBul(int sayi){
        List<Integer> bolenList=new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                bolenList.add(i);
            }
        }
        return bolenList;
    }

}
