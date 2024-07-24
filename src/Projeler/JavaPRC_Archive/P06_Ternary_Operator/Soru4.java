package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz:");
        int not=scan.nextInt();
        System.out.println(not>=50 ? "Sınıfı geçtin." : "Maalesef kaldın");
    }
}
