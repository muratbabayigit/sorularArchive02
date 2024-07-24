package Projeler.JavaPRC_Archive.P02_Data_Casting;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);

        System.out.println("Girdiğiniz harften sonraki 3 harf: "+(char)(harf+1)+", "
                +((char)(harf+2))+" ve "+((char)(harf+3))+" dir");
    }
}
