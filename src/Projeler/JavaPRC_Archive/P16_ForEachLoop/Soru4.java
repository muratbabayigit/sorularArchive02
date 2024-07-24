package Projeler.JavaPRC_Archive.P16_ForEachLoop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Bir harf giriniz");
        String harf= scan.nextLine();

        String[] cumleArr=cumle.split("");
        int sayac=0;
        for (String each:cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Harf cümlede kullanılmamış");
        }else System.out.println(harf+" harfi cumlede "+sayac+" kez kullanılmış");
    }
}
