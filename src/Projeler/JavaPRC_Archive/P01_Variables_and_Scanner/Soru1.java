package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi, bir ondalikli sayi ve bir de harf giriniz: ");
        int sayi1=scan.nextInt();
        double sayi2=scan.nextDouble();
        char ch=scan.next().charAt(0);

        System.out.println("Girdiginiz ilk deger "+sayi1+" bir int datadır.\n"+
               "Girdiginiz ikinci deger "+sayi2+" bir double datadır.\n"+
                "Girdiginiz üçüncü deger "+ch+" bir char datadır.");

    }
}
