package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Başlangıç değeri giriniz:");
        int baslangic= scan.nextInt();
        System.out.println("Bitiş değeri giriniz:");
        int bitis=scan.nextInt();
        int toplam=0;
        if (bitis<baslangic)
        {System.out.println("Başlangıç değeri bitiş değerinden küçük olmamalıdır.");}
        else {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;

            }
            System.out.println("Girilen sayilarin toplami: " + toplam);
        }
    }
}
