package Projeler.JavaPRC_Archive.P03_If_Statements;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not= scan.nextInt();
        if (not>=50){
            System.out.println("Sinifi Gectin");
        }if (not<50){
            System.out.println("Maalesef kaldin");
        }
    }
}
