package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru2_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg ve boyunuzu cm olarak giriniz: ");
        int kilo= scan.nextInt();
        int boy= scan.nextInt();
        int vki=kilo*10000/(boy*boy);
        if (vki>=30) System.out.println("Obez");
        else if (vki>=25) System.out.println("Kilolu");
        else if (vki>=20) System.out.println("Normal");
        else System.out.println("Zayif");
    }
}
