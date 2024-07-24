package Projeler.JavaPRC_Archive.P03_If_Statements;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);
        if (harf=='o'||harf=='O') System.out.println("Ocak");
        if (harf=='s'||harf=='S') System.out.println("Subat");
        if (harf=='m'||harf=='M') System.out.println("Mart veya Mayıs");
        if (harf=='n'||harf=='N') System.out.println("Nisan");
        if (harf=='h'||harf=='H') System.out.println("Haziran");
        if (harf=='t'||harf=='T') System.out.println("Temmuz");
        if (harf=='a'||harf=='A') System.out.println("Ağustos veya Aralık");
        if (harf=='e'||harf=='E') System.out.println("Eylül veya Ekim");
        if (harf=='k'||harf=='K') System.out.println("Kasım");
    }
}
