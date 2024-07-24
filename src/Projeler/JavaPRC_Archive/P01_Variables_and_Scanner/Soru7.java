package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        int sayi3;
        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.println("Sayilarinizin yer değiştirmiş hali: "+sayi1+" ve "+sayi2+" dir.");
    }
}
