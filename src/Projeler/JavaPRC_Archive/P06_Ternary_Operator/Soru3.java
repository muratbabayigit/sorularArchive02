package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char karakter=scan.next().charAt(0);

        System.out.println((karakter>=97 && karakter<=122)? (char)(karakter-32) : karakter);
    }
}
