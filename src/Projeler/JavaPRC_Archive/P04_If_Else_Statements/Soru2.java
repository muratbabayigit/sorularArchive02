package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not= scan.nextInt();
        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else {
            System.out.println("Maalesef kaldin");
        }
    }
}
