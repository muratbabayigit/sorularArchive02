package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf=scan.next().charAt(0);

        if (harf>=97 && harf<=122){
            System.out.println( (char)(harf-32));
        }
        else System.out.println(harf);
    }
}
